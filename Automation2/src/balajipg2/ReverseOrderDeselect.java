package balajipg2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReverseOrderDeselect {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver=new ChromeDriver();
      driver.get("file:///C:/Users/HP/Desktop/Demo/Hotel.html");
     WebElement Mtr = driver.findElement(By.id("mtr"));
     WebElement cp = driver.findElement(By.id("cp"));
     Select s=new Select(cp);
     Select s1=new Select(Mtr);
     List<WebElement> allops = s.getOptions();
     for(int i=0;i<allops.size();i++) {
    	 allops.get(i);
    	s.selectByIndex(i);
     }
     for(int i=allops.size()-1;i>=0;i--) {
    	 allops.get(i);
    	 Thread.sleep(1000);
    	s.deselectByIndex(i);
     }
    String text = s1.getWrappedElement().getText();
    System.out.println(text);
     driver.close();
	}

}
