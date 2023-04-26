package balajipg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2CurrentUrl {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	}

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.seleniumHQ.org/");
     String curl = driver.getCurrentUrl();
     System.out.println(curl);
	}

}
