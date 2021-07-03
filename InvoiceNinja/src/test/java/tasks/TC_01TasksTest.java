package tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.TasksPage;

public class TC_01TasksTest extends BaseTest{
	@Test
	public void Tasks() throws InterruptedException{
	     TasksPage tasks=new TasksPage(driver);
	     tasks.getSearchtextFiled().sendKeys("Tasks",Keys.ENTER);
	     tasks.getNewtasklink().click();
	     WebElement client = tasks.getClienttextfield();
	     Thread.sleep(2000);
         WebElement clientdropdown = tasks.getClientdropdown();
         clientdropdown.click();
         Select select=new Select(clientdropdown);
	    select.selectByValue("1");
	    Thread.sleep(5000);
	     
	     
//	     driver.findElement(By.id("search")).sendKeys("Tasks",Keys.ENTER);
//	     driver.findElement(By.linkText("New Task")).click();
//	     driver.findElement(By.xpath(""))
		}

	
}
