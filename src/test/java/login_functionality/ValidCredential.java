package login_functionality;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidCredential {
	

		public static void main (String[]args) throws InterruptedException 
		{
			
			WebDriver driver = new ChromeDriver	();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			System.out.println("launch the browser");
			driver.manage().window().maximize();
	        Thread.sleep(3000);
	        System.out.println("maximize the window");
	        
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
	        System.out.println("Adding user name and password");

			driver.findElement(By.cssSelector("button[type='submit']")).click();
	        Thread.sleep(3000);
	        System.out.println("clicking the login button");

			driver.findElement(By.cssSelector("[class='oxd-userdropdown-img']")).click();
			//driver.findElement(By.cssSelector("[class='oxd-dropdown-menu']"));
	        Thread.sleep(3000);
	        System.out.println("clicking on profile picture");

			//driver.findElement(By.cssSelector("[href='/web/index.php/auth/logout']")).click();
	        driver.findElement(By.linkText("Logout")).click();
	        System.out.println("clicking the logout link");


	    }
	}



