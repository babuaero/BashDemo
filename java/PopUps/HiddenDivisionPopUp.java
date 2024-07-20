package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.makemytrip.com");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	     driver.findElement(By.xpath("(//span[@class=\"lbl_input appendBottom10\"])[3]")).click();
	     driver.findElement(By.xpath("//span[text()='Departure']")).click();
	     
	}

}
