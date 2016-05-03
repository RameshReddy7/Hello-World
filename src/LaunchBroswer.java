import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBroswer {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("harish");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("lade");
		driver.findElement(By.xpath("//input[@id='sex-0']")).click();
		// driver.findElement(By.xpath("//input[@id='sex-1']")).click();
		driver.findElement(By.xpath("//*[@id='exp-6']")).click();
		driver.findElement(By.xpath("//input[@id='profession-0']")).click();
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		driver.findElement(By.xpath("//input[@id='tool-0']")).click();
		driver.findElement(By.xpath("//input[@id='tool-1']")).click();
		driver.findElement(By.xpath("//input[@id='tool-2']")).click();
		driver.findElement(By.xpath("//select[@id='continents']/option[text()='Antartica']")).click();
		driver.findElement(By.xpath("//select[@id='selenium_commands']/option[text()='Browser Commands']")).click();
		driver.findElement(By.xpath("//select[@id='selenium_commands']/option[text()='Navigation Commands']")).click();
		driver.findElement(By.xpath("//select[@id='selenium_commands']/option[text()='Switch Commands']")).click();
		driver.findElement(By.xpath("//select[@id='selenium_commands']/option[text()='Wait Commands']")).click();
		driver.findElement(By.xpath("//select[@id='selenium_commands']/option[text()='WebElement Commands']")).click();
	}

}
