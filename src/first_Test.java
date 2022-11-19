import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class first_Test {

	public WebDriver driver;
	Keys ktestKey = Keys.ARROW_DOWN;
	Keys etestKey = Keys.ENTER;

	@BeforeTest
	public void Login() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@Test()
	public void Press () {
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("swag lab");
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).sendKeys(ktestKey);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).sendKeys(etestKey);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3/span")).click();
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	}
	@Test()
	public void SelectAllItems() {
		List <WebElement> clickToAdd = driver.findElements(By.className("btn_primary"));
		for(int i=0 ; i<clickToAdd.size();i++) {
			clickToAdd.get(i).click();
		}
		}
	@Test()
	public void removeAllFromCart() {
		List <WebElement> clickToRemove = driver.findElements(By.className("btn_secondary"));
		for(int i=0;i<clickToRemove.size();i++) {
			clickToRemove.get(i).click();
		}
		String ActualItems = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).getText();
		String expectedItemsInCart="";
		Assert.assertEquals(ActualItems, expectedItemsInCart);
	}
	@Test()
	public void test_All_Items() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).click();
		Thread.sleep(1000);
		driver.navigate().back();






	}
	
	
	

}
