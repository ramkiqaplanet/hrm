
import java.util.List;

import org.eclipse.jdt.internal.compiler.problem.AbortCompilation;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fundamentals 
{
	public static void main(String[] args) {
	System.setProperty("webdriver ie.driver", "");	
	WebDriver driver=new InternetExplorerDriver();
	driver.manage().window().maximize();
	WebDriverWait wait =new WebDriverWait(driver, 30);
	//Actions
	Actions A=new Actions(driver);
	A.click(driver.findElement(By.name("name")));
	A.doubleClick(driver.findElement(By.name("name")));
	WebElement x = driver.findElement(By.id(""));
	A.moveToElement(x).build().perform();
	//right click
	A.contextClick(x).perform();
	//way2
	WebElement x1 = driver.findElement(By.id(""));
	WebElement x2 = driver.findElement(By.id(""));
	A.dragAndDrop(x1, x2).perform();
	A.sendKeys(Keys.ARROW_DOWN).perform();
	A.sendKeys(Keys.ARROW_RIGHT).perform();
	A.sendKeys(Keys.ENTER).perform();
	System.out.println("********************");
	//Alert
	wait.until(ExpectedConditions.alertIsPresent());
	Alert a=driver.switchTo().alert();
	a.equals("");
	a.accept();
	a.dismiss();
	a.getText();
	a.sendKeys("");

	Select s = null;
	List<WebElement> op = s.getOptions();
	// create webElement 
	 WebElement obj = driver.findElement(By.id(""));
	 obj.clear();
	 obj.sendKeys("");
	 obj.click();
	 // verify element present or not
	 obj.isDisplayed();
	 //element enabled or not
	 obj.isEnabled();
	 //element Selected or not
	 obj.isSelected();
	//to get text and verify
	 obj.getText().equals("");
	 String text = obj.getText();
	//if and else
	 if(obj.equals(""))
	 {
		 System.out.println("displayed");
	 }
	 else
	 {
		 System.out.println("not");
		 return;
	 }
	 //take properties
	 String sUN="";
	 String sPW="";
	 //wait commands for
	 //title
	 wait.until(ExpectedConditions.titleIs(""));
	 //text
	 wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(
			 "xpathExpression"), text));
	 //element
	 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("")));
	 //partial title
	 wait.until(ExpectedConditions.titleContains("par title"));
	 //wait for alert
	 wait.until(ExpectedConditions.alertIsPresent());
	 //frame
	 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("id"));
	 driver.switchTo().frame("");
	 driver.switchTo().defaultContent();
	 //dropDown
	  WebElement h = driver.findElement(By.name(""));
	
	Select s1=new Select(h);
	s1.selectByIndex(8);
	s1.selectByValue("property");
	s1.selectByVisibleText("item name");
	//get all items 
	List<WebElement> ops = s1.getOptions();
	System.out.println(ops.size());
	//get selected opt from lst box
	List<WebElement> lis = s1.getAllSelectedOptions();
	//get selec item
	List<WebElement> e1 = s1.getAllSelectedOptions();
	
		// how to print all itms frm drpdwn
	WebElement drpdwn = driver.findElement(By.id(""));
	Select S=new Select(drpdwn);
	List<WebElement> Op = S.getOptions();
	for (int i = 0; i < Op.size(); i++) {
	WebElement E1 = Op.get(i);
	String itemname = E1.getText();
	System.out.println(itemname);
	
	}
}}


















