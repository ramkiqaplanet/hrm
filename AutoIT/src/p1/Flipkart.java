package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		String url="https://www.flipkart.com/mobiles/samsung~brand/pr?count=40&p%5B%5D=sort%3Drecency_desc&sid=tyy%2F4io&wid=1.productCard.PMU_V2";
	
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	Thread.sleep(5000);
	
	//int v0=driver.findElements(By.xpath("//div[@class='_3T_wwx']/div")).size();
	//int v1=driver.findElements(By.xpath("xpath=//div[@class='_3T_wwx']//a")).size();
	//int v2=driver.findElements(By.xpath("xpath=//div[@class='_3T_wwx']//a[@class='_1UoZlX']//div[@Class='3wU53n']")).size();
	//int v3=driver.findElements(By.xpath("xpath=//div[@class='_3T_wwx']//a[@class='_1UoZlX']//div[@Class='3wU53n']")).size();
			
			//System.out.println(v0);
			//System.out.println(v1);
			//System.out.println(v2);
			//System.out.println(v3);
			
			
			int rc=driver.findElements(By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div")).size();
			System.out.println(rc);
			for (int i = 1; i <=rc; i++) {
				String stringC =driver.findElement(By.xpath("//html/body/div[1]/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div["+i+"]/div/a/div[2]/div[1]/div[1]")).getText();
				System.out.println(stringC);
				
			}

			
			
			
			
	}

}
