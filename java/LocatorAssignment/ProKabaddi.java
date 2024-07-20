package LocatorAssignment;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProKabaddi {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.prokabaddi.com/standings");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("(//p[@class=\"title\"])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button[@class=\"list-item\"])[2]")).click();
	  
	    List<WebElement> allTeamNames = driver.findElements(By.xpath("(//p[@class=\"name\"])[1]"));
	    Thread.sleep(2000);	
		List<WebElement> allTeamPlayed = driver.findElements(By.xpath("(//p[text()=\"22\"])[1]"));
		List<WebElement> allTeamWon = driver.findElements(By.xpath("(//p[@class=\"count\"])[2]"));
		List<WebElement> allTeamLost = driver.findElements(By.xpath("(//p[@class=\"count\"])[3]"));
		List<WebElement> allTeamTied = driver.findElements(By.xpath("(//p[@class=\"count\"])[4]"));
		List<WebElement> allScoreDiff = driver.findElements(By.xpath("(//p[@class=\"count\"])[5]"));
		List<WebElement> allTeamPoints = driver.findElements(By.xpath("(//p[@class=\"count\"])[6]"));
		
		for (WebElement TeamName : allTeamNames)
				for (WebElement TeamPlayed : allTeamPlayed)
					for (WebElement TeamWon : allTeamWon)
						for (WebElement TeamLost : allTeamLost)
							for (WebElement TeamTied : allTeamTied)
								for (WebElement TeamScoreDiff : allScoreDiff)
									for (WebElement TeamPoints : allTeamPoints)	
			
			{
				//System.out.println(TeamName.getText());
				//System.out.println(TeamPoints.getText());
System.out.println("Teamname ="+" "+TeamName.getText()+"|"+"Played ="+" "+TeamPlayed.getText()+"|"+"Won ="+" "+TeamWon.getText()+"|"+"Lost ="+" "+TeamLost.getText()+"|"+"Tie ="+" "+TeamTied.getText()+"|"+"Diff ="+" "+TeamScoreDiff.getText()+"|"+"Points ="+" "+TeamPoints.getText());
				
		    }
		
	}

}
