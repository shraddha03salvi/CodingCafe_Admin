package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import PomPages.Questions;

public class TestQuestions extends BaseTest 
{
	 //Test annotation
	  @Test
	  public void QuestionsModule() throws InterruptedException 
	  {
		  Questions Q = new Questions(driver); 
		  
		  Q.ClickSign();
		  //window handel id of parent window
		  String winHandleBefore =driver.getWindowHandle();
		  for (String winHandle :driver.getWindowHandles()) 
		  {
			   // Switch to child window
			   driver.switchTo().window(winHandle);
		 }
		  //call ClickEmail() method 
		  Q.ClickEmail();
		  Thread.sleep(4000);
		   //call ClickNext() method
		  Q.ClickNext();
		  Thread.sleep(3000);
		  //call ClickPassword() method
		  Q.ClickPassword();
		  Thread.sleep(4000);
		  //call ClickNext1() method
		  Q.ClickNext1();
		  Thread.sleep(4000);
	       //Again switch to parent window
	       driver.switchTo().window(winHandleBefore);
	       Thread.sleep(6000);
	       Q.ClickSettings();
	       Thread.sleep(3000);
	       Q.ClickMCQ();
	       Thread.sleep(3000);
	       Q.ClickQuestions();
	       Thread.sleep(3000);
	       Q.ADDQuestion();
	       Thread.sleep(3000);
	       Q.Cancel();
	       Thread.sleep(3000);
	  }
}
