package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_javaScript_confirmation {
static {
	System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	 driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	//allthough this is working without any synchronization but we should use....
	WebDriverWait wait=new WebDriverWait(driver, 0);
	wait.until(ExpectedConditions.alertIsPresent());
	Alert a = driver.switchTo().alert();
	String text = a.getText();
	a.dismiss();
	Thread.sleep(2000);
	System.out.println(text);
	System.out.println("Alert With ok done!!!!");
	//Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
	driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
	a.dismiss();
	String text2 = driver.findElement(By.id("demo")).getText();
	boolean login = driver.findElement(By.id("demo")).isDisplayed();
	if(login==true)
		System.out.println(text2);
	else
		System.out.println("no visible text");
	driver.close();
}
}
