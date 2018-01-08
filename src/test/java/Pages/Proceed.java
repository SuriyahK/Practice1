package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Proceed {
	
	public static void clickproceed (WebDriver driver) {
		
		driver.findElement(By.xpath("html/body/div[5]/div/div[3]/div/div[2]/div[1]/div/div[3]/button[2]")).click();
		
	}
	
	

}
