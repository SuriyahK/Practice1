package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Util.Lib;

public class FinalPayment extends Lib {

	
	public static void finalpayment1(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.id("cc_number_paymentech")).sendKeys("6011526585256595");
		
		sleep(driver, 2 );
		driver.findElement(By.xpath(".//*[@id='cc_expiration_month_paymentech']")).sendKeys("02 - February");
		
		sleep(driver, 2 );
		driver.findElement(By.xpath(".//*[@id='cc_expiration_year_paymentech']")).sendKeys("2021");
		
		driver.findElement(By.xpath("")).sendKeys("2021");
		
		
		
		//.//*[@id='cc_number_paymentech']
		
	}
}
