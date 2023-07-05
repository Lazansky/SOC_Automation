package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchBlog {

	WebDriver driver;
	
	@FindBy(xpath = "//input[@name='s']")
	WebElement txtSearch;

	@FindBy(xpath = "//i[@class='fas fa-search']")
	WebElement btnSearch;

	
	public searchBlog(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickSearch() {

		btnSearch.click();

	}

	public void insertSearch(String txt) {

		txtSearch.sendKeys(txt);
		txtSearch.sendKeys(Keys.ENTER);
	}

	
	public void search(String txt) {
		
		btnSearch.click();
		txtSearch.sendKeys(txt);
		txtSearch.sendKeys(Keys.ENTER);
		
	}
}
