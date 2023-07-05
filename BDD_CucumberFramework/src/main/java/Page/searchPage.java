package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class searchPage {

	WebDriver driver;

	By btnSearch = By.xpath("//i[@class='fas fa-search']");

	By txtSearch = By.xpath("//input[@name='s']");
	
	public searchPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public void clickSearch() {

		driver.findElement(btnSearch).click();

	}

	public void insertSearch(String txt) {

		driver.findElement(txtSearch).sendKeys(txt);
		driver.findElement(txtSearch).sendKeys(Keys.ENTER);
	}

	
	public void search(String txt) {
		
		driver.findElement(btnSearch).click();
		driver.findElement(txtSearch).sendKeys(txt);
		driver.findElement(txtSearch).sendKeys(Keys.ENTER);
		
	}
}
