package test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import config.PropertiesFile;

public class FirstSeleniumTest {
	
	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
		//setBrowser();
		PropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
		PropertiesFile.writePropertiesFile();
		
	}
	
	public static void setBrowser(){
		browser="Chrome";
	}
	
	
	public static void setBrowserConfig(){
		String projectLocation= System.getProperty("user.dir");
		
		if(browser.contains("Chrome")){
		System.setProperty("webdriver.chrome.driver", projectLocation+"\\lib\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		
		if(browser.contains("Firefox")){
		System.setProperty("webdriver.firefox.driver", projectLocation+"\\lib\\Drivers\\firefoxdriver.exe");
		driver=new FirefoxDriver();
		}
	}
	
	public static void runTest(){
		
		driver.get("https://www.google.com/");
		driver.close();
		
	}
}
