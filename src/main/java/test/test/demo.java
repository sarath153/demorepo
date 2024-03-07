package test.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) {
//		 System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
		
		WebDriverManager.chromedriver().setup();

	        // Initialize Chrome webdriver
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        // URL of the website you want to navigate to
	        String websiteUrl = "https://www.facebook.com/";

	        // Open the website
	        driver.get(websiteUrl);

	        try {
	            // Find the button element by its ID, class, xpath, or any other suitable method
	            driver.findElement(By.xpath("//*[@placeholder='Email address or phone number']")).sendKeys("123");
	            Thread.sleep(5000);

	            // Click the button
	           

	            System.out.println("Button clicked successfully!");
	        } catch (Exception e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        } finally {
	            // Close the webdriver
	            driver.quit();
	        }

	}

}
