package balajipg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _5_2upcasting {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	
		System.setProperty("webdriver.gecko.driver", "./driver2/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		_5_1Upcasting.testA(driver);
		WebDriver driver1=new FirefoxDriver();
		_5_1Upcasting.testA(driver1);
	}

}
