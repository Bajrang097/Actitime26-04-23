package balajipg2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Demo/Hotel.html");
		WebElement Mtr = driver.findElement(By.id("mtr"));
		WebElement checkpost = driver.findElement(By.id("cp"));
		Select s=new Select(checkpost);
		Select s1=new Select(Mtr);
	  s.deselectAll();
	  s.selectByIndex(0);
	  s.selectByValue("pu");
	  s.selectByVisibleText("vadapav");
	  //printing first selected option in checkpost;
	  System.out.println(s.getFirstSelectedOption().getText());
	  //printing all selected options in checkbox
	  List<WebElement> allSelOps = s.getAllSelectedOptions();
	  for(int i=0;i<allSelOps.size();i++)
	  {
		  String text = allSelOps.get(i).getText();System.out.println(text);
		  
	  }
	  System.out.println("************");
	  //printing all the options available in mtr
	 List<WebElement> allops = s1.getOptions();
	 for(int i=0;i<allops.size();i++)
	 {
		 String text = allops.get(i).getText();
		 System.out.println(text);
	 }
		

	}

}
