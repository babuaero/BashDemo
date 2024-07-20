package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelectClass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click(); 
		Thread.sleep(2000);
		
		WebElement dayList = driver.findElement(By.id("day"));
		
		//Select By Index ---> Index value starts from 0
		Select sel = new Select(dayList);
		sel.selectByIndex(14);
	  //sel.selectByIndex(19); //(n-1)
		sel.selectByVisibleText("26");
		
		//Select By Index and value // for value inspect 
		Thread.sleep(2000);
		WebElement monthList = driver.findElement(By.id("month"));
		Select sel1 = new Select(monthList);
		//sel1.selectByIndex(1); //(n-1)
		//sel1.selectByValue("12");
		sel1.selectByVisibleText("Aug");
		
		//Select By Index and value  
		Thread.sleep(2000);
		WebElement yearList = driver.findElement(By.id("year"));
		Select sel2 = new Select(yearList);
		//sel2.selectByIndex(14); //(n-1)
		//sel2.selectByValue("1930");
		sel2.selectByVisibleText("2005");
	}

}
