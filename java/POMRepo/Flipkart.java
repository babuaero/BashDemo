package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart {
	
	public Flipkart(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);

	}

	//Declaration
	@FindBy(xpath="//input[@type=\"text\"]")
	private WebElement SearchBarTextField;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement SearchField;

	public WebElement getSearchBarTextField() {
		return SearchBarTextField;
	}

	public WebElement getSearchField() {
		return SearchField;
	}

	//BusinessLogics
	public void loginToApp(String Searchbar,String Search)
	{
		SearchBarTextField.sendKeys("Iphone");
		SearchField.click();

}
}
