package testone;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstClass {
	public static  void main(String args[]) throws Exception
	{
		FirstClass fc=new FirstClass();
		fc.ISDADraftCustomReportTset("gtygfssdhuhjujl");
	}

		
		public void ISDADraftCustomReportTset(String value) throws InterruptedException, AWTException {
			System.out.println("PBCustomReportTset");
			String url="http://73f03a3c373340a596d220e47e539824.cloudapp.net";
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.navigate().refresh();
			driver.get(url);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("sudhaadmin");
			driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("123456");
			driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
			driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();		
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/a/span")).click();//report
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[2]/a")).click();//custom 
			driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[2]/ul/li[1]/a")).click();//generate
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@href='steponereportsignalRNew.aspx?CID=3']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_chkDraft_0']")).click();
			new Select(driver.findElement(By.xpath(".//*[@id='ddlClientEntities']"))).selectByVisibleText("All Client Entities");
			driver.findElement(By.xpath(".//*[@id='LoadingTree']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath(".//*[@id='AgreementTree']/ul/li/ul/li/ul/li[1]/div/div/div/div/span[2]/label/span[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[@id='btnsubmit']")).click();
			Thread.sleep(20000);
			driver.findElement(By.xpath("//input[@value='Filter Questions']"));
			//driver.findElement(By.xpath(".//*[@id='FilterTree']")).click();
			Thread.sleep(10000);
			
			driver.findElement(By.xpath(".//*[@id='chkbox_SelectDeselect']")).click();
			for(int i=0;i<15;i++)
		    {
		             driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		    }
			driver.findElement(By.xpath(".//*[@id='tbReportName']")).sendKeys(value);
			driver.findElement(By.xpath(".//*[@id='Submit']")).click();
			
			Thread.sleep(20000);
			driver.findElement(By.xpath(".//*[@id='mybutton']")).click();
			Thread.sleep(20000);
			
			driver.findElement(By.xpath(".//*[@id=' downloadReport1']")).click();
			Thread.sleep(2000);
			Robot rbt=new Robot();
			Thread.sleep(2000);
			rbt.keyPress(KeyEvent.VK_DOWN);
			rbt.keyPress(KeyEvent.VK_ENTER);
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='download62PDF1']")).click();
			Thread.sleep(2000);
			Robot rbt2=new Robot();
			rbt2.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@id='download63PDF1']")).click();
			Thread.sleep(2000);
			Robot rbt3=new Robot();
			rbt3.keyPress(KeyEvent.VK_ENTER);
		
		/*	Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='rhome']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='navbar-container']/div[2]/ul/li/a/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='../Logout.aspx']")).click();
			Thread.sleep(1000);
			driver.close();*/
			
		
			
			
		}
		
		}

