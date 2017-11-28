package demoex;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Web_Exc_TestNG {
		WebDriver Brow;
		
@BeforeClass
public void setup()
	{	System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver.exe");
		Brow = new ChromeDriver();
		
	}
@AfterClass
public void close()
	{	
		Brow.close();
		Brow.quit();
	}
@Test
public void openApp() throws Exception
{
	FileInputStream f=new FileInputStream("C:\\Users\\Lab\\Documents\\new23.xls");
	Workbook wb=Workbook.getWorkbook(f);
	Sheet s1=wb.getSheet("Sheet2");
	FileOutputStream F=new FileOutputStream("C:\\Users\\Lab\\Documents\\new24.xls");
	WritableWorkbook wwb=Workbook.createWorkbook(F);
	WritableSheet ws=wwb.createSheet("sheet", 0);
	Brow.get("http://apps.qaplanet.in/qahrm/login.php");
	int rows = s1.getRows();
	try {
		for (int i = 1; i < s1.getRows(); i++) {
		
		String S2 = s1.getCell(1, i).getContents();
		String S3 = s1.getCell(2, i).getContents();
		Brow.findElement(By.name("txtUserName")).sendKeys(S2);
		Brow.findElement(By.name("txtPassword")).sendKeys(S3);
		Brow.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		Label l1= new Label(1, i, S2);
		Label l2= new Label(1, i, S3);
		ws.addCell(l1);
		ws.addCell(l2);
		
		} 
		
	} 
	catch (Exception e) {
		System.out.println(e);
	}
	wwb.write();
	Brow.findElement(By.linkText("Logout"));
}
}








