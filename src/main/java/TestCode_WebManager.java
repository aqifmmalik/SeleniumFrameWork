import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCode_WebManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
 
	}

}
