package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Next1 {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.myntra.com/shop/men");
			driver.close();

	}

}
