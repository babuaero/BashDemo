package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNativePopUp1 {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		opt.addArguments("--disable-notifications");
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver(opt);
		 driver.get("https://demo.automationtesting.in/Windows.html");
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://www.irctc.co.in/nget/train-search");

	}

}
