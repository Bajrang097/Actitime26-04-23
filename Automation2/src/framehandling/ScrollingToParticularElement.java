package framehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingToParticularElement {

	static {
		System.setProperty("webdriver.chrome.driver","./driver2/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
         driver.get("https://www.bbc.com/");
        int y = driver.findElement(By.xpath("(//img[@class='image-replace'])[30]")).getLocation().getY();
        JavascriptExecutor j=(JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,"+y+")");
}
}
