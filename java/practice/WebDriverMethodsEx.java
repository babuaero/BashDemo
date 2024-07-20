package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsEx {

	public static void main(String[] args) {
		//launching empty browser
		 WebDriver driver=new ChromeDriver();
		//WebDriver driver1=new ChromeDriver();
		 
		//method1:get()-> to launch WebApplication
		 driver.get("https://www.flipkart.com");
		 //driver1.get("https://www.flipkart.com/mens-jeans/pr?sid=clo,vua,k58,i51&fm=neo%2Fmerchandising&iid=M_381d430a-cd9a-4b37-b0e4-7ef86f7ff778_1_372UD5BXDFYS_MC.AWKDIFDJVHWO&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BBottom%2BWear~Men%2527s%2BJeans_AWKDIFDJVHWO&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L2_view-all&cid=AWKDIFDJVHWO");
		//method2:getTitle()-> Fetches the title of WebPage
		 String title = driver.getTitle();
		// System.out.println(title);
		//method3:getCurrentUrl()-> Fetches the current url of theWebPage
           String URL = driver.getCurrentUrl();
           //System.out.println(URL);
         //method4:getPageSource()-> Fetches the source code of the WebPage
           String source = driver.getPageSource();
           //System.out.println(source);
           
          /* Options opt = driver.manage();
           Window win = opt.window();
           win.maximize();*/
           //or
          // driver.manage().window().maximize();
           //driver.manage().window().minimize();
          // driver.manage().window().fullscreen();
          // driver.close();
           driver.quit();
           
	
	}
}
