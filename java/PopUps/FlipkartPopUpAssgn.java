package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPopUpAssgn {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Iphone",Keys.ENTER);
	     Thread.sleep(1000);

	     String PhonePrice = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[text()='₹71,999']")).getText();
	   
	     System.out.println("Phoneprice ="+" "+PhonePrice);
	    
	}

}
