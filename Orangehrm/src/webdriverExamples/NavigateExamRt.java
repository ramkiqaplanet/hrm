package webdriverExamples;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateExamRt 
{
public static void main(String[] args) throws Exception 
{
	System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver Brow=new ChromeDriver();
	//openapplication
	Brow.navigate().to("http://www.calculator.net/");
	Thread.sleep(2000);
	//verify home page
	if(Brow.getTitle().equals("Calculator.net: Free Online Calculators - Math, Health, Financial, Science"))
	{
	System.out.println("home page is dosplaced");
	System.out.println("1");
	}
	//click on loan calucator
	Brow.findElement(By.linkText("Loan Calculator")).click();
	Thread.sleep(2000);
	//verify loan calucator page
	if(Brow.getTitle().equals("Loan Calculator"))
	{
		System.out.println("Loan Calculator page displaced");
	}
	//go back to Previous page
	Brow.navigate().back();
	Thread.sleep(2000);
	//verify home page
	if(Brow.getTitle().equals("Calculator.net: Free Online Calculators - Math, Health, Financial, Science"))
	{
		System.out.println("home page is dosplaced");
	}
	//go to next page
	Brow.navigate().forward();
	Thread.sleep(2000);
	//verify loan calucator page(forword)
	if(Brow.getTitle().equals("Loan Calculator"))
	{
		System.out.println("Loan Calculator page displaced");
	}
	Brow.close();
	Brow.quit();
}
}
