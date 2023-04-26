package balajipg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _9displayed_Enabled_Selected {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean logo = driver.findElement(By.cssSelector("img[alt='Facebook']")).isDisplayed();
		if(logo==true)
        System.out.println("logo is displayed and passed");
		else
			System.out.println("logo not displayed and failed");
		boolean loginEn = driver.findElement(By.name("login")).isEnabled();
		if(loginEn==true)
			System.out.println("enabled and passed");
		driver.close();
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://demo.actitime.com/");
		boolean Sel = driver1.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(Sel==true)
			System.out.println("selected");
		else
		  System.out.println("not selected");
		driver1.close();

	}

}
