package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class PeopleSubscribtion {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://subscription.people.com/storefront/subscribe-to-people/site/pe-chop423box0417.html");
	    Driver.findElementByXPath("//*[@id='printOnly']").click();
		// Driver.findElementById("allAccess").click();
		
		Driver.findElementByXPath("//*[@id='billingAddress.firstName']").sendKeys("test");
		Driver.findElementByXPath("//*[@id='billingAddress.lastName']").sendKeys("test");
		Driver.findElementByXPath("//*[@id='billingAddress.street1']").sendKeys("Po box no 1234");
		Driver.findElementByXPath("//*[@id='billingAddress.city']").sendKeys("tampa");
		Select drpState= new Select(Driver.findElementByXPath(".//*[@id='billingAddress.subCountry']"));
		drpState.selectByVisibleText("FL");
		Driver.findElementByXPath("//*[@id='billingAddress.zipPostalCode']").sendKeys("33609");
		Driver.findElementByXPath("//*[@id='billingAddress.email']").sendKeys("soujanya2939@gmail.com");
		Driver.findElementByXPath("//*[@id='standardSubmitButton']/button").click();
	}

}
