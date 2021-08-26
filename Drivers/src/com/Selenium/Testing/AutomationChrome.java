package com.Selenium.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationChrome 
{
	public static void main(String[] args) 
	{
		ChromeDriver chrome= null;
		try
		{
			//open the browser and enter the actitime url
			System.setProperty("webdriver.chrome.driver","D:\\JAVAPROGRAMS\\Drivers\\L\\Drivers\\chromedriver.exe");
			//open the chrome browser.
			chrome=new ChromeDriver();
			//maximise the browser
			chrome.manage().window().maximize();
			//enter the actime url
			chrome.get("http://localhost/login.do");
			Thread.sleep(2000);
			////Browser should open and load the URL successful
			if((chrome.findElement(By.id("headerContainer")).getText()).equals("Please identify yourself"))
			{
				System.out.println("login page opened successfully");
			}
			else
			{
				System.out.println("failed to open login page");
				return;
			}
			////Enter Username & password and click on Login button
			chrome.findElement(By.id("username")).sendKeys("admin");
			chrome.findElement(By.name("pwd")).sendKeys("manager");
			chrome.findElement(By.id("loginButtonContainer")).click();
			
			//varify login is succefull.
			String strText = chrome.findElement(By.xpath("//td[@class='pagetitle']")).getText();
			if(strText.equalsIgnoreCase("Enter Time-Track"))
			{
				System.out.println("The login to actiTime was successful");
			}
			else
			{
				System.out.println("Failed to login to actiTime");
				return;
			}
			// close or handle the shortcut window
			if(chrome.findElement(By.id("gettingStartedShortcutsMenuCloseId")).isDisplayed())
			{
				chrome.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			}
			Thread.sleep(2000);
			//logout from actitime
			chrome.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
			//verify logout is successful
			strText=chrome.findElement(By.id("headerContainer")).getText();
			if(strText.equalsIgnoreCase("Please identify yourself"))
			{
				System.out.println("logout from the actiTime is successful");
			}
			else
			{
				System.out.println("failed to logout from the actiTime");
				return;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			//close the chrome
			chrome.close();
			chrome=null;
		}

	}

}
