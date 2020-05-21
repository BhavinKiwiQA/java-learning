import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://Resource//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebElement menuoption = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[6]/a/span/span"));
		actions.moveToElement(menuoption).perform();
		System.out.println("Done Mouse hover on 'Menu'.");

		WebElement Submenu = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[6]/ul/li[2]/a/span/span"));
		Submenu.click();
		System.out.println("Done Mouse hover on 'SubMenu'.");
		Thread.sleep(3000);

		WebElement Firstname = driver
				.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input"));
		Firstname.sendKeys("Bhavin");
		Thread.sleep(2000);
		WebElement Lastname = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
		Lastname.sendKeys("Nayee");
		Thread.sleep(2000);
		WebElement submitbtn = driver.findElement(By.xpath("//*[@id=\"buttonwithclass\"]"));
		submitbtn.click();
		Thread.sleep(5000);
		driver.close();
	}

}
