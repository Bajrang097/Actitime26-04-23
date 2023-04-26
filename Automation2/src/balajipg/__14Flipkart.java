package balajipg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class __14Flipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	}

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14 max pro");
		driver.findElement(By.xpath("//button")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]")));
		
		List<WebElement> allIphone = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]"));
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]/../../div[2]/div[1]/div[1]/div[1]")));

		
		List<WebElement> allprice = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]/../../div[2]/div[1]/div[1]/div[1]"));
		int count = allIphone.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = allIphone.get(i).getText();
			String text2 = allprice.get(i).getText();
			System.out.println(text+"------>"+text2);
		}
	  
         // int count1 = allprice.size();		
         
	  driver.close();
    
	}

}
