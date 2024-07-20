package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarUsingJavaScriptExecutorEx2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Video']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//method 1:-
	/*	System.out.println(ele.getLocation().getX());
		System.out.println(ele.getLocation().getY());
		
		js.executeScript("window.scrollBy(834,787)");
		ele.click();  */
		
		//method 2:-
		js.executeScript("arguments[0].scrollIntoView()",ele); //fixed one have to mugup
		ele.click();
	}

}
