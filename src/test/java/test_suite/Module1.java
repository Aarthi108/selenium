package test_suite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Module1 {
     @BeforeMethod
	public void beforeexec()
	{
		System.out.println("testing before method");
	}
	
	@Test
	public void test001()
	{
		System.out.println("im test 0001");
	}

	@Test
	public void test002()
	{
		System.out.println("im test 0002");
	}

	@Test
	
	public void test003()
	{
		System.out.println("im test 0003");
	}
	@AfterMethod
	public void aftereexec()
	{
		System.out.println("testing after method");
	}
	@DataProvider
	public Object [][] data001()
	{
		Object[][] data= {{"aarthi","1234"},{"baktha" ,"1234"}};
		return  data;
		
	}
	@Test (dataProvider = "data001")
	public void login(String Username,String Password)
	{
		System.out.println(Username +"and"+Password);
	}
}
