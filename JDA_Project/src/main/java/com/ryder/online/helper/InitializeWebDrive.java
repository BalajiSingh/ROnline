package com.ryder.online.helper;

import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

import com.ryder.online.configreader.PropertyFileReader;
import com.ryder.online.configuration.browser.BrowserType;
import com.ryder.online.configuration.browser.ChromeBrowser;
import com.ryder.online.configuration.browser.IExploreBrowser;
import com.ryder.online.exception.NoSutiableDriverFoundException;
import com.ryder.online.helper.Generic.GenericHelper;
import com.ryder.online.helper.Logger.LoggerHelper;
import com.ryder.online.settings.ObjectRepo;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


/**
 * @author Madhu Golla
 *
 *02/05/2K19
 *
 */

public class InitializeWebDrive {

	private Logger oLog = LoggerHelper.getLogger(InitializeWebDrive.class);

	public InitializeWebDrive(PropertyFileReader reader) {
		ObjectRepo.reader = reader;
	}
	
	public BrowserType getBrowser() {
		
		String browse = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest()
				.getParameter("browserName");
		if(browse == null) {
			browse = ObjectRepo.reader.getBrowser().toString();
		}
		System.out.println(browse);
		BrowserType btye = null;

		switch (browse.toLowerCase()) {

		case "chrome":
			btye = BrowserType.CHROME;
			break;
			
		case "firefox":
			btye = BrowserType.FIREFOX;
			break;
			
		case "ie":	
		btye = BrowserType.IE;
		break;
		
		case "headless":
			btye = BrowserType.HEADLESS;
			break;
			
		case "edge":
			btye = BrowserType.EDGE;
			break;
			
		default:
			System.out.println(" Driver Not Found : Reading from Config File");
			btye =  ObjectRepo.reader.getBrowser();
			break;
		}
		
		return btye;
	}

	
	public WebDriver standAloneStepUp(BrowserType bType) throws Exception {
		WebDriver driver;
		
		try {
			oLog.info(bType);

			switch (bType) {

			case CHROME:
				//ChromeBrowser chrome = ChromeBrowser.class.newInstance();
				//WebDriverManager.chromedriver().setup();
				System. setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
				return driver;

			case FIREFOX:
//				FirefoxBrowser firefox = FirefoxBrowser.class.newInstance();
//				WebDriverManager.firefoxdriver().setup();
				System. setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\driver\\geckodriver.exe");
				driver = new FirefoxDriver();
				//driver = new FirefoxDriver(firefox.getFirefoxOptions());
				return driver;

			case HEADLESS:
				ChromeBrowser chrome = ChromeBrowser.class.newInstance();
	            System. setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\driver\\chromedriver.exe");
				driver = new ChromeDriver(chrome.getHeadlessChromeOptions());
				return driver;

			case IE:
				IExploreBrowser iExplore = IExploreBrowser.class.newInstance();
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver(iExplore.getIEOptions());
				return driver;
				
				
			case EDGE:
				System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\driver\\MicrosoftWebDriver.exe");
				driver = new EdgeDriver();
				driver.navigate().to("https://st-usedtrucks.ryder.com");
				return driver;

			default:
				throw new NoSutiableDriverFoundException(" Driver Not Found : " + ObjectRepo.reader.getBrowser());
			}
		} catch (Exception e) {
			oLog.equals(e);
			throw e;
		}
	}
	
	
	@Before({ "not @firefox", "not @chrome", "not @headless", "not @iexplorer", "not @Api", "not @Api1" })
	public void before() throws Exception {
		/*setUpDriver(ObjectRepo.reader.getBrowser());*/
		setUpDriver(getBrowser());
		oLog.info(getBrowser());
	}

	@After({ "not @firefox", "not @chrome", "not @headless", "not @iexplorer", "not @Api", "not @Api1" })
	public void after(Scenario scenario) throws Exception {
		tearDownDriver(scenario);
		oLog.info("");
	}

	@Before(order = 4, value = { "@iexplorer" })
	public void beforeExplorer() throws Exception {
		setUpDriver(BrowserType.IE);
		oLog.info(BrowserType.IE);
	}

	@After(order = 4, value = { "@iexplorer" })
	public void afterExplorer(Scenario scenario) throws Exception {
		tearDownDriver(scenario);
		oLog.info("");
	}

	@Before(order = 3, value = { "@firefox" })
	public void beforeFirefox() throws Exception {
		setUpDriver(BrowserType.FIREFOX);
		oLog.info(BrowserType.FIREFOX);
	}

	@After(order = 3, value = { "@firefox" })
	public void afterFirefox(Scenario scenario) throws Exception {
		tearDownDriver(scenario);
		oLog.info("");
	}

	@Before(order = 2, value = { "@chrome" })
	public void beforeChrome() throws Exception {
		setUpDriver(BrowserType.CHROME);
		oLog.info(BrowserType.CHROME);
	}

	@After(order = 2, value = { "@chrome" })
	public void afterChrome(Scenario scenario) throws Exception {
		tearDownDriver(scenario);
		oLog.info("");
	}
	
	public static void appendToPath(String dir){

        String path = System.getProperty("java.library.path");
        path = dir + ";" + path;
        System.setProperty("java.library.path", path);

        try {

            final Field sysPathsField = ClassLoader.class.getDeclaredField("sys_paths");
            sysPathsField.setAccessible(true);
            sysPathsField.set(null, null);

        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }

    }
	

	public void setUpDriver(BrowserType bType) throws Exception {
		//appendToPath("C:\\Users\\mgolla\\Downloads\\sqljdbc_6.0\\enu\\auth\\x64");
		
		ObjectRepo.driver = standAloneStepUp(bType);
		oLog.debug("InitializeWebDrive : " + ObjectRepo.driver.hashCode());
		ObjectRepo.driver.manage().timeouts().pageLoadTimeout(ObjectRepo.reader.getPageLoadTimeOut(), TimeUnit.SECONDS);
		ObjectRepo.driver.manage().timeouts().implicitlyWait(ObjectRepo.reader.getImplicitWait(), TimeUnit.SECONDS);
		ObjectRepo.driver.manage().window().maximize();

	}

	public void tearDownDriver(Scenario scenario) throws Exception {

		try {
			if (ObjectRepo.driver != null) {

				/*if (scenario.isFailed()) {
					String imagePath = new GenericHelper(ObjectRepo.driver).takeScreenShot(scenario.getName());
					scenario.write(imagePath);
					Reporter.addScreenCaptureFromPath(imagePath);
				}*/
				new GenericHelper(ObjectRepo.driver).takeScreenshot(scenario);
				ObjectRepo.driver.close();
				ObjectRepo.driver.quit();
				ObjectRepo.reader = null;
				ObjectRepo.driver = null;
				oLog.info("Shutting Down the driver");
			}
		} catch (Exception e) {
			oLog.error(e);
			throw e;
		}
	}

}