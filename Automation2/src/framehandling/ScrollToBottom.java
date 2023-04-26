package framehandling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToBottom {
	static {
		System.setProperty("webdriver.chrome.driver","./driver2/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
         driver.get("https://www.bbc.com/");
         driver.manage().window().fullscreen();
         JavascriptExecutor j=(JavascriptExecutor) driver;
         Thread.sleep(4000);
         j.executeScript("window.scrollBy(0,document.body.scrollWidth)");
	}

}
