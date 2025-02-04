package pim_feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAddingEmployee 
{
  public static void main(String[]args) throws InterruptedException 
  {
	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.name("username")).sendKeys("Admin");
	   
	   driver.findElement(By.name("password")).sendKeys("admin123");
	   
	   driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.cssSelector("[placeholder='Search']")).sendKeys("PIM");
	   
	   driver.findElement(By.cssSelector("[class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.linkText("Add Employee")).click();
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.name("firstName")).sendKeys("sujit");
	   
	   driver.findElement(By.name("middleName")).sendKeys("gupte");
	   
	   driver.findElement(By.name("lastName")).sendKeys("Gupta");
	   
	   Thread.sleep(3000);

	   driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//a[contains(text(),'Employee List')]")).click();
	   
	   Thread.sleep(3000);
	   
	  
	   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("sujit");
	   
	   Thread.sleep(3000);

	   driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

	   
	   

  }
}
