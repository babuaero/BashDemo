package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopUp {

	public static void main(String[] args) throws Throwable {

		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.makemytrip.com");
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//div[text()='April 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='30']")).click();
	     driver.findElement(By.xpath("//span[text()='Return']")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//div[text()='May']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='15']")).click(); 
	     
	/*    driver.get("https://www.goibibo.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     driver.findElement(By.xpath("//span[@role=\"presentation\"]")).click();
	     driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//div[text()=\"April 2024\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\"25\"]")).click();
	     driver.findElement(By.xpath("//span[text()=\"Return\"]")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//div[text()=\"May 2024\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\"10\"]")).click(); */
	     
	     
	     
	     

	}

}
