package com.ryder.online.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.ryder.online.configreader.FileReaderManager;
import com.ryder.online.configuration.browser.BrowserType;
import com.ryder.online.helper.InitializeWebDrive;
import com.ryder.online.helper.Logger.LoggerHelper;
import com.ryder.online.pages.pageactions.TransportationManagerHomePageActions;
public class WriteToExcel {
	
	private final Logger oLog = LoggerHelper.getLogger(TransportationManagerHomePageActions.class);
//	InitializeWebDrive IWD = new InitializeWebDrive(); 
	
	public void exportDatatoExcel(String filename, String SheetName, int iterationId, String InvoiceName) {

		String sFileName;
//		XlsData objXlsData = new XlsData();
		
		if (FileReaderManager.getInstance().getConfigReader().getBrowser() == BrowserType.CHROME
				|| FileReaderManager.getInstance().getConfigReader().getBrowser() == BrowserType.IE) {
			sFileName = System.getProperty("user.dir") + "\\src\\test\\resources\\ExcelDataSource\\" + filename;
		} else {
			System.out.println("THIS SCRIPT IS RUNNING IN AZURE DEV OPS ");
			sFileName = "../../src/test/resources/ExcelDataSource/" + filename;
		}


		writeAppConToXLSheet(sFileName, SheetName, iterationId, InvoiceName);

	}
	
	
	
	public void writeAppConToXLSheet(String filename,String sheetName, int iIterationId, String sInvoiceName) {

		try {
				
			InputStream inp = new FileInputStream(filename);

			org.apache.poi.ss.usermodel.Cell cellheader, cellactvalue, cellexetime;
			org.apache.poi.ss.usermodel.Workbook wb = WorkbookFactory.create(inp);
			org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet(sheetName);

			CellStyle style = wb.createCellStyle();
			Font font = wb.createFont();

			Row rowheader = sheet.getRow(0);
			Row rowactvalue;

			int iTotalCols = rowheader.getLastCellNum();

			style.setFont(font);

			// Get the row for entering the actual requirement value
			rowactvalue = sheet.getRow(iIterationId + 1);

			// Write the result to excel file
			String sPrevResult = rowactvalue.getCell(iTotalCols - 2).getStringCellValue();
			rowactvalue.getCell(iTotalCols - 2).setCellStyle(style);
			
			// save Contract Number
			cellactvalue = rowactvalue.getCell(iTotalCols - 1);
			rowactvalue.getCell(iTotalCols - 1).setCellStyle(style);
			rowactvalue.getCell(iTotalCols - 1).setCellValue(sInvoiceName);

//			// save Applciation Number
//			cellactvalue = rowactvalue.getCell(iTotalCols - 2);
//			rowactvalue.getCell(iTotalCols - 2).setCellStyle(style);
//			rowactvalue.getCell(iTotalCols - 2).setCellValue(sInvoiceNumber);
		

			// Write the output to a file
			FileOutputStream fileOut = new FileOutputStream(filename);
			wb.write(fileOut);
			fileOut.close();

		} catch (Exception e) {
			oLog.info("Failed to write application no to excel ");
		}
	}
}
