package demoex;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;

public class Ex_Tc1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	/*driver.get("");*/
	driver.get("http://qaplanet.in/");
	System.out.println("url open");
	/*//back
	driver.navigate().back();
	//click on linked icon */
	driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div[2]/ul/li[3]/a/img")).click();	
	//wait
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Set<String> allwind = driver.getWindowHandles();
	Iterator<String> allwinds = allwind.iterator();
	String parentwind = allwinds.next();
	String chaildwind = allwinds.next();
	//String chaildwind2 = allwinds.next();
	//switch to chailed window
	driver.switchTo().window(chaildwind);
	driver.findElement(By.id("email")).sendKeys("ramenumala01@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Ram@14");
	driver.findElement(By.id("loginbutton")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.id("userNavigationLabel")).click();
	driver.close();
/*	//switch to chaildwind2 window
	driver.switchTo().window(chaildwind2);
	driver.close();*/
	//switch to parentwind
	driver.switchTo().window(parentwind);
	Actions a=new Actions(driver);
	WebElement abot = driver.findElement(By.id("menu-item-7583"));
	a.moveToElement(abot).build().perform();
	driver.findElement(By.linkText("MISSION")).click();
	driver.close();
	
	}

}
