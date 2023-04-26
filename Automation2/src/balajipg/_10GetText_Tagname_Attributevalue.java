package balajipg;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _10GetText_Tagname_Attributevalue {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//printing text of forgot your password link
		//String text = driver.findElement(By.linkText("Forgot your password?")).getText();
		Rectangle rect = driver.findElement(By.id("demoCredentials")).getRect();
		System.out.println(rect);
//		//ptinting tagname of forgot your password link
//		String tagname = driver.findElement(By.linkText("Forgot your password?")).getTagName();
//		System.out.println(tagname);
//		//printing attributevalue of href
//		String attribute = driver.findElement(By.linkText("Forgot your password?")).getAttribute("id");
//		System.out.println(attribute);
		driver.close();
		

	}

}
