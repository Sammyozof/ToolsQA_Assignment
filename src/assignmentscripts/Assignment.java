package assignmentscripts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://demoqa.com/books");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("newUser")).click();
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Samuel");
		System.out.println("First Name is:" + driver.findElement(By.xpath("//input[@id='firstname']")).getAttribute("value"));
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Ozofereh");
		System.out.println("Last Name is:" + driver.findElement(By.xpath("//input[@id='lastname']")).getAttribute("value"));
		driver.findElement(By.id("userName")).sendKeys("sammy2121");
		System.out.println("User Name is:" + driver.findElement(By.id("userName")).getAttribute("value"));
		driver.findElement(By.id("password")).sendKeys("Condoct22@@");
		System.out.println("Password is:" + driver.findElement(By.id("password")).getAttribute("value"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500)");
		
		driver.findElement(By.id("gotologin")).click();
		
		driver.findElement(By.id("userName")).sendKeys("sammy2121");
		System.out.println("Enter the User Name as:" + driver.findElement(By.id("userName")).getAttribute("value"));
		driver.findElement(By.id("password")).sendKeys("Condoct22@@");
		System.out.println("Enter the Password as:" + driver.findElement(By.id("password")).getAttribute("value"));
		driver.findElement(By.xpath("//button[@id='login']")).click();
		
		WebElement gotoStore = driver.findElement(By.xpath("//button[@id='gotoStore']"));
		js.executeScript("arguments[0].scrollIntoView(true);", gotoStore);
		gotoStore.click();
		driver.findElement(By.id("searchBox")).sendKeys("Speaking JavaScript");
		System.out.println("Enter the Book for Searching as:" + driver.findElement(By.id("searchBox")).getAttribute("value"));
		Thread.sleep(2000);
		driver.findElement(By.linkText("Speaking JavaScript")).click();
		
		WebElement addToCollection = driver.findElement(By.xpath("(//button[@id='addNewRecordButton'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true);", addToCollection);
		Thread.sleep(2000);
		addToCollection.click();
		
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Thread.sleep(3000);//This will get the text on the pop up alert
		alert.accept();
		
		
	}

}