package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Campaign 
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
	
// Campaign Module//
	@FindBy(xpath="//div[@class='addicon']//img")
	private WebElement ClickCTA;
	@FindBy(xpath="//button[contains(text(),'Campaign')]")
	private WebElement ClickCampaign;
	@FindBy(id="mat-input-1")
	private WebElement CampName;
	@FindBy(xpath="//div[@class='mat-select-arrow-wrapper']")
	private WebElement ClickCampPur;
	@FindBy(xpath="//span[contains(text(),'Registration')]")
	private WebElement SelectReg;
	@FindBy(id="mat-input-2")
	private WebElement CreatorName;
	@FindBy(id="mat-input-3")
	private WebElement ShortName;
	//@FindBy(xpath="//input[@id='mat-input-29']")
	//private WebElement clickStartDate;
	@FindBy(className="mat-button-wrapper")
	private WebElement StartDate;
	@FindBy(xpath="//*[text()='23']")
	private WebElement SelectStartDate;
	@FindBy(xpath="//*[@id=\"mat-dialog-0\"]/app-online-campaign/div/div[4]/div[1]/div[2]/mat-form-field[2]/div/div[1]/div[4]/mat-datepicker-toggle/button/span")
	private WebElement ClickEndDate;
	@FindBy(xpath="//*[text()='23']")
	private WebElement SelectEndDate;
	@FindBy(xpath="//span[contains(text(),'Submit')]")
	private WebElement ClickSubmit;
	
	//Initialize element
	public Login_Campaign(WebDriver driver)
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
	  public void ClickCTA() {
		  ClickCTA.click();
	  }
	public void ClickCampaign() 
	{
		ClickCampaign.click();
	   }
	public void CampName() {
		CampName.sendKeys("TestOnlineCampaign_Register");
	}
	public void ClickCampPur() {
		ClickCampPur.click();
	}
	public void SelectReg() {
		SelectReg.click();
	}
	public void CreatorName() {
		CreatorName.sendKeys("Shraddha");
	}
	public void ShortName() {
		ShortName.sendKeys("register1");
	}
	
	public void StartDate() {
		StartDate.click();
	}
	public void  SelectStartDate() {
		 SelectStartDate.click();
	}
	public void ClickEndDate() {
		ClickEndDate.click();
	}
	public void SelectEndDate() {
		SelectEndDate.click();
	}
	public void ClickSubmit() {
		ClickSubmit.click();
	}
}
