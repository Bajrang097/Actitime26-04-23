package balajipg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1Get_gettitle_manage_close {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//get() is used to enter the url
		driver.get("https://www.google.com/");
		//using manage() here
		driver.manage().window().maximize();
		//getTitle
		String title = driver.getTitle();
		System.out.println(title);
		//closing the current browser
		driver.close();
		

	}

}
