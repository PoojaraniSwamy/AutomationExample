package com.Selenium.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_Automation 
{
	public static void main(String[] args)
	{
		InternetExplorerDriver ie=null;
		try
		{
			//open the browser and enter the actTime URL
			
			System.setProperty("webdriver.ie.driver","D:\\JAVAPROGRAMS\\Drivers\\L\\Drivers\\IEDriverServer.exe");
			
			//open the browser
			ie = new InternetExplorerDriver();
			
			//maximize the ie browser
			ie.manage().window().maximize();
			
			//enter the actiTime url
			ie.get("http://localhost/login.do");
			
			//browser should open load the url successful
			
			if((ie.findElement(By.id("headerContainer")).getText()).equals("Please identify yourself"));
			{
				System.out.println("login page opened successfully");
			}
			//else
			//{
				//System.out.println("failed to open login page");
			//}
			//enter the username and pwd click on login button
			ie.findElement(By.id("username")).sendKeys("admin");
			ie.findElement(By.name("pwd")).sendKeys("manager");
			ie.findElement(By.id("loginButton")).click();
			// validation
			String strText=ie.findElement(By.id("sortByProjectNameLink")).getText();
			if(strText.equalsIgnoreCase("Project "))
			{
				System.out.println("login successful");
			}
			else
			{
				System.out.println("login failed");
			}
			//close or handle the shortcut window
			if(ie.findElement(By.id("gettingStartedShortcutsMenuWrapper")).isDisplayed())
			{
				ie.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			}
			//logout from actiTime
			if((ie.findElement(By.id("headerContainer")).getText()).equals("Please identify yourself"));
			{
				System.out.println("logout is success");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}

	}

}
