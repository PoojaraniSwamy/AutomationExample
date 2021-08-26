package com.Selenium.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxAutomation
{
	public static void main(String[] args)
	{
		FirefoxDriver ff=null;
		try
		{
			//open the browser and enter the Firefox url
			System.setProperty("webdriver.gecko.driver","D:\\JAVAPROGRAMS\\Drivers\\L\\Drivers\\geckodriver.exe");
			//open the Firefox browser
			ff=new FirefoxDriver();
			//maximise the Firefox browser
			ff.manage().window().maximize();
			//enter the actiTime url
			ff.get("http://localhost/login.do");
			Thread.sleep(2000);
			
			//browser should open and load the url successful
			//if(ff.getTitle().equalsIgnoreCase("actiTIME - Login"))
			if((ff.findElement(By.id("headerContainer")).getText()).equals("Please identify yourself"))
			{
				System.out.println("the url navigated and actiTime login page has opened successful");
			}
			else
			{
				System.out.println("failed to open the actiTime login page");
			}
			//enter username and password and click on login button
			ff.findElement(By.id("username")).sendKeys("admin");
			ff.findElement(By.name("pwd")).sendKeys("manager");
			ff.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			
			//verify login is successful
			String strText= ff.findElement(By.id("sortByTaskNameLink")).getText();
			if(strText.equalsIgnoreCase("Task"))
			{
				System.out.println("login successful");
			}
			else
			{
				System.out.println("login not successul");
			}
			//close or handle the shortcut window
			if(ff.findElement(By.id("requestCallPhoneContainer_gettingStarted")).isDisplayed());
			{
				ff.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			}
			Thread.sleep(2000);
			//logout from actiTime
			ff.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
			//verify logout is successful
			if((ff.findElement(By.id("headerContainer")).getText()).equals("Please identify yourself"))
			{
				System.out.println("logout from the actiTime is successful");
			}
			else
			{
				System.out.println("failed to logout from from the actiTime");
				return;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			ff = null;
		}

	}

}
