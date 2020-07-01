//package com.ryder.online.utility;
//
//import jxl.Sheet;
//import jxl.Workbook;
//import jxl.read.biff.BiffException;
//import jxl.write.WritableCellFormat;
//import jxl.write.WritableFont;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.poi.hssf.util.HSSFColor;
//import org.apache.poi.ss.usermodel.CellStyle;
//import org.apache.poi.ss.usermodel.Font;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import com.ryder.online.helper.PageObject.PageBase;
//
//
//
//public class XlsData extends PageBase {
//	private Workbook workbook;
//	private XSSFWorkbook workbk;
//
//	public XlsData() {
//	}
//
//	/**
//	 * Opens an xls workbook
//	 * 
//	 * @param filename
//	 */
//	public Workbook openWorkbook(String filename) {
//		try {
//			// System.out.println(new URI(filename));
//			File f = new File(filename);
//			// InputStream f = new FileInputStream(filename);
//			return workbook = Workbook.getWorkbook(f);
//		} catch (BiffException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return null;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			// System.out.println("The file not found: " + e.getMessage());
//			return null;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return null;
//		}
//	}
//
//	/**
//	 * Opens an xls workbook
//	 * 
//	 * @param stream
//	 */
//	public Workbook openWorkbook(InputStream stream) {
//		try {
//			// System.out.println(new URI(filename));
//			// File f = new File(filename);
//			// InputStream f = new FileInputStream(filename);
//			return workbook = Workbook.getWorkbook(stream);
//		} catch (BiffException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return null;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			// System.out.println("The file not found: " + e.getMessage());
//			return null;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return null;
//		}
//	}
//
//	// public String[][] parseXLSSheet(String filename, int sheetNumber)
//	public String[][] parseXLSSheet(String filename, String sheetName) {
//		openWorkbook(filename);
//		// Sheet sheet = workbook.getSheet(sheetNumber);
//		Sheet sheet = workbook.getSheet(sheetName);
//		int rows = sheet.getRows();
//		int cols = sheet.getColumns();
//		String[][] data = new String[rows][cols];
//		// for each row
//		for (int row = 0; row < rows; row++) {
//			for (int col = 0; col < cols; col++) {
//				// We are commenting this line to get right row count
//				// and ignoring null row values
//				// data[row][col] = sheet.getCell(col,row).getContents();
//				if (sheet.getCell(col, row).getContents().trim().length() >= 1
//						&& sheet.getCell(col, row).getContents() != null) {
//					data[row][col] = sheet.getCell(col, row).getContents();
//				}
//			}
//		}
//
//		closeWorkbook();
//
//		return data;
//	}
//	
//	//Check if the file already exists and then delete
//	public void checkAndDeleteExistingXLSXFile() {
//		try {		
//		
//				String fileName ="BankStatement_Bank Statement Report";
//				String home = System.getProperty("user.home");
//				File file = new File(home+"/Downloads/" + fileName + ".xlsx");
//				//System.out.println("User Directory  "+userDir);
//				if(file.exists()) {
//					
//					se.log().logTestStep("........Existing XLSX file is present");
//					file.delete();
//					se.log().logTestStep("........Existing XLSX file is now deleted");
//				
//					}
//				else {
//					se.log().logTestStep("........Existing XLSX file couldn't be found");
//					}
//		}
//		catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//				
//		}
//		
//	}
//	/**
//	 * 
//	 * @param filename
//	 * @param sheetName
//	 * @return
//	 */
//	public List<Map<String, String>> getTestEnvironmentDetails(String sRunApplicationType) {
//		try {
//			int ZERO = 0;
//
//			// Columns defined in ConfigurationFile.xls in EnvData Sheet
//			int ENV_APPLICATION_TYPE = 1;
//			int ENV_TEST_ENVIRONMENT = 2;
//			int ENV_EXECUTION_STATUS = 3;
//			int ENV_LOGIN_ID = 4;
//			int ENV_PASSWORD = 5;
//			int ENV_APP_ADDRESS = 6;
//
//			// Columns defined in ConfigurationFile.xls in AppLinks Sheet
//			int APP_TEST_ENVIRONMENT = 0;
//			int APP_APP_ADDRESS = 1;
//
//			String sExpString = "YES";
//
//			List<Map<String, String>> table = new ArrayList<Map<String, String>>();
//			HashMap<String, String> rowMap = null;
//			List<String> firstRow = new ArrayList<String>();
//
//			XlsData xlsdata = new XlsData();
//			String[][] envdata;
//			String[][] appdata = null;
//			String[][] retdata = null;
//			retdata = new String[1][7];
//
//			String sFileName = "C:\\hilltop\\trunk\\resources\\ConfigurationFile.xls";
//			String sEnvSheetName = "EnvData";
//			String sAppSheetName = "AppLinks";
//			envdata = parseXLSSheet(sFileName, sEnvSheetName);
//			appdata = parseXLSSheet(sFileName, sAppSheetName);
//
//			if (envdata.length != appdata.length) {
//				System.out.println(
//						"Please define Test Config details all environments between EnvData and AppLinks data sheets. The number of rows should be the same.");
//				return (null);
//			}
//			int iFound = 0;
//			int iDataRow = 0;
//			for (int row = 1; row < envdata.length; row++) {
//				if (envdata[row][ENV_APPLICATION_TYPE].equalsIgnoreCase(sRunApplicationType)) {
//					if (envdata[row][ENV_EXECUTION_STATUS].equalsIgnoreCase(sExpString)) {
//						iFound++;
//						iDataRow = row;
//					}
//				}
//			}
//
//			if (iFound == ZERO) {
//				System.out.println("No Environment is configured for " + sRunApplicationType
//						+ " execution in Test Configuration file.");
//				return (null);
//			} else if (iFound > 1) {
//				System.out.println("Please set 'YES' for only one Test environment...");
//				return (null);
//			} else {
//				if (!envdata[iDataRow][ENV_TEST_ENVIRONMENT]
//						.equalsIgnoreCase(appdata[iDataRow][APP_TEST_ENVIRONMENT])) {
//					System.out.println(
//							"Environment Name does not match. Please maintain the same order of environments between EnvData and AppLinks Sheets...");
//					return (null);
//				} else {
//					rowMap = new HashMap<String, String>();
//					rowMap.put(envdata[ZERO][ENV_TEST_ENVIRONMENT], envdata[iDataRow][ENV_TEST_ENVIRONMENT]);
//					rowMap.put(envdata[ZERO][ENV_EXECUTION_STATUS], envdata[iDataRow][ENV_EXECUTION_STATUS]);
//					rowMap.put(envdata[ZERO][ENV_LOGIN_ID], envdata[iDataRow][ENV_LOGIN_ID]);
//					rowMap.put(envdata[ZERO][ENV_PASSWORD], envdata[iDataRow][ENV_PASSWORD]);
//					rowMap.put(appdata[ZERO][APP_APP_ADDRESS], appdata[iDataRow][APP_APP_ADDRESS]);
//					table.add(rowMap);
//					return table;
//
//				}
//			}
//		} catch (Exception e) {
//			System.out.println("getTestEnvironmentDetails failed...");
//			return (null);
//			// TODO Auto-generated catch block
//
//		}
//	}
//
//	// public String[][] parseXLSSheet(InputStream stream, int sheetNumber)
//	public String[][] parseXLSSheet(InputStream stream, String sheetName) {
//		openWorkbook(stream);
//		// Sheet sheet = workbook.getSheet(sheetNumber);
//		Sheet sheet = workbook.getSheet(sheetName);
//		int rows = sheet.getRows();
//		int cols = sheet.getColumns();
//		String[][] data = new String[rows][cols];
//		// for each row
//
//		for (int row = 0; row < rows; row++) {
//			for (int col = 0; col < cols; col++) {
//				// We are commenting this line to get right row count
//				// and ignoring null row values
//				// data[row][col] = sheet.getCell(col,row).getContents();
//				if (sheet.getCell(col, row).getContents().trim().length() >= 1
//						&& sheet.getCell(col, row).getContents() != null) {
//					data[row][col] = sheet.getCell(col, row).getContents();
//				}
//			}
//		}
//
//		closeWorkbook();
//
//		return data;
//	}
//
//	//Check if the file already exists and then delete
//		public void checkAndDeleteExistingXLSXFile(String fileName) {
//			try {		
//			
//					
//				String home = System.getProperty("user.home");
//				File filePath = new File(home+"/Downloads/" + fileName + ".xlsx");
//					//File sfile = getFilePath(fileName);
//					
//					
//					if(filePath.exists()) {
//						
//						se.log().logTestStep("........Existing XLSX file is present");
//						filePath.delete();
//						se.log().logTestStep("........Existing XLSX file is now deleted");
//					
//						}
//					else {
//						se.log().logTestStep("........Existing XLSX file couldn't be found");
//						}
//			}
//			catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//					
//			}
//			
//	}
//	/**
//	 * Closes the workbook
//	 */
//	public void closeWorkbook() {
//		workbook.close();
//	}
//
//	/**
//	 * Opens an xlsx workbook
//	 * 
//	 * @param stream
//	 */
//	public XSSFWorkbook openWorkbk(String filename) {
//		try {
//			// System.out.println(new URI(filename));
//			File f = new File(filename);
//			FileInputStream file = new FileInputStream(f);
//			// Get the workbook instance for XLS file
//			return workbk = new XSSFWorkbook(file);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			// System.out.println("The file not found: " + e.getMessage());
//			return null;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return null;
//		}
//	}
//
//	public List<Map<String, String>> parseXLSXSheet(String filename, String sheetName) {
//		openWorkbk(filename);
//		// System.out.println("Inside parseXLSXSheet");
//		XSSFSheet sheet = workbk.getSheet(sheetName);
//		XSSFRow row = null;
//		XSSFCell cell = null;
//		List<Map<String, String>> table = new ArrayList<Map<String, String>>();
//		HashMap<String, String> rowMap = null;
//		List<String> firstRow = new ArrayList<String>();
//
//		int i = 0;
//		for (int rownum = sheet.getFirstRowNum(); rownum <= sheet.getLastRowNum(); rownum++) {
//			row = sheet.getRow(rownum);
//			if (row != null) {
//				rowMap = new HashMap<String, String>();
//				int j = 0;
//				for (int cellnum = row.getFirstCellNum(); cellnum < row.getLastCellNum(); cellnum++) {
//					cell = row.getCell(cellnum);
//					/*
//					 * if(cell.getStringCellValue() == null ||
//					 * cell.getRawValue() == null){ continue; }else{
//					 */
//					if (rownum == sheet.getFirstRowNum()) {
//						firstRow.add(cell.getStringCellValue());
//					} else {
//						try {
//							if (cell.getStringCellValue().length() > 0) {
//								rowMap.put(firstRow.get(j), cell.getStringCellValue());
//							}
//						} catch (Exception e) {
//
//						}
//					}
//					j++;
//				}
//			}
//			if (rownum != sheet.getFirstRowNum())
//				table.add(rowMap);
//
//			i++;
//		}
//
//		return table;
//	}
//
//	/**
//	 * Gets specific rows from the Excel with sFilterName == sFilterValue
//	 * 
//	 * @param filename
//	 * @param sheetName
//	 * @param sFilterName
//	 * @param sFilterValue
//	 * @return
//	 */
//	public List<Map<String, String>> parseXLSXSheet(String filename, String sheetName, String sFilterName,
//			String sFilterValue) {
//		openWorkbk(filename);
//		XSSFSheet sheet = workbk.getSheet(sheetName);
//		XSSFRow row = null;
//		XSSFCell cell = null;
//		List<Map<String, String>> table = new ArrayList<Map<String, String>>();
//		HashMap<String, String> rowMap = null;
//		List<String> firstRow = new ArrayList<String>();
//
//		for (int rownum = sheet.getFirstRowNum(); rownum <= sheet.getLastRowNum(); rownum++) {
//			row = sheet.getRow(rownum);
//			if (row != null) {
//				rowMap = new HashMap<String, String>();
//				int j = 0;
//
//				for (int cellnum = row.getFirstCellNum(); cellnum < row.getLastCellNum(); cellnum++) {
//					cell = row.getCell(cellnum);
//					if (rownum == sheet.getFirstRowNum()) {
//						firstRow.add(cell.getStringCellValue());
//					} else {
//						// System.out.println(row.getCell(0));
//						// System.out.println(row.getCell(0).toString().equalsIgnoreCase(sFilterValue));
//						if (row.getCell(0).toString().equalsIgnoreCase(sFilterValue) && cell != null) {
//							rowMap.put(firstRow.get(j), cell.getStringCellValue());
//							// System.out.println(firstRow.get(j));
//							// System.out.println(cell.getStringCellValue());
//						}
//					}
//					j++;
//				}
//			}
//			if (rownum != sheet.getFirstRowNum() && !rowMap.isEmpty()
//					&& rowMap.get(sFilterName).toString().equals(sFilterValue))
//				table.add(rowMap);
//		}
//
//		return table;
//	}
//
//	/**
//	 * Description: This method writes actual requirement values to excel file
//	 * 
//	 * @param filename
//	 * @param sheetName
//	 * @param iIterationId
//	 * @param sColumnName
//	 * @param sActValue
//	 * @param sResult
//	 */
//
//	public void writeToXLSSheet(String filename, String sheetName, int iIterationId, String sColumnName,
//			String sActValue, String sResult, String sStatus, String sApplicationNo, String sContractNo) {
//
//		WritableFont cellFont = null;
//		WritableCellFormat cellFormat = null;
//
//		try {
//			InputStream inp = new FileInputStream(filename);
//
//			org.apache.poi.ss.usermodel.Cell cellheader, cellactvalue, cellexetime;
//			org.apache.poi.ss.usermodel.Workbook wb = WorkbookFactory.create(inp);
//			org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheetAt(0);
//
//			CellStyle style = wb.createCellStyle();
//			Font font = wb.createFont();
//
//			Row rowheader = sheet.getRow(0);
//			Row rowactvalue;
//
//			int iTotalCols = rowheader.getLastCellNum();
//
//			if (sResult.equalsIgnoreCase("PASS")) {
//				// Create a new font and alter it.
//				font.setFontHeightInPoints((short) 10);
//				font.setFontName("Tahoma");
//				font.setItalic(false);
//				font.getBoldweight();
//				font.setColor(HSSFColor.GREEN.index);
//			} else if (sResult.equalsIgnoreCase("FAIL")) {
//				font.setFontHeightInPoints((short) 10);
//				font.setFontName("Tahoma");
//				font.setItalic(false);
//				font.getBoldweight();
//				font.setColor(HSSFColor.RED.index);
//
//			}
//
//			// Set the style for the Result PASS/FAIL declaration
//			style.setFont(font);
//
//			for (int iCol = 0; iCol < iTotalCols; iCol++) {
//				cellheader = rowheader.getCell(iCol);
//
//				if (cellheader.getStringCellValue().equals(sColumnName)) {
//
//					// Get the row for entering the actual requirement value
//					rowactvalue = sheet.getRow(iIterationId + 1);
//
//					cellactvalue = rowactvalue.getCell(iCol);
//					rowactvalue.getCell(iCol).setCellStyle(style);
//					cellactvalue.setCellValue(sActValue + " - " + sStatus);
//
//					// Get current system time
//					Calendar calendar = Calendar.getInstance();
//					java.util.Date now = calendar.getTime();
//
//					// Write the result to excel file
//					String sPrevResult = rowactvalue.getCell(iTotalCols - 2).getStringCellValue();
//					rowactvalue.getCell(iTotalCols - 2).setCellStyle(style);
//
//					if (!sPrevResult.equalsIgnoreCase("FAIL")) {
//						cellactvalue = rowactvalue.getCell(iTotalCols - 4);
//						rowactvalue.getCell(iTotalCols - 4).setCellStyle(style);
//						rowactvalue.getCell(iTotalCols - 4).setCellValue(sResult);
//					}
//
//					cellactvalue = rowactvalue.getCell(iTotalCols - 3);
//					rowactvalue.getCell(iTotalCols - 3).setCellStyle(style);
//					// save Contract Number
//					rowactvalue.getCell(iTotalCols - 3).setCellValue(sContractNo);
//
//					// save Applciation Number
//					cellactvalue = rowactvalue.getCell(iTotalCols - 2);
//					rowactvalue.getCell(iTotalCols - 2).setCellStyle(style);
//					rowactvalue.getCell(iTotalCols - 2).setCellValue(sApplicationNo);
//
//					// Write the applciation status
//					// rowactvalue.getCell(iTotalCols-2).setCellValue(sStatus);
//
//					// Enter "Processed" in first column
//					cellactvalue = rowactvalue.getCell(0);
//					rowactvalue.getCell(0).setCellStyle(style);
//					rowactvalue.getCell(0).setCellValue("Processed");
//
//					// Cell firstCell = rowactvalue.getCell(0);
//					// firstCell.setCellValue("Processed");
//
//					// save execution time
//					cellactvalue = rowactvalue.getCell(iTotalCols - 1);
//					rowactvalue.getCell(iTotalCols - 1).setCellStyle(style);
//					rowactvalue.getCell(iTotalCols - 1).setCellValue(now);
//					break;
//				}
//			}
//
//			// Write the output to a file
//			FileOutputStream fileOut = new FileOutputStream(filename);
//			wb.write(fileOut);
//			fileOut.close();
//
//		} catch (Exception e) {
//			se.verify().verifyEquals("Failed to write data back to excel ", true, false);
//		}
//	}
//
//	/**
//	 * Description: This method writes application, contract and ssn numbers back to excel
//	 * 
//	 * @param filename
//	 * @param sheetName
//	 * @param iIterationId
//	 * @param sColumnName
//	 * @param sActValue
//	 * @param sResult
//	 */
//
//	public void writeAppConToXLSheet(String filename,String sheetName, int iIterationId, String sInvoiceName) {
//
//		try {
//				
//			InputStream inp = new FileInputStream(filename);
//
//			org.apache.poi.ss.usermodel.Cell cellheader, cellactvalue, cellexetime;
//			org.apache.poi.ss.usermodel.Workbook wb = WorkbookFactory.create(inp);
//			org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet(sheetName);
//
//			CellStyle style = wb.createCellStyle();
//			Font font = wb.createFont();
//
//			Row rowheader = sheet.getRow(0);
//			Row rowactvalue;
//
//			int iTotalCols = rowheader.getLastCellNum();
//
//			style.setFont(font);
//
//			// Get the row for entering the actual requirement value
//			rowactvalue = sheet.getRow(iIterationId + 1);
//
//			// Write the result to excel file
//			String sPrevResult = rowactvalue.getCell(iTotalCols - 2).getStringCellValue();
//			rowactvalue.getCell(iTotalCols - 2).setCellStyle(style);
//			
//			// save Contract Number
//			cellactvalue = rowactvalue.getCell(iTotalCols - 1);
//			rowactvalue.getCell(iTotalCols - 1).setCellStyle(style);
//			rowactvalue.getCell(iTotalCols - 1).setCellValue(sInvoiceName);
//
////			// save Applciation Number
////			cellactvalue = rowactvalue.getCell(iTotalCols - 2);
////			rowactvalue.getCell(iTotalCols - 2).setCellStyle(style);
////			rowactvalue.getCell(iTotalCols - 2).setCellValue(sInvoiceNumber);
//		
//
//			// Write the output to a file
//			FileOutputStream fileOut = new FileOutputStream(filename);
//			wb.write(fileOut);
//			fileOut.close();
//
//		} catch (Exception e) {
//			se.verify().verifyEquals("Failed to write application no to excel ", true, false);
//		}
//	}
//	
//	/**
//	 * Description: This method writes email id and iteration id back to excel.
//	 * 
//	 * @param filename
//	 * @param sheetName
//	 * @param iIterationId
//	 * @param sEmail
//	 * @param sIterationNo
//	 */
//	public void writeEmailToXLSheet(String filename,String sheetName, int iIterationId, String sEmail, String sIterationNo) {
//
//		try {
//				
//			InputStream inp = new FileInputStream(filename);
//
//			org.apache.poi.ss.usermodel.Cell cellheader, cellactvalue, cellexetime;
//			org.apache.poi.ss.usermodel.Workbook wb = WorkbookFactory.create(inp);
//			org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheetAt(0);
//
//			CellStyle style = wb.createCellStyle();
//			Font font = wb.createFont();
//
//			Row rowheader = sheet.getRow(0);
//			Row rowactvalue;
//
//			int iTotalCols = rowheader.getLastCellNum();
//
//			style.setFont(font);
//
//			// Get the row for entering the actual requirement value
//			rowactvalue = sheet.getRow(iIterationId + 1);
//
//			// Write the result to excel file
//			String sPrevResult = rowactvalue.getCell(iTotalCols - 2).getStringCellValue();
//			rowactvalue.getCell(iTotalCols - 2).setCellStyle(style);
//			
//			// save Email Number
//			cellactvalue = rowactvalue.getCell(iTotalCols - 4);
//			rowactvalue.getCell(iTotalCols - 4).setCellStyle(style);
//			rowactvalue.getCell(iTotalCols - 4).setCellValue(sEmail);
//
//			// save Iteration Number
//			cellactvalue = rowactvalue.getCell(iTotalCols - 5);
//			rowactvalue.getCell(iTotalCols - 5).setCellStyle(style);
//			rowactvalue.getCell(iTotalCols - 5).setCellValue(sIterationNo);
//			
//
//			// Write the output to a file
//			FileOutputStream fileOut = new FileOutputStream(filename);
//			wb.write(fileOut);
//			fileOut.close();
//
//		} catch (Exception e) {
//			se.verify().verifyEquals("Failed to write application no to excel ", true, false);
//		}
//	}
//
//}
