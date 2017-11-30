package WebDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PeopleSubscribtionTest {
  public WebDriver driver;
@BeforeClass
  public void method4(){
	System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	 driver =new ChromeDriver();
	  System.out.println("This id the first statement that will be executed");
  }
  @BeforeMethod
  public void method1(){
	  driver.get("http://apps.qaplanet.in/qahrm/login.php");
	  driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("qa");
	  System.out.println("This Statement will be executed before every test case");
	  
  }
  @Test
  public void Test1() {
     System.out.println("This the first text case of this page");
  }
  @Test
  public void test2(){
	  System.out.println("This is the second test case of this program");
  }
  @AfterMethod
  public void method2(){
	  System.out.println("This is the last statement that will be executed after every test case");
  }
  @AfterClass
  public void method3(){
	  System.out.println("This is the last staement that will be executed");
  }
}
