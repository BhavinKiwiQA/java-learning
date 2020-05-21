import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MaxValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E://Resource//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement Signin = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		Signin.click();
		
		WebElement Emailtext = driver.findElement(By.xpath("//input[@id='email']"));
		Emailtext.sendKeys("bhavin.nayee@kiwiqa.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='passwd']"));
		Password.sendKeys("bhavin4711");
		
		WebElement Signbtn = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		Signbtn.click();
		
		Thread.sleep(2000);
		
		WebElement Women = driver.findElement(By.xpath("//a[@title='Women']"));
		Women.click();
		
		Thread.sleep(1000);
		
		List<WebElement> Products = driver.findElements(By.xpath("//div[@class='right-block']/div[1]/span[@class='price product-price']"));
	//	List<WebElement> addToCart = driver.findElements(By.xpath("//div[@class='right-block']/div[2]/a/span[contains(text(),'Add to cart')]"));
			
		
		List<String> price = new ArrayList<String>();
		


		for(WebElement FirstProduct : Products) {
			
//			String gettxt = FirstProduct.getText();
//			System.out.println(gettxt);
			price.add(FirstProduct.getText());
			System.out.println(price);
		}
			String max = Collections.max(price);
			System.out.println(max);
			
			
			WebElement Maximum = driver.findElement(By.xpath("//div[@class='right-block']/div/span[contains(text(),'" +max + "')]"));
			
			Actions actions = new Actions(driver);
			
			actions.moveToElement(Maximum).build().perform();
			
			WebElement Maxclk = driver.findElement(By.xpath("//div[@class='right-block']/div/span[contains(text(),'" +max + "')]/../..//span[contains(text(),'Add to cart')]"));
			Maxclk.click();
			
			Thread.sleep(3000);
			

		driver.close();
	}

		
	}
