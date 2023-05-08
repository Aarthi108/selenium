package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements_textbox {
	
	public static  void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sures\\eclipse-workspace\\Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/books");
		WebElement elementclick = driver.findElement(By.className("element-group"));
		elementclick.click();
		
		WebElement textBox =driver.findElement(By.id("item-0"));
		textBox.click();
		
		WebElement fullNameTextBox=driver.findElement(By.id("userName"));
		fullNameTextBox.sendKeys("aarthibakthavatsalam");
		
		WebElement emailTextBox =driver.findElement(By.id("userEmail"));
		emailTextBox.sendKeys("bakthaarthi96@gmail.com");
		
		WebElement currentAddressTextBox=driver.findElement(By.id("currentAddress"));
		currentAddressTextBox.sendKeys("919 , gshggh,apt 28, 19016,pa");
		
		WebElement permenentAddressTextBox =driver.findElement(By.id("permanentAddress"));
		permenentAddressTextBox.sendKeys("919 , gshggh,apt 28, 19016,pa");
		
		WebElement submitclickButton = driver.findElement(By.id("submit"));
		submitclickButton.click();
		
		
		
		
		
	}

}
