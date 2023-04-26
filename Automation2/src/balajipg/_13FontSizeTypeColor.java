package balajipg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _13FontSizeTypeColor {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String size = driver.findElement(By.xpath("//div[text()='Login ' ]")).getCssValue("font-size"+"color");
		String colour = driver.findElement(By.xpath("//div[text()='Login ' ]")).getCssValue("color");
		String bgc = driver.findElement(By.xpath("//div[text()='Login ' ]")).getCssValue("background-color");//font-family=font style,text-align
		System.out.println(size+","+colour +bgc);
			

}
}
