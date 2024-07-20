package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestionEx2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("q")).sendKeys("puma");
		driver.findElement(By.name("field-keywords")).sendKeys("Iphone");
		
		Thread.sleep(1000);
        List<WebElement> allsugg = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		
		
		for (WebElement sugg : allsugg)
		{
			
		    //System.out.println(sugg.getText()); 
		    String Element = sugg.getText();
		   
		   if(Element.contains("iphone 15 plus"))
		    {
		    	sugg.click();
		    	break;
		    }
		   System.out.println(sugg.getText()); 

        }
	}
	}

	

