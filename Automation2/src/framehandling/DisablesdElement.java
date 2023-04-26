package framehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisablesdElement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/HP/Desktop/Demo/Disabled.html");
    driver.findElement(By.id("d1")).sendKeys("manager");
    //RemoteWebDriver r=(RemoteWebDriver) driver;
    Thread.sleep(2000);
    driver.executeScript("document.getElementById('d2').value='sam'");
    Thread.sleep(2000);
    driver.executeScript("document.getElementById('d2').value=''");
    driver.findElement(By.id("d1")).click();
    
	}

}
