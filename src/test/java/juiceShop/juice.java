package juiceShop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import java.util.ArrayList;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class juice {
	public static WebDriver driver;
	@FindBy(xpath="//button//span[text()='Dismiss']")WebElement popUp;
	@FindBy(id="emailControl")WebElement email;
	@FindBy(id="passwordControl")WebElement password;
	@FindBy(id="repeatPasswordControl")WebElement repeat_Password;
	@FindBy(xpath="//span[@class='mat-slide-toggle-bar']")WebElement showPassword;
	@FindBy(id="mat-select-value-1")WebElement sequrity_Question;
	@FindBy(xpath="//span[text()=' Your eldest siblings middle name? ']")WebElement sequrity_Question_DropDown;
	@FindBy(id="securityAnswerControl")WebElement security_Answer;
	@FindBy(xpath="//button[@id='registerButton' ]") WebElement registerButton;
	
	@FindBy(xpath="//div[@id='alreadyACustomerLink']/a") WebElement alreadyACustomer;
	@FindBy(id="email") WebElement loginEmail;
	@FindBy(id="password")WebElement loginpassword;
	@FindBy(id ="loginButton") WebElement loginButton;
	
	@FindBy(xpath="//div[text()=' Apple Juice (1000ml) ']/../../../div//span[text()='Add to Basket']") WebElement apple_juice_ADD_TC;
	@FindBy(xpath="//div[text()=' Banana Juice (1000ml) ']/../../../div//span[text()='Add to Basket']") WebElement banana_juice_ADD_TC;
	@FindBy(xpath="//div[text()=' 1 – 12 of 35 ']/../button[2]//span") WebElement next_button;
	@FindBy(xpath="//div[text()=' OWASP Juice Shop Logo (3D-printed) ']/../../../div//span[text()='Add to Basket']") WebElement juicelogo_button;
	@FindBy(xpath="//span[text()=' Your Basket']") WebElement shoppingCart;
	@FindBy(xpath="//mat-cell[text()=' Apple Juice (1000ml) ']/..//button[2]//*[@class='svg-inline--fa fa-plus-square fa-w-14']") WebElement quantityOfItems1;
	@FindBy(xpath="//mat-cell[text()=' Banana Juice (1000ml) ']/..//button[2]//*[@class='svg-inline--fa fa-plus-square fa-w-14']") WebElement quantityOfItems2;
	@FindBy(xpath="//mat-cell[text()=' OWASP Juice Shop Logo (3D-printed) ']/..//button[2]//*[@class='svg-inline--fa fa-plus-square fa-w-14']") WebElement quantityOfItems3;
	@FindBy(id="checkoutButton")WebElement checkoutButton;
	
	@FindBy(xpath = "//span[text()='Add New Address']")WebElement AddNewAddressBtn;
	@FindBy(xpath = "//*[@id='mat-input-7']")WebElement country;//*[@id='mat-input-8']
	@FindBy(xpath = "//*[@id='mat-input-8']")WebElement name;
	@FindBy(xpath = "//*[@id='mat-input-9']")WebElement mobileNumber;
	@FindBy(xpath = "//*[@id='mat-input-10']")WebElement zipcode;
	@FindBy(xpath = "//textarea[@id='address']")WebElement address;
	@FindBy(xpath = "//*[@id='mat-input-12']")WebElement city;
	@FindBy(xpath = "//*[@id='mat-input-13']")WebElement state;
	@FindBy(xpath = "//*[@class='material-icons' and text()=' send ']")WebElement submitBtn;
	
	
	@FindBy(xpath = "//*[@id='mat-radio-41']/label/span/span[2]")WebElement radioBtn;
	@FindBy(xpath = "//mat-icon[text()=' navigate_next ']")WebElement continueBtn;
	@FindBy(xpath = "//*[@id='mat-radio-42']/label/span//span[2]")WebElement radioBtn2;
	
	
	@FindBy(xpath = "//*[@id='mat-expansion-panel-header-0']//span[2]")WebElement DropdownBtn;
	@FindBy(xpath = "//*[@id='mat-input-14']")WebElement cardName;
	@FindBy(xpath = "//*[@id='mat-input-15']")WebElement cardNumber;
	@FindBy(xpath = "//*[@id='mat-input-16']")WebElement expiryMonth;
	@FindBy(xpath = "//select[@id='mat-input-17']")WebElement expiryYear;
	@FindBy(xpath = "//mat-radio-button[@id='mat-radio-45']//input")WebElement radioBtn3;//input[@id='mat-radio-46-input']
	@FindBy(xpath= "//*[@id='mat-expansion-panel-header-1']")WebElement dropdown;
	@FindBy(id = "coupon")WebElement addcoupon;////input[@placeholder='Please enter your coupon code']
	@FindBy(id = "applyCouponButton")WebElement redeem;
	@FindBy(xpath = "//div[@class='error ng-star-inserted']")WebElement errorMessage;
	@FindBy(id = "checkoutButton")WebElement placeOrder;
	@FindBy(id="navbarAccount")WebElement accountBtn;
	@FindBy(xpath = "//button/span[text()=' Orders & Payment ']")WebElement ordersPayment;
	@FindBy(xpath="//*[@id='mat-menu-panel-3']/div/button[1]") WebElement ordersHisrory;
	@FindBy(xpath = "//mat-icon[text()=' local_shipping ']")WebElement shipping;
	
	@FindBy(xpath="//span[text()=' Logout ']") WebElement logout;
//	@FindBy(xpath = "")WebElement radioBtn;
//	
//	//*[@id='mat-expansion-panel-header-4']/span[2]
	
	
	@BeforeMethod
	@Test
	public void url()
	{
		driver =  new ChromeDriver();
		driver.get("https://juice-shop.herokuapp.com/#/register ");
		 driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
@Test
 public void logintestcase001() throws InterruptedException
 {

       
	    PageFactory.initElements(driver,this);
        popUp.click();
		email.sendKeys("aarthibakth1459@gmail.com");
		password.sendKeys("A@rthi14566");
		repeat_Password.sendKeys("A@rthi14566");
		showPassword.click();
		sequrity_Question.click();
		Thread.sleep(3000);
		sequrity_Question_DropDown.click();
		security_Answer.sendKeys("dhanush");
		registerButton.click();
		
		//WINDOW HANDELING
//		 String windowHandel=driver.getWindowHandle();
// 		System.out.println("first window"+ windowHandel);    //PRINTING 1st window id
// 		    //BEFORE SWITCHING TO ANOTHER WINDOW
//
//         Set<String> windowHandels =driver.getWindowHandles();
//         System.out.println("second window"+ windowHandels);   //printing second window id
//         List<String> list = new ArrayList<String>(windowHandels);
//         driver.switchTo().window(list.get(1));
//         System.out.println(driver.getCurrentUrl());
//         driver.switchTo().window(list.get(0));
//       driver.close();
//     Set<String> windowHandels2 =driver.getWindowHandles();
//     list.clear();
//     list.addAll(windowHandels2);
//     driver.switchTo().window(list.get(0));
//     String curentUrl=driver.getCurrentUrl();
//     System.out.println(curentUrl);
//      
//WINDOW HANDELING
		
 }
        @Test
        public void test002()throws InterruptedException
        {
        	 PageFactory.initElements(driver,this);
        	 popUp.click();
        alreadyACustomer.click();
        loginEmail.sendKeys("aarthibakth1459@gmail.com");
        loginpassword.sendKeys("A@rthi14566");
        loginButton.click();
        
        
        apple_juice_ADD_TC.click();
        banana_juice_ADD_TC.click();
        next_button.click();
        Thread.sleep(3000);	
        juicelogo_button.click();
        shoppingCart.click();
        quantityOfItems1.click();
        quantityOfItems2.click();
        Thread.sleep(3000);	
        quantityOfItems3.click();
        Thread.sleep(3000);	
        checkoutButton.click();
       Thread.sleep(5000);
        
        
      AddNewAddressBtn.click();
        Thread.sleep(5000);
        country.click();
        country.sendKeys("india");
        name.click();
        name.sendKeys("aarthi");
        mobileNumber.click();
        mobileNumber.sendKeys("4567467677");
        zipcode.click();
        zipcode.sendKeys("600063");
        address.click();
        address.sendKeys("no.13a/30");
        city.click();
        city.sendKeys("chennai");
        state.click();
        state.sendKeys("TamilNadu");
        submitBtn.click();
        
        Thread.sleep(3000);
        radioBtn.click(); 
        continueBtn.click();
        Thread.sleep(3000);
        radioBtn2.click();
        continueBtn.click();
        Thread.sleep(3000);
        DropdownBtn.click();
        cardName.sendKeys("aarthi");
        cardNumber.sendKeys("4556474748865378");
        Select expMonth = new Select(expiryMonth);
        expMonth.selectByVisibleText("5");
        Thread.sleep(3000);
        Select expYear = new Select(expiryYear);
        expYear.selectByVisibleText("2086");
        submitBtn.click();
       
        
        dropdown.click();
        addcoupon.sendKeys("6571652714");
        redeem.click();
        //Verifying error message(type1)
        String actualerror =errorMessage.getText();
        String expectederror ="Invalid coupon.";
        Assert.assertEquals(actualerror, expectederror);
        //Verifying error message (type2)
        //Assert.assertTrue(actualerror.contains("Invalid coupon."));
        System.out.println(actualerror);
        TimeUnit.SECONDS.sleep(5);
        radioBtn3.click();
        continueBtn.click();
        placeOrder.click();
        accountBtn.click();
        ordersPayment.click();
        ordersHisrory.click();
        shipping.click();
        logout.click();
        
        
        }




}
