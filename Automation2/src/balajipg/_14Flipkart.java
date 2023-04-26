package balajipg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _14Flipkart {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("i phone 14 pro max");
		/*Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'i phone 14')])[1]/../../../../div")).click();
		Thread.sleep(3000);
		 List<WebElement> allIPhone = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14')]"));
		Thread.sleep(3000);
		List<WebElement> allPrice = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14')]/../../div[2]/div[1]/div[1]/div"));
		int count=allIPhone.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		  String product = allIPhone.get(i).getText();
	      String price = allPrice.get(i).getText();
	      System.out.println(product+"------->"+price);
	      System.out.println("\n");
		}
		driver.close();*/
	}

}
