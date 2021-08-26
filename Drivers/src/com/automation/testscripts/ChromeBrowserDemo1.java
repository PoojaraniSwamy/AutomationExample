package com.automation.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment Q1:  1) launchBrowser-->navigate-->login-->createUser-->deleteUser
//-->logout -->closeApplication

public class ChromeBrowserDemo1 
{
	public static WebDriver obrowser=null;
	
	public static void main(String[] args) 
	{
		LaunchBrowser();
		navigate();
		login();
		popupwindow();
		createUser();
		deleteUser();
		logout();
		closeApplication();
	}
	
	public static void LaunchBrowser()
	{
		
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\DemoWorkSpace\\Drivers\\Library\\Drivers\\chromedriver.exe");
			obrowser = new ChromeDriver();
			obrowser.manage().window().maximize();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			obrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void popupwindow()
	{
		try
		{
			obrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	static void createUser()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			
			obrowser.findElement(By.name("firstName")).sendKeys("demo");
			obrowser.findElement(By.name("lastName")).sendKeys("user1");
			obrowser.findElement(By.name("email")).sendKeys("demouser1@gamilcom");
			obrowser.findElement(By.name("username")).sendKeys("demouser 1");
			obrowser.findElement(By.name("password")).sendKeys("welcome1");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("welcome1");
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert=obrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
			obrowser.close();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
}
