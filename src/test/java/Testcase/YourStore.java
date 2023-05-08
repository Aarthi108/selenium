package Testcase;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;

public class YourStore {
		By currencyBtn  = By.xpath("//form[@id='form-currency']/div/button/i");
		By euroSelection = By.name("EUR");
		By cameraBtn = By.linkText("Cameras");
	    By addtoCart = By.xpath("//div[@id='product-category']//div[2]//div[2]/button/i");
	    By selectError=By.xpath("//select[@id='input-option226']");
	    By homepage =By.xpath("//i[@class='fa fa-home']");
	    By iphone =By.linkText("iPhone");
	    By iphQty =By.id("input-quantity");
	    By addcart =By.xpath("//button[@id='button-cart']");
	    By maincart =By.xpath("//div/div[3]//div[1]/button");
	    By shpcart =By.xpath("//a[@title='Shopping Cart']/i");
	    By qtyVal =By.xpath("//div[@class='input-group btn-block']/input");
	    By updateBtn =By.xpath("//button[@data-original-title='Update']"); 
	    By Ecotext =By.xpath("//div[@class='col-sm-4 col-sm-offset-8']//tr[2]//td[2]"); 
	    By vattext =By.xpath("//div[@class='col-sm-4 col-sm-offset-8']//tr[3]//td[2]");
	    By chkOutBtn =By.xpath("//div[@class='buttons clearfix']/div[2]/a");
	    By loginBtn = By.id("button-login");
	    By RemoveBtn = By.xpath("//button[@class='btn btn-danger']/i");
	    By continueShp = By.linkText("Continue");
	    By MAC = By.linkText("MacBook");
	 	By couponCode = By.xpath("//a[@href='#collapse-coupon']/i");
	 	By couponText =By.id("input-coupon");
	 	By applyCoupon=By.id("button-coupon");
	 	By couponVoucher = By.xpath("//a[@href='#collapse-voucher']/i"); 
	 	By voucherText = By.id("input-voucher");
	 	By applyGift=By.id("button-voucher");
	 	By chkOutradioBtn =By.xpath("//input[@id='button-account']");
	 	By continuebtn =By.xpath("//input[@value='Continue']");
	 	By Firstname =By.xpath("//input[@id='input-payment-firstname']");
	 	By lastname =By.xpath("//input[@id='input-payment-lastname']");
	 	By email =By.xpath("//input[@id='input-payment-email']");
	 	By TelPhone =By.xpath("//input[@id='input-payment-telephone']");
		By password =By.xpath("//input[@id='input-payment-password']");
		By pwdConfirm =By.xpath("//input[@id='input-payment-confirm']");
		By company =By.xpath("//input[@id='input-payment-company']");
		By address1 =By.xpath("//input[@id='input-payment-address-1']");
		By address2 =By.xpath("//input[@id='input-payment-address-2']");
		By city =By.xpath("//input[@id='input-payment-city']");
		By postcode =By.xpath("//input[@id='input-payment-postcode']");
		By country =By.id("input-payment-country");
		By zone =By.id("input-payment-zone");
		By checkBox = By.xpath("//div[@class='buttons clearfix']/div//input");
		By continueBtn1 =By.id("button-register");
		By commentBox= By.name("comment");
		By checkBox1 = By.name("agree");
		By continueBtn2 =By.id("button-payment-method");
		By contactUs = By.linkText("Contact Us");
		By enquiry =By.id("input-enquiry");
		By Submit = By.xpath("//input[@value='Submit']");
 
	public  void store() throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sures\\eclipse-workspace\\Selenium\\src\\test\\resources\\drivers\\chromedriver.exe" );
			ChromeDriver driver1 = new ChromeDriver();	
			driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
			//TEST CASE:1
			driver1.get("http://tutorialsninja.com/demo/index.php");
			driver1.manage().window().maximize();
			//TEST CASE:2
            driver1.findElement(currencyBtn).click();
            driver1.findElement(euroSelection).click();
          //TEST CASE:3
            driver1.findElement(cameraBtn).click();
            driver1.executeScript("window.scrollBy(0,1000)");
            driver1.findElement(addtoCart).click();
           
            driver1.executeScript("window.scrollBy(0,1000)");
            
          WebElement m = driver1.findElement(selectError);
          String act = m.getText();
          System.out.println("Error message is:"+ act);
          System.out.println("No select option available");
        //TEST CASE:4
          driver1.findElement(homepage).click();
          driver1.executeScript("window.scrollBy(0,1000)");
          driver1.findElement(iphone).click();
          driver1.findElement(iphQty).clear();
          driver1.findElement(iphQty).sendKeys("2");
          driver1.findElement(addcart).click();
        //TEST CASE:5
          System.out.println("Success:You have added iPhone to your shopping cart! ");
        //TEST CASE:6
          driver1.findElement(maincart).click();			
          driver1.findElement(shpcart).click();	        
         
        //TEST CASE:7
          driver1.findElement(qtyVal).clear();
          driver1.findElement(qtyVal ).sendKeys("3");
          driver1.findElement(updateBtn).click();	
        //TEST CASE:8
          System.out.println("Success: You have modified your shopping cart!");
          driver1.executeScript("window.scrollBy(0,1000)");
          String Eco = driver1.findElement(Ecotext).getText();
          System.out.println("ECO TAX ="+ Eco);
          String vat = driver1.findElement(vattext).getText();
          System.out.println("VAT ="+ vat);
          driver1.findElement(chkOutBtn).click();
        //TEST CASE:9
          driver1.executeScript("window.scrollBy(0,500)");
          driver1.findElement(loginBtn).click();
          System.out.println("Error message is:Warning: No match for E-Mail Address and/or Password.");
          driver1.findElement(shpcart).click();	
          driver1.findElement(RemoveBtn).click();	
          System.out.println("cart is empty");
        //TEST CASE:10 
          WebElement wait1 =  new WebDriverWait(driver1,Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(continueShp));
          wait1.click();
//          driver1.findElement(continueShp).click();
          driver1.executeScript("window.scrollBy(0,1000)");
          driver1.findElement(MAC).click();
          driver1.executeScript("window.scrollBy(0,1000)");
          driver1.findElement(addcart).click();
          System.out.println("Success: You have added MacBook to your shopping cart!");
        //TEST CASE:11
          WebElement waitshp =  new WebDriverWait(driver1,Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(shpcart));
          waitshp.click();
//          driver1.findElement(shpcart).click();	
          driver1.executeScript("window.scrollBy(0,1000)");
          driver1.findElement(couponCode).click();	
          driver1.findElement(couponText).sendKeys("ABCD123 ");	
          driver1.findElement(applyCoupon).click();
          System.out.println("Warning: Coupon is either invalid, expired or reached its usage limit!");
        //TEST CASE:12
          driver1.executeScript("window.scrollBy(0,1000)");
          WebElement wait2 =  new WebDriverWait(driver1,Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(couponVoucher));
          wait2.click();
//          driver1.findElement(couponVoucher).click();
          driver1.findElement(voucherText).sendKeys("AXDFGH123");
          driver1.findElement(applyGift).click();
          System.out.println("Warning: Gift Certificate is either invalid or the balance has been used up!");
        //TEST CASE:13
          driver1.executeScript("window.scrollBy(0,1000)");
          WebElement wait3 =  new WebDriverWait(driver1,Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(couponCode));
          wait3.click();

//          driver1.findElement(couponCode).click();	
          driver1.findElement(couponText).clear();
          WebElement wait4 =  new WebDriverWait(driver1,Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(couponVoucher));
          wait4.click();
//          driver1.findElement(couponVoucher).click();
          WebElement wait5 =  new WebDriverWait(driver1,Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(voucherText));
          wait5.clear();
//          driver1.findElement(voucherText).clear();
          driver1.findElement(couponVoucher).click();
          driver1.executeScript("window.scrollBy(0,1000)");
         
          driver1.findElement(chkOutBtn).click();
        //TEST CASE:14
          driver1.findElement(chkOutradioBtn).click();
          driver1.findElement(continuebtn).click();
          driver1.findElement(Firstname).sendKeys("aarthi");
          driver1.findElement(lastname ).sendKeys("Bakthavatsalam");
          driver1.executeScript("window.scrollBy(0,1000)");
         
          driver1.findElement(TelPhone).sendKeys("7654678854");
          driver1.findElement(password).sendKeys("1234");
          driver1.findElement(pwdConfirm).sendKeys("1234");
          driver1.findElement(company).sendKeys("no.123,retbg,ch-63");
          driver1.findElement( address1).sendKeys("no13a/30,amman street");
          driver1.findElement( address2).sendKeys("no,12al20,avvaistreet");
          driver1.findElement(city).sendKeys("chennai");
          driver1.findElement(postcode).sendKeys("1234");
          driver1.findElement(country).click();
          Select country1 = new Select(driver1.findElement(By.id("input-payment-country")));
          country1.selectByValue("99");
          driver1.findElement(zone).click();
          Select zone1 = new Select(driver1.findElement(zone));
          zone1.selectByValue("1503");
          driver1.findElement(checkBox).click();
          Thread.sleep(2000);
          driver1.findElement(continueBtn1).click();
        //TEST CASE:15
          System.out.println("Warning: No Payment options are available. Please contact us for assistance!"); 
          Thread.sleep(2000);
          driver1.findElement(commentBox).sendKeys("Try to ship as soon as possible");
          driver1.findElement(checkBox1).click();
          driver1.findElement(continueBtn2).click();
          System.out.println("Warning: Payment method required!");
        //TEST CASE:16
          driver1.executeScript("window.scrollBy(0,1000)");
          Thread.sleep(2000);
          driver1.findElement(contactUs).click();
          driver1.findElement(enquiry).sendKeys("Unable to do payment shows warning");
          driver1.findElement(Submit).click();
          driver1.findElement(continueShp).click();    
	}
	

	public static void main(String[] args)throws InterruptedException  {
		YourStore t1 =  new YourStore();
		t1.store( );
	}

}/* By continueBtn2 =By.id("button-shipping-address");
By continueBtn3 =By.id("button-shipping-method");

*/  
/*
 * driver1.findElement(continueBtn2).click();
Thread.sleep(2000);
driver1.findElement(continueBtn3).click();
driver1.findElement(checkBox1).click();
*/

/* NEW CUSTOMER
  ;
  driver1.findElement(confirmBtn1).click();
  System.out.println("order confirm");*/

//}

	//private FluentWait<WebDriver> WebDriverWait(ChromeDriver driver1, int i) {
		// TODO Auto-generated method stub
		//return null;
	//}
