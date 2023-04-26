package framehandling;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fraame1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver=new ChromeDriver();
      driver.get("file:///C:/Users/HP/Desktop/Demo/Frame.html");
      driver.findElement(By.id("t1")).sendKeys("abcde");
     // driver.switchTo().frame(0).findElement(By.id("t2")).sendKeys("fghi");
     // driver.switchTo().frame("f1").findElement(By.id("t3")).sendKeys("jklm");
      WebElement frame = driver.findElement(By.xpath("//*[@id=\"f1\"]"));
      driver.switchTo().frame(frame);
      driver.findElement(By.id("t2")).sendKeys("we");
    Thread.sleep(2000);
    //  WebElement f = driver.findElement(By.xpath("//*[@id=\"f1\"]"));
      //driver.switchTo().frame(f);
      //driver.findElement(By.id("t3")).sendKeys("weer");
    JavascriptExecutor j=(JavascriptExecutor) driver;
    j.executeScript("window.scrollBy(6,0)");
      
          
	}

}
