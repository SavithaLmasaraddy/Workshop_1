package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TasksPage  extends BasePage{
	public WebDriver driver;
	public TasksPage(WebDriver driver) {
		super(driver);	
	}
	@FindBy(id="search")
	private WebElement searchtextFiled;

	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	private WebElement taskslink;

	@FindBy(linkText="New Task")
	private WebElement Newtasklink;

	@FindBy(xpath="//label[text()='Client']/..//input[@autocomplete='off']")
	private WebElement clienttextfield;

	@FindBy(id="project_name")
	private WebElement projecttextfield;
	
		public WebElement getProjecttextfield() {
		return projecttextfield;
	}
	@FindBy(id="description")
	private WebElement description;
	
	@FindBy(xpath="//label[contains(text(),'Timer')]")
	private WebElement timerradiobutton;
	
	@FindBy(id="start-button")
	private WebElement startbutton;
	
	@FindBy(xpath="//label[contains(text(),'Manual')]")
	private WebElement manualradiobutton;
	
	@FindBy(xpath="//input[@placeholder='Start Time']")
	private WebElement starttime;
	@FindBy(xpath="//div[text()='1:15 PM']")
	private WebElement starttimepop;
	@FindBy(xpath="//div[text()='1:45 PM']")
	private WebElement endtimepop;
	public WebElement getStarttimepop() {
		return starttimepop;
	}
	public WebElement getEndtimepop() {
		return endtimepop;
	}
	@FindBy(id="stop-button")
	private WebElement stopbutton;
	
	@FindBy(id="save-button")
	private WebElement savebutton;
	
	@FindBy(id="resume-button")
	private WebElement resumebutton;
	
	public WebElement getResumebutton() {
		return resumebutton;
	}
	public WebElement getTimerradiobutton() {
		return timerradiobutton;
	}
	public WebElement getSavebutton() {
		return savebutton;
	}
	public WebElement getStopbutton() {
		return stopbutton;
	}
	public WebElement getStarttime() {
		return starttime;
	}
	public WebElement getEndtime() {
		return endtime;
	}
	@FindBy(xpath="//input[@placeholder='End Time']")
	private WebElement endtime;
	public WebElement getTimer() {
		return timerradiobutton;
	}
	public WebElement getManualradiobutton() {
		return manualradiobutton;
	}
	public WebElement getStartbutton() {
		return startbutton;
	}
	public WebElement getSearchtextFiled() {
		return searchtextFiled;
	}
	public WebElement getTaskslink() {
		return taskslink;
	}
	public WebElement getNewtasklink() {
		return Newtasklink;
	}
	public WebElement getClienttextfield() {
		return clienttextfield;
	}
	public WebElement getDescription() {
		return description;
	}
}
