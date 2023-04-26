package balajipg2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleListbox {
  static {
	  System.setProperty("webdriver.chrome.driver","./driver2/chromedriver.exe");
  }
	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS);
     driver.get("https://www.facebook.com/");
     driver.findElement(By.linkText("Create new account")).click();
  //   driver.findElement(By.id("day")).sendKeys("200");  //if we use sendkeys and input given some wrong value then it will except any random value
	WebElement daylistBox = driver.findElement(By.id("day"));
     Select s=new Select(daylistBox);
     s.selectByIndex(4);
     s.selectByValue("23");
     s.selectByVisibleText("1");
     boolean m = s.isMultiple();
     if(m==true)
     {
    	 System.out.println("it is a multiple selectbox");
     }
     else
    	 System.out.println("it is single select listbox");
    // System.out.println(s.getFirstSelectedOption());
     //System.out.println(s.getAllSelectedOptions());
    // s.deselectAll(); it will work for multiselectListBox here unsupportedOperationException
	}

}
