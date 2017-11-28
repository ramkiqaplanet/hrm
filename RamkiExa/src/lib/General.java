package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class General extends globel
{
public void openApp()
{
	d1=new ChromeDriver();
	d1.manage().window().maximize();
	d1.navigate().to("");
}
public void closerBro()
{
	d1.close();
}
public void quit()
{
	d1.quit();
}
public void loginApp()
{
	d1.findElement(By.name("textUN")).sendKeys(UN);
	d1.findElement(By.name("textPW")).sendKeys(PW);
	d1.findElement(By.name("btnLog")).click();
}
public void lagoutApp()
{
	d1.findElement(By.linkText("linLog")).click();
} 
public void AddEmp()
{
	System.out.println("AddEmp");
}
public void DelEmp()
{
	System.out.println("DelEmp");
}
}
