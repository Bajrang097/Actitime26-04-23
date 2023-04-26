package balajipg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _15Removetext {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/HP/Desktop/Demo/removetext.html");
    driver.findElement(By.xpath("(//input)[1]")).clear();    driver.findElement(By.xpath("(//input)[2]")).sendKeys(Keys.CONTROL+"av");
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//input)[2]")).sendKeys(Keys.CONTROL+" ");

	}

}
