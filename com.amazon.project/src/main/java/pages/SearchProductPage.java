package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchProductPage {
	
	
	public static WebDriver driver;
	
	public SearchProductPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
//	@FindBy(id="nav-search-submit-text")
//	WebElement submit;
	
//	@FindBy(xpath="//span/select")
//	WebElement sortDrop;
	
	@FindBy(xpath="//span[contains(text(),'Shri Vrinda Caring for Life- Lemon Honey Green Tea (12 Tea Bag Pack )')]")
	WebElement priceLow;
	
	
	public void searchProduct(String product) {
		search.sendKeys(product);
	}
	public void clickOnSeacrchBtn() throws Exception {
		
		
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		
		//submit.click();
	}
	
	
	public void sortInOrder() {
		
		Select select = new Select(driver.findElement(By.xpath("//span/select")));
		select.selectByVisibleText("Price: Low to High");
	}
	
	public void clickOnProduct() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		priceLow.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
