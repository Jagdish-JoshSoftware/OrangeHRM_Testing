package change_your_password_functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangePasswordWithInvalidUsername 
{
	
	public static void main(String[]args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver	();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("[class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys("jaggu_bandar");
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot"
		+ "-password-button orangehrm-forgot-password-button--reset']")).click();
		
	    
		
	
		
	}
	

}
