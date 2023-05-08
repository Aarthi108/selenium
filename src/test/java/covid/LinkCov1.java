package covid;
import java.time.Duration;

import java.util.List;


import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class LinkCov1 {
	
	

	public static WebDriver driver;
	public static Actions actions;
	By oxygenBtn = By.xpath("//div[@class='flex items-center justify-around flex-wrap my-2 font-semibold']/div");
//	By searchFld = By.id("searchField");
	By verified = By.id("verified");
	By medicineBtn = By.xpath("//span[text()='Medicine']");
	By stateDropDownBtn= By.xpath("//label[text()='Select State']/following::select[@id='Select State']");
	By stateSelect = By.linkText("West Bengal");
	
	
	@BeforeClass
	@Test
	public void BeforeClass()
	{
		driver = new ChromeDriver();
	    driver.get("https://life.coronasafe.network/");	
	    actions = new Actions(driver);
	}
	@Test
	public void oxygenlaunch()
	{
	
	    driver.get("https://life.coronasafe.network/");	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(oxygenBtn).click();
		WebElement searchFld   = driver.findElement(By.id("searchField"));
		actions.sendKeys(searchFld ,"chennai"+Keys.ENTER).perform();
		WebElement  verifyBtn  = driver.findElement(By.id("verified"));
		actions.moveToElement(verifyBtn).click(verifyBtn).perform();
		System.out.println("im in");
		List<WebElement> nameHos = driver.findElements(By.xpath("//h1[@class='font-bold text-lg md:text-xl capitalize text-center']"));
		for(WebElement hospitalName : nameHos)
		System.out.println("hospital names having oxygen in chennai /n" +hospitalName.getText());
		}
	@Test	
	public void medicinelaunch2() throws InterruptedException
	{    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(medicineBtn);
		WebElement searchFld   = driver.findElement(By.id("searchField"));
		actions.sendKeys(searchFld ,"mumbai"+Keys.ENTER).perform();
	   Select dropdown = new Select (driver.findElement(By.xpath("//label[text()='Select State']/following::select[@id='Select State']")));
		dropdown.selectByVisibleText("West Bengal");
		Thread.sleep(3000);
		List<WebElement> medecinhos = driver.findElements(By.xpath("//h1[@class='font-bold text-lg md:text-xl capitalize text-center']"));
		for(WebElement hospitalname : medecinhos)
			System.out.println("hospital name in west bengal with medicine /n"+hospitalname.getText());
	}
}
		
		


