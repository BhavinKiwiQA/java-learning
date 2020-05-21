import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://Resource//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/default.aspx");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		
		Select A = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		A.selectByValue("3");
		A.selectByValue("4");
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		driver.close();

	}

}
