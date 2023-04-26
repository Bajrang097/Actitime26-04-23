package balajipg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _8CssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Demo/Demo.html");
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[href='https://jspiders.com/\']")).click();
		driver.close();

	}

}
