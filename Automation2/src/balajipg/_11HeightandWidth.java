package balajipg;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _11HeightandWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Dimension size = driver.findElement(By.id("username")).getSize();
		System.out.println(size);
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("the height and width of the username textbox is "+height+" "+width);
		
		
		
		//getSize() and getHeight(),getWidth;
		

	}

}
