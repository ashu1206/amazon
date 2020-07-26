package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public  WebDriver driver;
	
	public void browserInit(String url) {
		
		System.setProperty("webdriver.chrome.driver", "./chromeDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
	}

}
