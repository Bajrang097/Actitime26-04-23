package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar_HiddenDivision {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox dates inactiveWidget')]")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@role='button'])[2]")));
		WebElement movearrow = driver.findElement(By.xpath("(//span[@role='button'])[2]"));
		movearrow.click();
		movearrow.click();
		movearrow.click();
		movearrow.click();
//		driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
//		driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
//		driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='DayPicker-Month'])[2]/div[3]/div[3]/div[2]")).click();
//		WebElement month = driver.findElement(By.xpath("//div[@class='DayPicker-Month']"));
//		Select s=new Select(month);
//		s.selectByIndex(0);
	}

}
