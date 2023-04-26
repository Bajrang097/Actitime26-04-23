package balajipg;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _12XandYaxisAndAlignment {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
			Point loc = driver.findElement(By.id("username")).getLocation();
			System.out.println(loc);    //(x=478,y=319)
			int x1 = driver.findElement(By.id("username")).getLocation().getX();
			int x2 = driver.findElement(By.name("pwd")).getLocation().getX();
			System.out.println(x1+","+x2);
			if(x1==x2)
				System.out.println("aligned");
			else
				System.out.println("not aligned");
			driver.close();
			WebDriver driver1=new ChromeDriver();
			driver1.get("https://www.facebook.com/");
			driver1.findElement(By.xpath("(//a[@role='button'])[2]")).click();
			Thread.sleep(5000);
			int y1 = driver1.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
			int y2 = driver1.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
			int y3 = driver1.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
			if(y1==y2&&y2==y3)
				System.out.println("aligned");
			else
				System.out.println("not aligned");
			driver1.close();
}
}
