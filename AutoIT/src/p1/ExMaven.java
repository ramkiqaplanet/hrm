package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import maven.ExaMav21;

public class ExMaven 
{
	ExaMav21 obj=new ExaMav21();
	@Test
	public void run(){
	
		//WebDriver rk=new ChromeDriver();
		//ExaMav21 rk2=new ExaMav21();
		obj.Setup();
		obj.Login();
		obj.AddEmp();
		obj.close();
		
		
	
}
}