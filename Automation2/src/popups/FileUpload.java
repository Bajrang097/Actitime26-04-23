package popups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/HP/Desktop/Demo/naukri.html");
   // driver.findElement(By.id("cv")).sendKeys("C:\\Users\\HP\\Desktop\\Resume1.docx.txt");
    File f=new File("./data2/Resume1.docx.txt");
    String apath = f.getAbsolutePath();
    
    driver.findElement(By.id("cv")).sendKeys(apath);
    System.out.println(apath);

	}

}
