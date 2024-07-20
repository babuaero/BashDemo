package LocatorAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigbasketXpath {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("Apples",Keys.ENTER);
		//driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//div[@class=\"break-words h-10 w-full\"])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='Add'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@color=\"rossoCorsa\"])[2]")).click();
		String name = driver.findElement(By.xpath("(//a[@class=\"h-full\"])[1]")).getText();
		String price = driver.findElement(By.xpath("(//span[text()=\"₹159\"])[1]")).getText();
		System.out.println(name+' '+'='+' '+price);

	}
	
	}


