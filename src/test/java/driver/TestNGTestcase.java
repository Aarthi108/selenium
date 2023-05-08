package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGTestcase {

public static WebDriver driver ;
String URL = "https://juice-shop.herokuapp.com/#/register";

By dismissBtn = By.xpath("//button//span[text()='Dismiss']");
By emailID = By.id("emailControl");
By passwordTxt = By.id("passwordControl");
By confirmPassword = By.id("repeatPasswordControl");
By secQnBox = By.xpath("//div[@id='mat-select-value-1']/span");
By secQn = By.xpath("//span[text()=' Your eldest siblings middle name? ']");
By secQnAns = By.id("securityAnswerControl");

@BeforeClass
public void beforeClass() {
driver = new ChromeDriver();
}

@Test(priority = 1)
public void test1() {

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get(URL);

driver.findElement(dismissBtn).click();
driver.findElement(emailID).sendKeys("vijay@bharathi.com");
driver.findElement(passwordTxt).sendKeys("bharathi.1234");
}

@Test(priority = 2)
public void test2() {


driver.findElement(confirmPassword).sendKeys("bharathi.1234");
driver.findElement(secQnBox).click();
driver.findElement(secQn).click();
driver.findElement(secQnAns).sendKeys("vijay");

}
}

