package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class subject {
	public static void main(String[]arg)
			throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		 driver.findElement(By.xpath ("//input[@name='firstName']")).sendKeys("suraj");
		 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("yadav");
		 driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("7709657205");
		 driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("skr15896@gmail.com");
		 driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Rajapeth");
		 driver.findElement(By.xpath("//input[@name='city']")).sendKeys("amravati");
		 driver.findElement(By.xpath("//input[@name= 'state']")).sendKeys("maharashtra");
		 driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("44401");
		 driver.findElement(By.xpath("//select[@name='country']")).sendKeys("india");
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ysk15896@gmail.com");
		 driver.findElement(By.xpath("//input[@name= 'password']")).sendKeys("suraj123");
		 driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("suraj123");
		 driver.findElement(By.xpath("//input[@name='submit']")).click();
		 
		 driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			
			Thread.sleep(20000);
			driver.quit();
			
			
		}

	}

		
	    