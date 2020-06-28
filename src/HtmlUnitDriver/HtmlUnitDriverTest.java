package HtmlUnitDriver;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HtmlUnitDriverTest {
	
	public static void main(String[] args) {
		
		HtmlUnitDriver driver= new HtmlUnitDriver(BrowserVersion.CHROME);
		driver.get("https://www.google.com");
		System.out.println("Title is: "+driver.getTitle());
		
	//to check browser	version
	//	WebClient webClient=(WebClient) get(driver, "webclient");
		
		driver.close();
	}

}
