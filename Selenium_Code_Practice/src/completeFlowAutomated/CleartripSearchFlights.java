package completeFlowAutomated;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CleartripSearchFlights {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Code\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cleartrip.com/");
		driver.manage().window().maximize();
		//// p[text()='One way']//parent::div//preceding-sibling::div//child::input
		Thread.sleep(3000);
		WebElement radio = driver
				.findElement(By.xpath("//p[text()='One way']//parent::div//preceding-sibling::div//child::span"));

		radio.click();

		 driver.findElement(
		 By.xpath("//*[text()='Depart on']/parent::div/parent::div/following-sibling::div/descendant::button"))
		 .click();
		 
		 Thread.sleep(5000);
		// System.out.println(radio.getText());
		// date
		driver.findElement(By.xpath(
				"//div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected DayPicker-Day--today']"))
				.click();
	//	System.out.println(driver.findElement(By.xpath("//div[@aria-selected='true']")).getText());

		
		  Select adult = new Select(driver.findElement(By.xpath(
		  "//*[text()='Adults']//parent::div//select"))); adult.selectByIndex(2); //
		//  Thread.sleep(3000);
		  
		  Select children = new Select(driver.findElement(By.xpath(
		  "//*[text()='Children']//parent::div//select"))); children.selectByIndex(2);
		  // Thread.sleep(3000);
		  
		  Select infants = new Select(driver.findElement(By.xpath(
		  "//*[text()='Infants']//parent::div//select"))); infants.selectByIndex(2); //
		//  Thread.sleep(3000);
		  
		  driver.findElement(By.
		  xpath("//a[text()='Class of travel, Airline preference']")).click();
		  
		  Select class_of = new Select( driver.findElement(By.
		  xpath("//*[text()='Class of travel']//parent::div//select")));
		  class_of.selectByIndex(2);
		  
		  driver.findElement(By.xpath("//input[@placeholder='Airline name']")).sendKeys
		  ("SpiceJet");
		  
		  driver.findElement(By.xpath("//input[@type='checkbox']//following-sibling::*"
		  )).click();
		  
		  driver.findElement(By.xpath("//button[text()='Search flights']")).click();
		  
		  Assert.assertEquals(driver .findElement(By.
		  xpath("//span[text()='Select Departure and Arrival airports/cities.']")).
		  getText(), "Select Departure and Arrival airports/cities.");
		 

	}

}
