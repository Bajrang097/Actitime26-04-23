package balajipg;

import org.openqa.selenium.WebDriver;

public class _5_1Upcasting {
	static void testA(WebDriver driver) {
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
	
	
}
