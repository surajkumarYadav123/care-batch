package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class publicjoins {
	public static void main(String[]arg)
			throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://retailm1.upskills.in/admin");
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.quit();
	
	
	
	
	
	
	}
		}
