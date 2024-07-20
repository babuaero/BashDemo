package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTestingFrames {

	public static void main(String[] args) {
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
			//	method 1: Frame switching using index
				driver.get("https://demo.automationtesting.in/Frames.html");
		     //	driver.switchTo().frame(0);
				
		     //   driver.findElement(By.xpath("//input[@type=\"text\"][1]")).sendKeys("100");
            //  method 2: id()
		     //	driver.switchTo().frame("singleframe");
		     //	driver.findElement(By.xpath("//input[@type=\"text\"][1]")).sendKeys("Babu");
		         
		    //   name()
		     //	driver.switchTo().frame("singleframe");
		     //	driver.findElement(By.xpath("//input[@type=\"text\"][1]")).sendKeys("Ram");
		     	
		    //  method 3: WebElement (Real time usage)
		     	WebElement ele = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		     	driver.switchTo().frame(ele);
		     	driver.findElement(By.xpath("//input[@type=\"text\"][1]")).sendKeys("Kumar");
		     	
		         
			}

		}
