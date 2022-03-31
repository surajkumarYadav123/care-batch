package TESTNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven {

	@Test
	public void suraj()
			throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
				
				driver.get("http://retailm1.upskills.in/admin");
				driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("8483075059");
						
					System.out.println("yadav");
					Thread.sleep(2000);
					driver.quit();
					
	}
}
