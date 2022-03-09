package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo {
@Test(priority=1)
public void testcase() {
	System.out.println("This is from a test case");
	Assert.assertEquals("Actual","Actual");
	System.out.println("End of a line");
}
@Test(priority=2,dependsOnMethods = "testcase")
public void mytestcase() {
	System.out.println("This is from a test case2");
	SoftAssert sa = new SoftAssert();
	sa.assertEquals("Actual", "Expected");
	System.out.println("End of a line2");
	sa.assertAll();
}
@BeforeTest
public void precondition() {
	System.out.println("This is from precondition");
}
@AfterTest
public void postcondition() {
	System.out.println("This is from postcondition");
}
@BeforeSuite
public void beforesuite() {
	System.out.println("This is from beforesuite");
}
@AfterSuite
public void aftersuite() {
	System.out.println("This is from aftersuite");
}
@BeforeClass
public void beforeclass() {
	System.out.println("This is from beforeclass");
}
@AfterClass
public void afterclass() {
	System.out.println("This is from afterclass");
}
@BeforeMethod
public void beforemethod() {
	System.out.println("This is from beforemethod");
}
@AfterMethod
public void aftermethod() {
	System.out.println("This is from aftermethod");
}
}
