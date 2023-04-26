package framehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BbcScrolling {
	static {
		System.setProperty("webdriver.chrome.driver","./driver2/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
         driver.get("https://www.bbc.com/");
         driver.manage().window().maximize();
         JavascriptExecutor j=(JavascriptExecutor) driver;
         j.executeScript("window.scrollBy(0,3000)");
         Thread.sleep(4000);
        WebElement arc = driver.findElement(By.className("top-list-item__headline"));
        Actions a=new Actions(driver);
        a.contextClick(arc).perform();
	}

}
