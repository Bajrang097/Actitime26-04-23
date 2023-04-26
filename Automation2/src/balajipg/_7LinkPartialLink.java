package balajipg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _7LinkPartialLink {
	static {
		System.setProperty("webdriver.chrome.driver","./driver2/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Demo/Demo.html");
		driver.findElement(By.linkText("Google")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("o")).click();
		driver.close();

	}

}
