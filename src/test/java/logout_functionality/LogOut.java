package logout_functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOut 
{
   public static void main(String[]args) throws InterruptedException
   {
	   WebDriver driver = new ChromeDriver	();
	   System.out.println("lounch the browser");
	   
	   driver.manage().window().maximize();
	   System.out.println("maximize the window");
	   
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   System.out.println("navigate to orangeHRM log in page");
	   
	   Thread.sleep(3000);
	   driver.findElement(By.name("username")).sendKeys("Admin");
	   driver.findElement(By.name("password")).sendKeys("admin123");
	   System.out.println("Given valid login validations");
	   
	   driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	   System.out.println("click on log in button");
	   
	   Thread.sleep(3000);
	   driver.findElement(By.cssSelector("[class='oxd-userdropdown-img']")).click();
	   
	   Thread.sleep(3000);
	   driver.findElement(By.linkText("Logout")).click();
	   
	   
   }
}
