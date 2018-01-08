package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCont1 {
	
	public static void chekout1(WebDriver driver ) {
		
		
		driver.findElement(By.xpath(".//*[@id='checkout-shipping-method-load']/dl/dd/ul/li[1]/label")).click();
		driver.findElement(By.xpath(".//*[@id='shipping-method-buttons-container']/button")).click();
		
		
		
	

		
	}

}
