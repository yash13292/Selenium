import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create driver object for firefox browser
		
		//we will strictly implement method of webdriver
		
		//invoke .exe file first
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\yash.mendiratta\\Desktop\\Selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		

	}

}