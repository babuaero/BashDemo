package PopUps;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import net.sourceforge.tess4j.Tesseract;

public class BrowserNativePopUp {

	public static void main(String[] args) throws Throwable {
	/*	EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--InPrivate");
		WebDriver driver = new EdgeDriver(opt); */
	
	/*	EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--disable-notifications"); */
		
		ChromeOptions opt = new ChromeOptions();
	//	SafariOptions opt = new SafariOptions();
	//	opt.setExperimentalOption("com.apple.safari.notification.Webpages", false);
      //  opt.setExperimentalOption("com.apple.safari.notification.ServiceWorkers", false);
		opt.addArguments("--incognito");
		
	  WebDriver driver = new ChromeDriver(opt);
	//	opt.addArguments("--disable-notifications");
	//    WebDriver driver = new ChromeDriver(opt);
	   
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.irctc.co.in/nget/train-search");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()=' LOGIN ']")).click();
	    WebElement captchaImg = driver.findElement(By.xpath("//img[@class='captcha-img']"));
		 
        TakesScreenshot ts =  (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("./CaptchaScreenShot.png");
        FileUtils.copyFile(src, dest);
        
        Thread.sleep(2000);
        Tesseract tss = new Tesseract();
        tss.setDatapath("/Users/babu/Desktop/JAVA SEL/tessdata");
        String img = tss.doOCR(dest);
        String finalCaptcha=img.replace(" ","");
        
        driver.findElement(By.xpath("//input[@id='captcha']")).sendKeys(finalCaptcha);
        
    
	}
  
}
