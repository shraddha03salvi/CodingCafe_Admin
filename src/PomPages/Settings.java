package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings
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
		//Settings Module	
			@FindBy(xpath="//*[text()='settings']")
			private WebElement ClickSettings;
			@FindBy(xpath="//div/div[@class='raw']/mat-card[1]/div[2]/mat-icon[1]")
			private WebElement ADDCTA;
			@FindBy(xpath="//*[@id=\"mat-dialog-0\"]/app-test-format/div/div[2]/div/div[1]/mat-form-field/div/div[1]/div[3]")
			private WebElement TestName;
			@FindBy(id="mat-checkbox-1-input")
			private WebElement TopicDifficulty;
			
			//Initialize element
			public Settings(WebDriver driver)
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
			  public void ADDCTA() 
			  {
				  ADDCTA.click();
			  }
			  public void TestName() {
				  TestName.sendKeys("TestingQA");
			  }
			  public void TopicDifficulty() {
				  TopicDifficulty.click();
			  }
}
