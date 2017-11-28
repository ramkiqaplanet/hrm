package lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class globel 
{
//veribles info
WebDriver d1;
public void launchBro()
{
	System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver.exe");
	d1=new ChromeDriver();
}

public String UN="qaplanet1";
public String PW="lab1";

}
