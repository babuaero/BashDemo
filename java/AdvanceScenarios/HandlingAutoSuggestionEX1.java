package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingAutoSuggestionEX1 {
@Test
//	public static void main(String[] args) throws Throwable {
public void HandlingAutoSuggestionEX1() throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("q")).sendKeys("puma");
		driver.findElement(By.name("q")).sendKeys("bluetooth");
		
		Thread.sleep(1000);
        List<WebElement> allsugg = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li"));
		
		
		for (WebElement sugg : allsugg)
		{
			
		    //System.out.println(sugg.getText()); 
		    String Element = sugg.getText();
		    //if(Element.contains("puma slippers men"))
		   if(Element.contains("bluetooth earphone"))
		    {
		    	sugg.click();
		    	break;
		    }
		    System.out.println(sugg.getText()); 

        }
		
	}

}
