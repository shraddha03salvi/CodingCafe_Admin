package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Questions 
{

	// Declare Webelement of campaign module with Login page
		@FindBy(xpath="/html/body/app-root/app-login/div/mat-card/div/div[2]/button")
		protected WebElement ClickLogin;
		@FindBy(xpath="//*[@id='identifierId']")
		protected WebElement email;
		@FindBy(className ="CwaK9")
		protected WebElement next;
		@FindBy(name="password")
		protected WebElement password;
		@FindBy(className ="CwaK9")
		protected WebElement next1;
		
		//Question Module
		@FindBy(xpath="//*[text()='settings']")
		private WebElement ClickSettings;
		@FindBy(className="sidenav-option-selected")
		private WebElement ClickMCQ;
		@FindBy(xpath="//p[contains(text(),'Questions')]")
		private WebElement ClickQuestions;
		@FindBy(xpath="//mat-icon[contains(text(),'add')]")
		private WebElement ADDQuestion;
		@FindBy(xpath="//button[@class='cancel-btn mat-button']")
		private WebElement Cancel;
		
		//Initialize element
		public Questions(WebDriver driver)
		{
		PageFactory.initElements(driver, this); //Driver instance
		}
		//Utilize element
		public void ClickSign() //Login method
		  {
			  ClickLogin.click(); 
		  }
		  public void ClickEmail()
		  {
			  email.sendKeys("testingtestdatablz@gmail.com"); //Valid email
		  }
		  public void ClickNext()
		  {
			  next.click(); //Click 
		  }
		  public void ClickPassword()
		  {
			  password.sendKeys("testdata@123"); //valid password
		  }
		  public void ClickNext1()
		  {
			  next1.click();
		  }
		  public void ClickSettings()
		  {
			  ClickSettings.click();
		  }
		  
		  public void ClickMCQ() {
			  ClickMCQ.click();
		  }
		  public void ClickQuestions() {
			  ClickQuestions.click();
		  }
		  public void ADDQuestion() {
			  ADDQuestion.click();
		  }
		  
		  public void Cancel() {
			  Cancel.click();
		  }
}
