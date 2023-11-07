package pack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\ansha\\OneDrive\\Desktop\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Forgotten password?")).click();
	Set<String>a=driver.getWindowHandles();
	Iterator<String>it=a.iterator();
	while(it.hasNext())
	{
		String childwindow=it.next();
		driver.switchTo().window(childwindow);
	}
}
}
