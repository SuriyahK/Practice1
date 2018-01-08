package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lib {
	public static WebElement findelement(WebDriver driver, String xpath) {

		WebElement a = driver.findElement(By.xpath(xpath));

		return a;
	}

	public static void sleep(WebDriver driver, int sec) throws InterruptedException {

		Thread.sleep(sec * 1000);
	}
	
	public static String printtl(WebDriver driver) {
		String a=driver.getTitle();
		
		return a;
		
	}

}
















//C:\Users\anika\eclipse-workspace\HwAutomate\chromedriver.exe