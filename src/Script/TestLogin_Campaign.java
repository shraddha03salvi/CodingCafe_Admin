package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import PomPages.Login_Campaign;

public class TestLogin_Campaign extends BaseTest
{
	 //Test annotation
	  @Test
	  public void LoginWithAddCampaign() throws InterruptedException 
	  {
		//Creating the object of pom page class
		  Login_Campaign L = new Login_Campaign(driver);
		  L.ClickSign();
		  //window handel id of parent window
		  String winHandleBefore =driver.getWindowHandle();
		  for (String winHandle :driver.getWindowHandles()) 
		  {
			   // Switch to child window
			   driver.switchTo().window(winHandle);
		 }
		  //call ClickEmail() method 
		  L.ClickEmail();
		  Thread.sleep(4000);
		   //call ClickNext() method
		  L.ClickNext();
		  Thread.sleep(3000);
		  //call ClickPassword() method
		  L.ClickPassword();
		  Thread.sleep(4000);
		  //call ClickNext1() method
		  L.ClickNext1();
		  Thread.sleep(4000);
	       //Again switch to parent window
	       driver.switchTo().window(winHandleBefore);
	       Thread.sleep(4000);
	       L.ClickCTA();
	       Thread.sleep(3000);
	       L.ClickCampaign();
	       Thread.sleep(5000);
	       L.CampName();
	       Thread.sleep(4000);
	       L.ClickCampPur();
	       Thread.sleep(3000);
	       L.SelectReg();
	       Thread.sleep(3000);
	       L.CreatorName();
	       Thread.sleep(3000);
	       L.ShortName();
	       Thread.sleep(2000);
	      
	       L.StartDate();
	       Thread.sleep(5000);
	       L. SelectStartDate();
	       Thread.sleep(3000);
	       L.ClickEndDate();
	       Thread.sleep(5000);
	       L.SelectEndDate();
	       Thread.sleep(3000);
	       L.ClickSubmit();
	       Thread.sleep(5000);
	       System.out.println("User get logged in successfully and Campaign get Added");
	  }
}
