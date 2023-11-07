package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ansha\\OneDrive\\Desktop\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://demo.guru99.com/test/drag_drop.html");
WebElement From=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
WebElement To = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
Actions act = new Actions(driver);
act.dragAndDrop(From, To). build().perform();
}
}
