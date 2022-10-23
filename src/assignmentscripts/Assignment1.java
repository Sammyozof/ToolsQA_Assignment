package assignmentscripts;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoqa.com/books");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("newUser")).click();
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Samuel");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Ozofereh");
		driver.findElement(By.id("userName")).sendKeys("sammy2121");
		driver.findElement(By.id("password")).sendKeys("Condoct22@@");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500)");
		
		driver.findElement(By.id("gotologin")).click();
		
		driver.findElement(By.id("userName")).sendKeys("sammy2121");
		driver.findElement(By.id("password")).sendKeys("Condoct22@@");
		driver.findElement(By.xpath("//button[@id='login']")).click();
		
		js.executeScript("window.scrollBy(0, 900)");
		
		driver.findElement(By.xpath("//button[@id='gotoStore']")).click();
		driver.findElement(By.id("searchBox")).sendKeys("Speaking JavaScript");
		driver.findElement(By.linkText("Speaking JavaScript")).click();
		
		js.executeScript("window.scrollBy(0, 900)");
		driver.findElement(By.id("addNewRecordButton")).click();
		//driver.quit();
		
	}
	

}
