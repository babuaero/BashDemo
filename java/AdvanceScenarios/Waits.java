package AdvanceScenarios;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//implicit wait version:-3
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//implicit wait version:-4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //100% interview quest
		
		driver.get("http://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user"); //--->NSEE
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	//	driver.findElement(By.id("login-button")).click();
		
	    WebElement login = driver.findElement(By.id("login-button"));
		//Explicit wait ----> Time Out Exception
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.titleContains("Hello"));
		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click(); 
		
		//Fluent wait
	/*	FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.withTimeout(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click(); */

	}

}
