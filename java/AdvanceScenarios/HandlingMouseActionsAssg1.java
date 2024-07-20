package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActionsAssg1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(1000);
		WebElement drag = driver.findElement(By.xpath("//div[@style=\"position: relative;\"]"));
		WebElement drop = driver.findElement(By.xpath("droppable"));
		Thread.sleep(1000);
		Actions act = new Actions(driver); 
		//act.clickAndHold(drag).perform();
		//act.release(drop).perform();
		
		//or
		//act.clickAndHold(drag).release(drop).perform();
		
		//or
	  act.dragAndDrop(drag, drop).perform();

	}
}
