
package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pets_store {
	
	public void signIn()
	{ 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sures\\eclipse-workspace\\Selenium\\src\\test\\resources\\drivers\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://petstore.octoperf.com/actions/Catalog.action  ");
		
		
		WebElement SignIn =driver.findElement(By.linkText("Sign In"));
		SignIn.click();
		driver.findElement(By.linkText("Register Now!")).click();
		driver.findElement(By.name("username")).sendKeys("aarthi@234");
		driver.findElement(By.name("password")).sendKeys("@@thi654");
		driver.findElement(By.name("repeatedPassword")).sendKeys("@@thi654");
		driver.findElement(By.name("account.firstName")).sendKeys("Aarthi");
		driver.findElement(By.name("account.lastName")).sendKeys("Bakthavatsalam");
		driver.findElement(By.name("account.email")).sendKeys("bakthaarthi96@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("4565525625");
		driver.findElement(By.name("account.address1")).sendKeys("123,st aveneue,ap a28,19016");
		driver.findElement(By.name("account.address2")).sendKeys("234,st park,apt234,19876");
		driver.findElement(By.name("account.city")).sendKeys("philedelpia");
		driver.findElement(By.name("account.state")).sendKeys("pennsilvenia");
		driver.findElement(By.name("account.zip")).sendKeys("19018");
		driver.findElement(By.name("account.country")).sendKeys("usa");
		driver.executeScript("window.scrollBy(0,1000)");
		Select droplang = new Select(driver.findElement(By.name("account.languagePreference")));
		droplang.selectByVisibleText("english");
//	    driver.findElement(By.xpath("//<options[@value='english']")).click();
	    
	    
		
		Select droplang2 = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
		droplang2.selectByVisibleText("CATS");
//		driver.findElement(By.xpath("//<options[@value='CATS']")).click();
		driver.findElement(By.name("account.listOption")).click();
		driver.findElement(By.name("account.bannerOption")).click();
		driver.findElement(By.name("newAccount")).click();
		driver.findElement(By.linkText("Sign In"));
			
	}

	public static void main(String[] args) {
		Pets_store p1 = new Pets_store();
		p1.signIn();
	}
}
