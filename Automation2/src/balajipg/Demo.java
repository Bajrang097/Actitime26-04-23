package balajipg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver","./driver2/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 int h1 = driver.findElement(By.id("email")).getSize().getHeight();
		 int h2 = driver.findElement(By.id("passContainer")).getSize().getHeight();
		 int w1 = driver.findElement(By.id("email")).getSize().getWidth();
		 int w2 = driver.findElement(By.id("passContainer")).getSize().getWidth();
		 if(h1==h2&&w1==w2)
		System.out.println("equal");
		 driver.close();
		

}
}