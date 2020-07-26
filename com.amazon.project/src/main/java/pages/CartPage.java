package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	public static WebDriver driver;
	
	public CartPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="add-to-cart-button")
	WebElement addFirstClick;
	
	@FindBy(xpath="//img[@alt='Chaiology Himalayan Green Tea, 250gm (178 Cups)']")
	WebElement addSecondClick;
	
	@FindBy(xpath="//a[@id='nav-cart']//span[contains(text(),'Cart')]")
	WebElement goToCart;
	
	@FindBy(xpath="//input[@aria-label='Delete Chaiology Himalayan Green Tea, 250gm (178 Cups)']")
	WebElement delete;
	
	@FindBy(xpath="//div[contains(text(),'Proceed to Buy')]")
	WebElement buy;

	
	public void verifyProductPage() {
		
		String parent = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		System.out.println("Total window open are: "+count);
		
		for(String child:allWindows) {
			
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				
				String childWin = driver.getTitle();
				System.out.println(childWin);
			}
		}
 	}
	
	public void addFirstProduct() {
		
		addFirstClick.click();
	}
	
	public void addSecondProduct() {
		
		addSecondClick.click();
		driver.findElement(By.id("add-to-cart-button")).click();
	}
	
	public void clickOnCart() {
		
		goToCart.click();
	}
	
	public void deleteTheProduct() {
		
		delete.click();
	}
	
	public void proceedToBuy() {
		
		buy.click();
	}
	
}
