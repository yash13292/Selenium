import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create driver object for chrome browser
		
		//we will strictly implement method of webdriver
		
		//invoke .exe file first
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yash.mendiratta\\OneDrive - Tavant Technologies\\Documents\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.findElement(By.id("email")).sendKeys("This is my first code");
		
		
		//System.out.println(driver.getTitle());  //Validate page title
		
		//System.out.println(driver.getCurrentUrl());  //Validate URL
		
		//System.out.println(driver.getPageSource());  //Print Page source
		
		//driver.get("https://www.google.co.in/");
		//driver.navigate().back();
		//driver.close();  //Close current browser
		//driver.quit();  //Close all browsers opened by selenium
		
	

	}

}
	