package selenium;


import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Cosmo_code {
	
	public void cos()
	{
		//launching browser	

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sures\\eclipse-workspace\\Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
	    driver1.get("https://cosmocode.io/automation-practice/");
	    
	    
	    driver1.executeScript("window.scrollBy(0,1000)");
	    //textbox
	    driver1.findElement(By.id("firstname")).sendKeys("Aarthi");
	    driver1.findElement(By.xpath("//input[@class='lastname']")).sendKeys("Bakth");
	    //radio button
	    driver1.findElement(By.xpath("//input[@value='Female']")).click();
	    
	    //scroll down
	    driver1.executeScript("window.scrollBy(0,1000)");
	    

	    //checkBOX
	    driver1.findElement(By.name("language_java")).click();
	    driver1.findElement(By.name("language_python")).click();
	    driver1.findElement(By.name("language_c")).click();
	    driver1.findElement(By.name("language_vbs")).click();
	   
	    //dropdown
	   Select dropdown =new  Select(driver1.findElement(By.name("age")));
	   dropdown.selectByVisibleText("Under 20");
	    
	   //BUTTON
	   driver1.findElement(By.id("submit_htmlform")).click();
	   
	   //LINK
	   driver1.findElement(By.linkText("Click Me to open New Window"));
	   
	   driver1.findElement(By.partialLinkText("open New Window")).click();

			
	}
	
	
	public static void main(String[] args) {
		
		Cosmo_code  d1 = new Cosmo_code();
		d1.cos();
		
	
	}

}
