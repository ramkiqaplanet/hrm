import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KewClass {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver.exe");
		ChromeDriver Brow=new ChromeDriver();
		Brow.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(Brow, 30);
		//pw un
		Brow.get("http://apps.qaplanet.in/qahrm/login.php");
		wait.until(ExpectedConditions.titleContains("OrangeHRM - New Level of HR Management"));
		if(Brow.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("title open");
		}
		WebElement objUN=Brow.findElement(By.name("txtUserName"));
		objUN.clear();
		objUN.sendKeys("qaplanet1");
		objUN.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(2000);
		objUN.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		objUN.sendKeys("lab1");
		Thread.sleep(5000);
		Brow.close();
}
}
