package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {
	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.get("https://www.objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void testLocaters() {
//		Stroing web element by WebElement method
		WebElement NAME_ELEMENT = driver.findElement(By.name("firstname"));
		NAME_ELEMENT.click();
//		Stroing web element by By class
		By NAME_LOCATOR = By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input");
		
		driver.findElement(By.name("firstname")).sendKeys("malak");
		driver.findElement(By.id("exp-0")).click();
//		to upload file
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\Abdel Ali\\Desktop\\malaktech\\ap homwork.txt");
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("TF-API Product")).click();
		driver.navigate().back();
//		driver.findElement(By.cssSelector("input#exp-5")).click();
//		driver.findElement(By.cssSelector("input[id='profession-1']")).click();
//		driver.findElement(By.cssSelector("input[value='Manual Tester']")).click();
		driver.findElement(By.cssSelector("input[id='tool-0'][type='checkbox']")).click();
//		html/body/div/div[2]/div[2]/form/div[10]/input
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("Ali");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("123");
//		driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
		driver.findElement(By.xpath("//strong[text()='Link Test : Page Change']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text(),'API Documentations')]")).click();
	}

	@After
	public void tearDown() {
//		driver.close();
//		driver.quit(); 
	}

}
