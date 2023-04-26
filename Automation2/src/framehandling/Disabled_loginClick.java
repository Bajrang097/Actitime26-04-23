package framehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled_loginClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/HP/Desktop/Demo/Disabled2.html");
    driver.manage().window().maximize();
    driver.findElement(By.id("d1")).sendKeys("manager");
   // WebElement lgnBtn = driver.findElement(By.id("d3"));
    JavascriptExecutor j=(JavascriptExecutor) driver;
    j.executeScript("document.getElementById('d3').click();");
    
    		

}
}