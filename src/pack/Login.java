package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\ansha\\OneDrive\\Desktop\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.findElement(By.name("username")).sendKeys("nehitha");
		driver.findElement(By.name("password")).sendKeys("gnhs");
		driver.findElement(By.name("//*[@id=\"loginForm\"]/div/div[3]")).click();
	}
	}
