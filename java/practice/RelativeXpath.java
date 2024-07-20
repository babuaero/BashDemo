package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//xpath by Attribute()
		//@
	driver.findElement(By.xpath("//input[@data-test=\"username\"]")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
    driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();


	}
}