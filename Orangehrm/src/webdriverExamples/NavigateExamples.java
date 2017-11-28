package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
class NavigateExamples 
{

public static void main(String[] args)throws Exception
{
	System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver Brow=new ChromeDriver();
	
			Brow.manage().window().maximize();
			//---------------------------------------------
			Brow.navigate().to("http://www.calculator.net/");
			Thread.sleep(1000);
			//Verify Home Page
			if(Brow.getTitle().equals("Calculator.net: Free Online Calculators - Math, Health, Financial, Science"))
			{
				System.out.println("Calculator page displayed");
			}
			//click on Due date
			Brow.findElement(By.linkText("Due Date")).click();
			Thread.sleep(1000);
			//Verify Home Page
			if(Brow.getTitle().equals("Due Date Calculator"))
			{
				System.out.println("Due Date Calculator page displayed");
			}
			//Go  back to previous page
			Brow.navigate().back();
			Thread.sleep(1000);
			//Verify Home Page
			if(Brow.getTitle().equals("Calculator.net: Free Online Calculators - Math, Health, Financial, Science"))
			{
				System.out.println("Calculator page displayed");
			}
			//Go to next page
			Brow.navigate().forward();
			Thread.sleep(1000);
			//Verify Home Page
			if(Brow.getTitle().equals("Due Date Calculator"))
			{
				System.out.println("Due Date Calculator page displayed");
			}
			Brow.close();
			Brow.quit();
		}
	}


