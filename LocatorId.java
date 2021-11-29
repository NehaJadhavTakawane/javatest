package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "D:/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();	
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("jneha9996@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.linkText("Forgotten password?")).click();
        driver.findElement(By.name("reset_action")).click();
        driver.findElement(By.cssSelector("inputtext _9o1w _9o1")).click();
        driver.close();
       
        
	}

}
