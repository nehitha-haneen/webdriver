package webdriverpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage {
	public static void main(String[] args)
	{
		System.getProperty("webdriver.chrome.driver\\\" , \\\"C:\\\\\\\\Users\\\\\\\\ansha\\\\\\\\OneDrive\\\\\\\\Desktop\\\\\\\\selenium webdriver\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		System.out.println("Title is"+driver.getTitle());
		String expected="Guru99 Bank Home Page";
		String actual=driver.getTitle();
		if(expected.contentEquals(actual))
		{
			System.out.println("test case passed");
		}
		else
		{
		System.out.println("test case failed");
	}
}
}
