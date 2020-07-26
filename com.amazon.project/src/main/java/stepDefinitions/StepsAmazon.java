package stepDefinitions;

import org.junit.Assert;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CartPage;
import pages.LoginPage;
import pages.SearchProductPage;

public class StepsAmazon extends Base {
	
	LoginPage login_page;
	SearchProductPage searchProductpage;
	CartPage addCart;
		
	@Given("launch the browser with {string}")
	public void launch_the_browser_with(String url) {
		
		browserInit(url);
	    
	}

	@Then("click on sign in")
	public void click_on_sign_in() {
		
		LoginPage login_page = new LoginPage(driver);
		login_page.clickSignIn();
	}

	@Then("enter the mobile {string}")
	public void enter_the_mobile(String username) {
		
		LoginPage login_page = new LoginPage(driver);
		login_page.enterEmail(username);
	   
	}

	@Then("click on continue")
	public void click_on_continue() {
		
		LoginPage login_page = new LoginPage(driver);
		login_page.clickOnContinue();
	    
	}

	@Then("enter the pass {string}")
	public void enter_the_pass(String password) {
		
		LoginPage login_page = new LoginPage(driver);
		login_page.enterPassword(password);
	    
	}

	@Then("click on login")
	public void click_on_login() {
		
		LoginPage login_page = new LoginPage(driver);
		login_page.clickOnLogin();
	    
	}

	@Then("verify that you are at home page")
	public void verify_that_you_are_at_home_page() {
		
		String actual = driver.getTitle();
		System.out.println("The actual title is: "+actual);
		String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		Assert.assertEquals("The actual and expected tilte matches", expected, actual);
	    
	}
	
	
	@Then("search for your desired product {string}")
	public void search_for_your_desired_product(String product) throws Exception {
		
		SearchProductPage searchProductpage = new SearchProductPage(driver);
		searchProductpage.searchProduct(product);
		searchProductpage.clickOnSeacrchBtn();
	}

	@Then("sort by lowest price")
	public void sort_by_lowest_price() {
		
		SearchProductPage searchProductpage = new SearchProductPage(driver);
		searchProductpage.sortInOrder();
	}

	@Then("click on the lowest price product")
	public void click_on_the_lowest_price_product() {
		
		SearchProductPage searchProductpage = new SearchProductPage(driver);
		searchProductpage.clickOnProduct();
	}
	
	@Then("verify the page title")
	public void verify_the_page_title() {
		
		CartPage addCart = new CartPage(driver);
		addCart.verifyProductPage();
	}

	@Then("add the product to the cart")
	public void add_the_product_to_the_cart() {
		
		CartPage addCart = new CartPage(driver);
		addCart.addFirstProduct();
	}

	@Then("add a product again to the cart")
	public void add_a_product_again_to_the_cart() {
		
		CartPage addCart = new CartPage(driver);
		addCart.addSecondProduct();
	}

	@Then("go to the cart")
	public void go_to_the_cart() {
		
		CartPage addCart = new CartPage(driver);
		addCart.clickOnCart();
	}

	@Then("delete one of the product")
	public void delete_one_of_the_product() {
		
		CartPage addCart = new CartPage(driver);
		addCart.deleteTheProduct();
	}

	@Then("click on to buy")
	public void click_on_to_buy() {
		
		CartPage addCart = new CartPage(driver);
		addCart.proceedToBuy();
	}





}
