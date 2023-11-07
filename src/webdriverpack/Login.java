package webdriverpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stuby
		System.setProperty("webdriver.chrome.driver",  \"C:\\\\Users\\\\ansha\\\\OneDrive\\\\Desktop\\\\selenium webdriver\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("nehitha");
		driver.findElement(By.id("pass")).sendKeys("123");
		driver.findElement(By.name("login")).click();

	}

}
