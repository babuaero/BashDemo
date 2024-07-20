package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingEx1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.naukri.com");
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	  WebElement ele = driver.findElement(By.xpath("//div[text()='Jobs']"));
	  
	 Actions act = new Actions(driver);
	 act.moveToElement(ele).perform();
	 driver.findElement(By.xpath("//div[text()='Jobs by skill']")).click();
	 driver.findElement(By.xpath("//div[text()='Services']")).click();
	 
	// driver.findElement(By.xpath("//span[text()='RESUME WRITING']")).click();
	 
	 String mainId = driver.getWindowHandle();//win1
	 System.out.println(mainId);
	 
	 Set<String> allIds = driver.getWindowHandles();//win1 win2
	 System.out.println(mainId);
	/* for (String id : allIds)//win2
	 {
        
       
        	 System.out.println(id);
      
	}  */
	 
 for (String win : allIds)//win2
	 {
         if(!mainId.equals(win))
         {
        	 driver.switchTo().window(win);
        	 driver.findElement(By.xpath("//span[text()='RESUME WRITING']")).click(); 
         } 
	} 

	}
	}
