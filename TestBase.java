package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import helpers.RegisterHelper;
import pageObject.RegisterPage;

public class TestBase {
	public static WebDriver driver;
	
	public static RegisterPage rp;
	public static RegisterHelper rh;
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launching Browser.");
        String baseDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\jan2023\\src\\test\\resources\\drivers\\chromedriver_win32 (1)\\\\chromedriver.exe");
		 driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Browser Launched.");
    }
	 @BeforeClass(dependsOnMethods = "launchBrowser")
	    public void initialize(){
	        System.out.println("Initializing classes");
	        rp = new RegisterPage(driver);
	        rh = new RegisterHelper(driver);
	        System.out.println("Initialization successful");
	    }
	 @BeforeClass(dependsOnMethods = "launchBrowser")
	    public void navigateToBaseURL(){
	        System.out.println("Navigating to Base URL");
	        driver.get("https://demo.guru99.com/test/newtours/index.php");
	        System.out.println("Navigation Successful");
	    }
	 @AfterSuite
	    public void closeDriver(){
	        System.out.println("Closing Browser");
	        driver.quit();
	        System.out.println("Browser Closed");
	    }
	}
	
