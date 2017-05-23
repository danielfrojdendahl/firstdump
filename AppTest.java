package se.iths.mvn_test;

import org.junit.*;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.*;

import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class AppTest {

	protected WebDriver driver;
	
	@Before
	public void start() {
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-master\\geckodriver.exe");
    driver = new FirefoxDriver();
	}
	
	@Ignore
	@Test
	public void testgooglebookaddtocart() throws InterruptedException {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop");
		driver.findElement(By.className("col-sm-4")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
        Thread.sleep(1337);
		driver.findElement(By.xpath(".//*[@id='input-6']/div/button")).click();
		Thread.sleep(250);
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/cart/shoppingCart.html");
		assertEquals("Place your order", driver.getTitle());
		assertEquals("CAD18.99", driver.findElement(By.xpath(".//*[@id='mainCartTable']/tbody/tr[1]/td[3]/strong")).getText());
	}
	@Ignore
	@Test
	public void testspringbookaddtocart() throws InterruptedException {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@class='product-image']//*[contains(@src, 'spring')]")).click();
		Thread.sleep(750);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
        driver.findElement(By.xpath(".//*[@id='input-1']/div/button")).click();
        Thread.sleep(202);
        driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/cart/shoppingCart.html");
        assertEquals("Place your order", driver.getTitle());
        assertEquals("CAD39.99", driver.findElement(By.xpath(".//*[@id='mainCartTable']/tbody/tr[2]/td[3]/strong")).getText());
	}
	@Ignore
	@Test
	public void testnodebookaddtocart() throws InterruptedException {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@class='product-image']//*[contains(@src, 'node')]")).click();
		Thread.sleep(750);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
        driver.findElement(By.xpath(".//*[@id='input-2']/div/button")).click();
        Thread.sleep(200);
        driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/cart/shoppingCart.html");
        assertEquals("Place your order", driver.getTitle());
        assertEquals("CAD29.99", driver.findElement(By.xpath(".//*[@id='mainCartTable']/tbody/tr[3]/td[3]/strong")).getText());
	}
	@Ignore
	@Test
	public void testclickbusiness() throws InterruptedException {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		driver.findElement(By.xpath(".//*[@id='topMain']/li[2]/a/span")).click();
		Thread.sleep(250);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(350,350)");
		assertEquals("", driver.getTitle());
	}
	@Ignore
	@Test
	public void testenlargeimagegooglebook() throws InterruptedException {	
	driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
	Thread.sleep(250);
	driver.findElement(By.className("col-sm-4")).click();
	Thread.sleep(250);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("javascript:window.scrollBy(350,350)");
    Thread.sleep(250);
	driver.findElement(By.xpath("//div[@id='largeImg']/img")).click();
	assertEquals("The Big Switch", driver.getTitle());
	}
	@Ignore
	@Test
	public void testenlargeimagespringbook() throws InterruptedException {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		Thread.sleep(250);
		driver.findElement(By.xpath("//*[@class='product-image']//*[contains(@src, 'spring')]")).click();
		Thread.sleep(350);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(350,350)");
        Thread.sleep(250);
        driver.findElement(By.xpath("//div[@id='largeImg']/img")).click();
        assertEquals("Spring in Action", driver.getTitle());
	}
	@Ignore
	@Test
	public void testenlargeimagenodebook() throws InterruptedException {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		Thread.sleep(250);
		driver.findElement(By.xpath("//*[@class='product-image']//*[contains(@src, 'node')]")).click();
		Thread.sleep(350);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(350,350)");
        Thread.sleep(250);
        driver.findElement(By.xpath("//div[@id='largeImg']/img")).click();
        Thread.sleep(100);
        assertEquals("Node Web Development", driver.getTitle());
	}
	@Ignore
	@Test
	public void testaddpaastocart() throws InterruptedException {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/category/computer-books.html/ref=c:1");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@class='product-image']//*[contains(@src, 'paas')]")).click();
		Thread.sleep(750);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(350,350)");
        driver.findElement(By.xpath(".//*[@id='input-3']/div/button")).click();
        Thread.sleep(200);
        driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/cart/shoppingCart.html");
        assertEquals("Place your order", driver.getTitle());
        assertEquals("CAD19.99", driver.findElement(By.xpath(".//*[@id='mainCartTable']/tbody/tr[3]/td[3]/strong")).getText());
	}
	@Ignore
	@Test
	public void testenlargepaasbook() throws InterruptedException {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/category/computer-books.html/ref=c:1");
		Thread.sleep(250);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(350,350)");
		driver.findElement(By.xpath(".//*[@id='productsContainer']/div[2]/div")).click();
		Thread.sleep(250);
		js.executeScript("javascript:window.scrollBy(350,350)");
        Thread.sleep(250);
        driver.findElement(By.xpath("//div[@id='largeImg']/img")).click();
        assertEquals("Programming for PAAS", driver.getTitle());
	}
	
	
	@Test
	public void testcontactform() throws InterruptedException {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		Thread.sleep(75);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(400,500)");
		driver.findElement(By.xpath(".//*[@id='footer-section']/div[2]/div/div[3]/div/ul/li[4]/a")).click();
		//Bug found, as it prompts "ZERO_RESULTS"
		fail();
	}
	@Category(IntegrationTest.class)
	@Test
	public void testIntegration1() {
		assertNull(null);
	}
	
}
