package myfirstpck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstClass {
 
	@Test  
	public void t_01_validate_login_Swag_app() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\School1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit)	
		driver.get("https://www.saucedemo.com/");
		
		WebElement txtbx_username = 
				driver.findElement(By.name("user-name"));
		
		txtbx_username.sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.name("login-button")).click();
		
		
		//driver.findElement(By.xpath("//input[@value='Login' and @type='submit']")).click();
		
		String expected_title = "Swag Labs";
		
		String actual_title = driver.getTitle();
		
		/*if(expected_title.equals(actual_title)) {
			System.out.println("Login Succesfull");
		} else {
			System.out.println("Login Failed");
		}
		}*/
		Assert.assertEquals(expected_title, actual_title);
			
		}

}
