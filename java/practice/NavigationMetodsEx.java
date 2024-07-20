package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMetodsEx {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		// driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in");
		
		Thread.sleep(1000);
		driver.navigate().back();
		
		Thread.sleep(1000);
		driver.navigate().forward();
		
		Thread.sleep(1000);
		driver.navigate().refresh();

	}

}
