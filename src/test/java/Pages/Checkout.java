package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
	
	public static void chkmethod(WebDriver driver) {
		
		driver.findElement(By.xpath("//input[@class='input-text required-entry validate-latin-only-email validate-email']")).sendKeys("anikamoni@yahoo.com");
		
		
		driver.findElement(By.xpath(".//*[@id='onepage-login-form']/fieldset/ul/li[3]/div/div[1]/label")).click();
		driver.findElement(By.xpath(".//*[@id='checkout-sigin']")).click();
		
		
		//input[@class='input-text required-entry validate-latin-only-email validate-email']
		
		//.//*[@id='onepage-login-form']/fieldset/ul/li[3]/div/div[1]/label
	}

}
