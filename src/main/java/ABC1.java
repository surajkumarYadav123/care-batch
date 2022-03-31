import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ABC1 {
 public static WebDriver driver;
 
 public static void setup() { WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
 } };
 
 
 
 
 
