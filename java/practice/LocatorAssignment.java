package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAssignment {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		// syntax1
		//driver.findElement(By.cssSelector("[placeholder=\"Username\"]")).sendKeys("standard_user");
		//driver.findElement(By.cssSelector("[placeholder=\"Password\"]")).sendKeys("secret_sauce");
		//driver.findElement(By.cssSelector("[value=\"LOGIN\"]")).click();
		// syntax2
		//driver.findElement(By.cssSelector("input[data-test=\"username\"]")).sendKeys("standard_user");
		//driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("secret_sauce");
		//driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		// syntax3 only for Id()
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		// syntax4 only for Id()
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		// syntax5 only className()
		//driver.findElement(By.cssSelector(".btn_action")).click();
		// syntax6 only className()
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
		
	}

}
