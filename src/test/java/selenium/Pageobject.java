package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pageobject {
	
	By elementbtn= By.className("element-group");
    By textbtn = By.id("item-0");
    By username = By.id("userName");
    By email = By.id("userEmail");
    By currentadd = By.id("currentAddress");
    By permentnadd = By.id("permanentAddress");
    By submit= By.id("submit");
    
    public void pageob()
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\sures\\eclipse-workspace\\Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/books");
		
	    driver.findElement(elementbtn).click();
		driver.findElement(textbtn).click();
		driver.findElement(username).sendKeys("aarthibakthavatsalam");
		driver.findElement(email).sendKeys("bakthaarthi96@gmail.com");
		driver.findElement(currentadd).sendKeys("919 , gshggh,apt 28, 19016,pa");
		driver.findElement(permentnadd).sendKeys("919 , gshggh,apt 28, 19016,pa");
		driver.findElement(submit).click();
		

    }

	public static void main(String[] args) {
		Pageobject p1= new Pageobject();
		p1.pageob();
		
	}

}
