package mouseAxions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHove_DD {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    /*driver.get("https://www.vtiger.com/");
    driver.manage().window().maximize();
   WebElement target = driver.findElement(By.linkText("Resources"));
   Actions a=new Actions(driver);
   a.moveToElement(target).perform();
   Thread.sleep(5000);
   driver.findElement(By.linkText("Contact Us")).click();
    Thread.sleep(50);
    String text = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
    System.out.println(text);*/
    
    
    
    
    
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
    WebElement frame = driver.findElement(By.cssSelector("iframe[class='demo-frame lazyloaded']"));
    driver.switchTo().frame(frame);
    WebElement src = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
 WebElement dest = driver.findElement(By.id("trash"));
      Actions a=new Actions(driver);
      a.dragAndDrop(src, dest).perform();
    driver.close();
      
	}

}
