package PopUps;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class WindowsHandlingAssgn1 {

	public static void main(String[] args) {
		
                 WebDriver driver = new ChromeDriver();
				 driver.get("https://www.flipkart.com/");
				 driver.manage().window().maximize();
			     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			     
			 WebElement val = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		
	         Actions act = new Actions(driver);
			 act.moveToElement(val).perform();
			 driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Bluetooth",Keys.ENTER);
			 driver.findElement(By.xpath("(//a[text()=\"OnePlus Bullets Wireless Z2 Bluetooth Headset\"])[1]")).click();
			 
		     String mainWindowHandle = driver.getWindowHandle(); //win1
			 
			 Set<String> allWindowHandles = driver.getWindowHandles();//win1 win2
			
			for (String win : allWindowHandles)//win2
			{
				if(!mainWindowHandle.equals(win))
			 {	       
					 driver.switchTo().window(win);
					

	         } 

			}
			
			WebElement ProductName  = driver.findElement(By.xpath("//span[@class=\"VU-ZEz\"]"));
			System.out.println("Product Name :" + ProductName.getText());
						
			WebElement ProductPrice  = driver.findElement(By.xpath("//div[text()=\"₹1,799\"]"));	
			System.out.println("Product Price :" + ProductPrice.getText()); 
			
			
			} 
	
	}

	
	

        
