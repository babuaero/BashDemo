package LocatorAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAssignment1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[placeholder=\"Search for Products, Brands and More\"]")).sendKeys("Iphone 15 plus");
		//driver.findElement(By.cssSelector("[xmlns=\"http://www.w3.org/2000/svg\"]")).click();
		driver.findElement(By.cssSelector("[viewBox=\"0 0 24 24\"]")).click();
		String val = driver.findElement(By.linkText("class=\"_30jeq3 _1_WHN1\"")).getText();
		
		
		
		System.out.println(val);
	}

}
