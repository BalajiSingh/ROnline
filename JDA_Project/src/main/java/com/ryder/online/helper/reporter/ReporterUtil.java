/*package com.cucumber.uvs.ecom.helper.reporter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.log4j.Logger;

import com.cucumber.listener.Reporter;
import com.cucumber.uvs.ecom.configreader.FileReaderManager;
import com.cucumber.uvs.ecom.helper.Logger.LoggerHelper;

*//**
 * @author Madhu Golla
 *
 *02/07/2K19
 *
 *//*

public class ReporterUtil {
	private final static Logger log = LoggerHelper.getLogger(ReporterUtil.class);
	private final static String ARCHIVE_FOLDER_NAME = "Archive";
	private final static String REPORT_FOLDER_NAME = "Automation_Report";
	private final static String EXTENT_CONFIG_PATH = FileReaderManager.getInstance().getConfigReader()
			.extentConfigFilePath();
	private final static String REPORT_FILE_PATH = FileReaderManager.getInstance().getConfigReader()
			.getReportFilePath();

	*//**
	 * Returns a unique text which is the string of the current datetime in the
	 * FrameworkCoreConstant.TIMESTAMP_FORMAT
	 *
	 * @return unique generated name.
	 *//*
	public static String getCurrentDateTimeAsString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss_z");
		Date now = new Date();
		String uniqueText = dateFormat.format(now);
		log.info("Unique name generated");
		return (uniqueText);
	}

	*//**
	 * Archive the previous report.
	 *//*
	private static void archiveReport() {
		StringBuilder archiveFile = new StringBuilder(getCurrentDateTimeAsString());
		Path archiveDir = Paths.get(REPORT_FILE_PATH).resolve(ARCHIVE_FOLDER_NAME);
		Path reportBaseDir = Paths.get(REPORT_FILE_PATH).resolve(REPORT_FOLDER_NAME);
		Path archivePath = archiveDir.resolve(archiveFile.append(".zip").toString());

		archivePath.getParent().toFile().mkdirs();

		try {
			zipFolder(reportBaseDir, archivePath);
		} catch (Exception archiveException) {
			log.error(archiveException.getMessage());
		}
	}

	
	 * Zip the report created.
	 
	private static void zipFolder(final Path dataPath, Path zipPath) throws IOException {
		final ZipOutputStream zipOutput = new ZipOutputStream(new FileOutputStream(zipPath.toFile()));
		try {
			Files.walkFileTree(dataPath, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) throws IOException {
					zipOutput.putNextEntry(new ZipEntry(dataPath.relativize(file).toString()));
					Files.copy(file, zipOutput);
					zipOutput.closeEntry();
					return FileVisitResult.CONTINUE;
				}
			});
		} finally {
			zipOutput.close();
		}
	}

	public static void createExtentReport() {
		archiveReport();
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + EXTENT_CONFIG_PATH));

		Reporter.setSystemInfo("User", System.getProperty("user.name"));
		Reporter.setSystemInfo("OS", "Windows 10");
		Reporter.setSystemInfo("Product", "UVS E-commerce");
		Reporter.setSystemInfo("Organization", "Ryder Systems Inc");
		
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}
*/

package com.ryder.online.helper.reporter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.log4j.Logger;

import com.ryder.online.configreader.FileReaderManager;
import com.ryder.online.helper.Logger.LoggerHelper;

/**
 * @author Madhu Golla
 *
 *02/07/2K19
 *
 */

public class ReporterUtil {
	private final static Logger log = LoggerHelper.getLogger(ReporterUtil.class);
	private final static String ARCHIVE_FOLDER_NAME = "Archive";
	private final static String REPORT_FOLDER_NAME = "Automation_Report";
	private final static String REPORT_FILE_PATH_1 = System.getProperty("user.dir");

	/**
	 * Returns a unique text which is the string of the current datetime in the
	 * FrameworkCoreConstant.TIMESTAMP_FORMAT
	 *
	 * @return unique generated name.
	 */
	public static String getCurrentDateTimeAsString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss_z");
		Date now = new Date();
		String uniqueText = dateFormat.format(now);
		log.info("Unique name generated");
		return (uniqueText);
	}

	/**
	 * Archive the previous report.
	 */
	public static void archiveReport() {
		StringBuilder archiveFile = new StringBuilder(getCurrentDateTimeAsString());
		Path archiveDir = Paths.get(REPORT_FILE_PATH_1).resolve(ARCHIVE_FOLDER_NAME);
		Path reportBaseDir = Paths.get(REPORT_FILE_PATH_1).resolve(REPORT_FOLDER_NAME);
		Path archivePath = archiveDir.resolve(archiveFile.append(".zip").toString());

		archivePath.getParent().toFile().mkdirs();

		try {
			zipFolder(reportBaseDir, archivePath);
		} catch (Exception archiveException) {
			log.error(archiveException.getMessage());
		}
	}

	/*
	 * Zip the report created.
	 */
	private static void zipFolder(final Path dataPath, Path zipPath) throws IOException {
		final ZipOutputStream zipOutput = new ZipOutputStream(new FileOutputStream(zipPath.toFile()));
		try {
			Files.walkFileTree(dataPath, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) throws IOException {
					zipOutput.putNextEntry(new ZipEntry(dataPath.relativize(file).toString()));
					Files.copy(file, zipOutput);
					zipOutput.closeEntry();
					return FileVisitResult.CONTINUE;
				}
			});
		} finally {
			zipOutput.close();
		}
	}

}

