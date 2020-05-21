import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RandomValue {

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
		//
		List<WebElement> Products = driver.findElements(By.xpath("//div[@class='right-block']/div[1]/span[@class='price product-price']"));
		Random R = new Random();
		int randomProduct = R.nextInt(Products.size());
		Products.get(randomProduct);
		System.out.println(randomProduct);
		System.out.println(Products.get(randomProduct).getText());
        String S = Products.get(randomProduct).getText();
		
		
		WebElement RValue = driver.findElement(By.xpath("//div[@class='right-block']/div/span[contains(text(),'"+S +"')]"));
		
		Actions actions = new Actions(driver); 
		
		actions.moveToElement(RValue).build().perform();
		
		WebElement addToCart = driver.findElement(By.xpath("//div[@class='right-block']/div/span[contains(text(),'"+S +"')]/../..//span[contains(text(),'Add to cart')]"));
		addToCart.click();
		Thread.sleep(5000);
//		
		driver.close();
//		List<WebElement> addToCart = driver.findElements(By.xpath("//div[@class='right-block']/div[2]/a/span[contains(text(),'Add to cart')]"));
//		
//       // Actions actions = new Actions(driver);
//		
//		//actions.moveToElement((WebElement) addToCart).build().perform();
//		int randomvalue = R.nextInt(addToCart.size());
//		addToCart.get(randomvalue).click();
//		Thread.sleep(5000);
			
	     
	}

}
