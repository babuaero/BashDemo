package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProKabadiEx {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.prokabaddi.com/standings");
		String teamName = "Bengaluru Bulls";
		
		WebElement point = driver.findElement(By.xpath("//p[text()='"+teamName+"']/ancestor::div[@class='table-data team']"
				+ "/following-sibling::div[@class='table-data matches-play']"));
		System.out.println(point.getText());
		
		WebElement won = driver.findElement(By.xpath("//p[text()='"+teamName+"']/ancestor::div[@class='table-data team']"
				+ "/following-sibling::div[@class='table-data matches-won']"));
		System.out.println(won.getText());
		

	}

}
