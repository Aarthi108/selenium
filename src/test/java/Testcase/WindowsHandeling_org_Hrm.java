package Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.input.model.MouseButton;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WindowsHandeling_org_Hrm {
	public static WebDriver driver;
	public static Actions action;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    
	By passWord = By.xpath("//input[@name ='password']");
	By myinfo = By.xpath("//li//span[text()='My Info']");
	By contactDetails = By.xpath("//div//a[text()='Contact Details']");
	By street1 = By.xpath("//form//div//div//div//div[2]//input");
	By street2 = By.xpath("//form//div//div//div[2]//div[2]//input");
	By city = By.xpath("//form//div//div//div[3]//div[2]//input");
	By state = By.xpath("//form//div//div//div[4]//div[2]//input");
	By zip = By.xpath("//form//div//div//div[5]//div[2]//input");
	By dropdwnbtn = By.xpath("//div[@class='oxd-select-text--after']");
	By country = By.xpath("//div[@role='listbox']//*[text()='India']");
	By homeText = By.xpath("//label[text()='Home']/following::input[1]"); 
	By mobileText = By.xpath("//label[text()='Mobile']/following::input[1]");
	By workText = By.xpath("//label[text()='Work']/following::input[1]");
	By workEmail = By.xpath("//label[text()='Work Email']/following::input[1]");
	By otherEmail = By.xpath("//label[text()='Other Email']/following::input[1]");
    By save = By.xpath("//button[@type='submit']");
	@BeforeClass
	public void Beforeclass()
	{
		driver= new ChromeDriver();
		action = new Actions(driver);
		
	}
	@Test
	@BeforeMethod
	public void launching() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement( By.xpath("//input[@name ='username']")).sendKeys("Admin");
		driver.findElement(passWord).sendKeys("admin123");
//		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();	
		driver.findElement(myinfo).click();
	}
	    @Test 
		public void contactDetails() throws InterruptedException
		{

		driver.findElement(contactDetails).click();
//		WebElement wait = new WebDriverWait(driver,Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(street1));
//		wait.click(); 
	    Thread.sleep(3000);
		driver.findElement(street1).click();
		driver.findElement(street1).sendKeys("no.13a45");
		driver.findElement(street2).sendKeys("anna nagar");
		driver.findElement(city).sendKeys("chennai");
		driver.findElement(state).sendKeys("tamilnadu");
		driver.findElement(zip).sendKeys("600063");
		driver.findElement(dropdwnbtn).click();
		driver.findElement(country).click();
        driver.findElement(homeText).sendKeys("5536536369");
        driver.findElement(mobileText).sendKeys("6536536736");
        driver.findElement(workText).sendKeys("9536536936");
        driver.findElement(workEmail).sendKeys("bakthfdt@gmail.com");
        driver.findElement(otherEmail).sendKeys("bakth123fdt@gmail.com");
        Thread.sleep(3000);
        action.sendKeys(Keys.ENTER).perform();	
        driver.findElement(save).click();
		}
	    @Test 
		public void emergencyDetails() throws InterruptedException
		{
	    	
		}
		
	}
	


