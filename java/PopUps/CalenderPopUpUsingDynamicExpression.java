package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopUpUsingDynamicExpression {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.makemytrip.com");
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
	     Thread.sleep(1000); 
	     String monthName = "April 2024";
	     String date = "30";
	     driver.findElement(By.xpath("//div[text()='"+monthName+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
	     driver.findElement(By.xpath("//span[text()='Return']")).click();
	     Thread.sleep(1000);
	     String monthName1 = "May";
	     String date1 = "15";     
	     driver.findElement(By.xpath("//div[text()='"+monthName1+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date1+"']")).click(); 
	     

	}

}
