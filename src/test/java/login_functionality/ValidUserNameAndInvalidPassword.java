package login_functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidUserNameAndInvalidPassword {
	public static void main(String[]args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver	();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("launch the browser");
		driver.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println("maximize the window");
        
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("aladin123");
        System.out.println("Adding valid user name and invalid password");

		driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(3000);
        System.out.println("clicking the login button");
        System.out.println("Invalid credentials");

		

    }


		
	}


