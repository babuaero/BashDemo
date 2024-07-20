package AdvanceScenarios;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingAutoSuggestionAssignment1 {

	@Test
	public void HandlingAutoSuggestionAssignment1() throws Throwable {
//	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(2000);
       List<WebElement> allsugg = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		
		
		for (WebElement sugg : allsugg)
		{
			
		    String Element = sugg.getText();
		   
		   if(Element.contains("selenium webdriver"))
		    {
		    	sugg.click();
		    	break;
		    }
		   System.out.println(sugg.getText());

        }

	}

}
