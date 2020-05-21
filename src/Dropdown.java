import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E://Resource//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		
		//Select s = new Select(driver.findElement(By.id("select-demo")));
		//s.selectByValue("Tuesday");
		//s.selectByIndex(4);
		//s.selectByVisibleText("Thursday");
		
		Select D = new Select(driver.findElement(By.id("multi-select")));
		D.selectByValue("Florida");
		D.selectByIndex(3);
		Thread.sleep(1000);
		D.deselectByValue("New York");
		
		driver.close();
		
	}
	 	
}
