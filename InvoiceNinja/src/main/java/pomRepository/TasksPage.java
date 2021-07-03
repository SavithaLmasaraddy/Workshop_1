package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksPage  extends BasePage{

	public TasksPage(WebDriver driver) {
		super(driver);	
	}
	@FindBy(id="search")
	private WebElement searchtextFiled;
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	private WebElement taskslink;
	@FindBy(linkText="New Task")
	private WebElement Newtasklink;
	@FindBy(id="client")
	private WebElement clienttextfield;
	@FindBy(xpath=("//span[@data-dropdown='dropdown']"))
	private WebElement clientdropdown;
	@FindBy(id="project_name")
	private WebElement projectname;
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
	public WebElement getClientdropdown() {
		return clientdropdown;
	}
	public WebElement getProjectname() {
		return projectname;
	}
	public WebElement getDescription() {
		return description;
	}

}
