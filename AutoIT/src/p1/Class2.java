package p1;


import java.awt.datatransfer.StringSelection;
import java.awt.Robot;
import java.awt.Toolkit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.sun.glass.events.KeyEvent;


public class Class2
{
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://apps.qaplanet.in/qahrm/login.php");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	Screen s=new Screen();	
    Pattern UN=new Pattern("C:\\Users\\Lab\\Desktop\\New Folder (2).sikuli\\1510119895449.png");
    Pattern PW=new Pattern("C:\\Users\\Lab\\Desktop\\New Folder (2).sikuli\\1510120009320.png");
    Pattern Logn=new Pattern("C:\\Users\\Lab\\Desktop\\New Folder (2).sikuli\\1510062631369.png");
    Pattern search=new Pattern("C:\\Users\\Lab\\Desktop\\New Folder (2).sikuli\\1510121089855.png");
    
    //s.click(UN);
    s.type(UN, "qaplanet1");
    
   // s.click(PW);
    s.type(PW, "lab1");
    s.click(Logn);
    Thread.sleep(5000);
    s.type(search,"grrrrr");
    
    
    /*
	driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(5000);
	
	Actions a=new Actions(driver);
	
	WebElement pim=driver.findElement(By.linkText("PIM"));
	a.moveToElement(pim).build().perform();
	Thread.sleep(5000);
	
	WebElement AddEmployee=driver.findElement(By.linkText("Add Employee"));
	a.moveToElement(AddEmployee).build().perform();
	Thread.sleep(5000);
	
	 AddEmployee=driver.findElement(By.linkText("Add Employee"));
	a.moveToElement(AddEmployee).click().build().perform();
	Thread.sleep(5000);

	driver.switchTo().frame("rightMenu");
	driver.findElement(By.id("txtEmpLastName")).sendKeys("LastNames");		
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("FirstNames");		
	driver.findElement(By.name("photofile")).click();
	Thread.sleep(2000);
	*/
	//Runtime.getRuntime().exec("C:\\Users\\Lab\\Desktop\\Ramki.exe");
	
/*	
	Screen s=new Screen();	
    Pattern FileName=new Pattern("C:\\Users\\Lab\\Desktop\\antos.sikuli\\FileName.png");
    Pattern Open=new Pattern("C:\\Users\\Lab\\Desktop\\antos.sikuli\\open.png");
    
    
    s.type(FileName, "C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg");
    s.click(Open);  
    
    Thread.sleep(2000);*/
	Screen ss= new Screen();
	
	/*Pattern UN=new Pattern("C:\\Users\\Lab\\Desktop\\New Folder.sikuli\\1510058231833.png");
	Pattern PW=new Pattern("C:\\Users\\Lab\\Desktop\\New Folder.sikuli\\1510058244912.png");
	Pattern Open=new Pattern("C:\\Users\\Lab\\Desktop\\New Folder.sikuli\\1510058258350.png");
	ss.drag
	ss.c
	ss.type(UN, "qaplanet1");
	ss.type(PW, "lab1");
	ss.click(Open);*/
	//driver.findElement(By.id("btnEdit")).click();
/*	Screen s=new Screen();
	Pattern UN=new Pattern("C:\\Users\\Lab\\Desktop\\New Folder.sikuli\\1510058231833.png");
	Pattern PW=new Pattern("C:\\Users\\Lab\\Desktop\\New Folder.sikuli\\1510058244912.png");
	Pattern ok=new Pattern("C:\\Users\\Lab\\Desktop\\New Folder.sikuli\\1510058258350.png");
	s.type(UN, "qaplanet1");
	s.type(PW, "Lab@12");
	s.click(ok);*/
	
	/*
	Robot r=new Robot();
	StringSelection ss=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg");
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
  
    r.delay(2000);
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.delay(2000);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    r.delay(2000);
    r.mouseMove(300, 400);
    r.delay(2000);
   
    r.mouseMove(200, 400);
    r.delay(2000);
    r.mouseMove(500, 400);    
    r.delay(2000);
    r.mouseMove(700, 400);
    r.delay(2000);*/

}
}

































