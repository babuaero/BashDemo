package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPopUpEx3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/frames");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		 
	    Thread.sleep(2000);
	    WebElement topFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));
     	driver.switchTo().frame(topFrame); 
     	
     	Thread.sleep(2000);
     	WebElement leftFrame = driver.findElement(By.xpath("//frame[@name='frame-left']"));
      	driver.switchTo().frame(leftFrame);
      	
      	String left = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
      	System.out.println(left);
      	Thread.sleep(2000);
      	driver.switchTo().parentFrame();
      	WebElement middleFrame = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
      	driver.switchTo().frame(middleFrame);
      	Thread.sleep(2000);
      	String middle = driver.findElement(By.xpath("//div[text()=\"MIDDLE\"]")).getText();
        System.out.println(middle);
        
        driver.switchTo().defaultContent();
        WebElement bottomFrame = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
      	driver.switchTo().frame(bottomFrame);

      	String bottom = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
      	System.out.println(bottom);
        
	}

}
