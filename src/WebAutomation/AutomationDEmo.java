package WebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationDEmo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers for selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();

		// Static Dropdown =The following step will select the correct currency from
		// dropdown(Static Dropdown)
		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("GBP");
		System.out.println(select.getFirstSelectedOption().getText());// This will get the text from the dropdown

		// Selecting number of Passengers from list
		driver.findElement(By.id("divpaxinfo")).click();// This will click the passengers dropdown
		Thread.sleep(2000);
		WebElement Adultdrop = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select Adultpassengers = new Select(Adultdrop);
		Adultpassengers.selectByValue("4");
		WebElement Childdrop = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		Select Childpassengers = new Select(Childdrop);
		Childpassengers.selectByValue("2");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		// Select From From and To Destination
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();

		// Select the current date for the travel
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

	}

}
