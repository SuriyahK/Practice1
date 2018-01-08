package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selection {
	
	
	public static void bookselection(WebDriver driver) {
		
		WebElement dvdsec=driver.findElement(By.xpath(".//*[@id='media-format-radio']/div/label"));
		
		dvdsec.click();
		
		driver.findElement(By.xpath(".//*[@id='add-to-cart-btn']")).click();
		//System.out.println("this is selection page:::::" + dvdsec.getText());
		
		
		
		

}

	
		
	}
