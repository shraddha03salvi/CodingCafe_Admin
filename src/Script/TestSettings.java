package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import PomPages.Settings;

public class TestSettings extends BaseTest {
	//Test annotation
	  @Test
	  public void SettingsModule() throws InterruptedException 
	  {
		  Settings S = new Settings(driver);
		  S.ClickSign();
		  //window handel id of parent window
		  String winHandleBefore =driver.getWindowHandle();
		  for (String winHandle :driver.getWindowHandles()) 
		  {
			   // Switch to child window
			   driver.switchTo().window(winHandle);
		 }
		  //call ClickEmail() method 
		  S.ClickEmail();
		  Thread.sleep(4000);
		   //call ClickNext() method
		  S.ClickNext();
		  Thread.sleep(3000);
		  //call ClickPassword() method
		  S.ClickPassword();
		  Thread.sleep(4000);
		  //call ClickNext1() method
		  S.ClickNext1();
		  Thread.sleep(4000);
	       //Again switch to parent window
	       driver.switchTo().window(winHandleBefore);
	       Thread.sleep(6000);
	       S.ClickSettings();
	       Thread.sleep(3000);
	       S.ADDCTA();
	       Thread.sleep(7000);
	       S.TestName();
	       Thread.sleep(7000);
	       S.TopicDifficulty();
	       Thread.sleep(3000);
	  }

}
