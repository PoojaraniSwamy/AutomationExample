package com.Selenium.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationRedBus 
{
	public static void main(String[] args) 
	{
		ChromeDriver redBus=null;
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\JAVAPROGRAMS\\Drivers\\L\\Drivers\\chromedriver.exe");
			redBus=new ChromeDriver();
			redBus.manage().window().maximize();
			redBus.get("https://www.redbus.in/");
			Thread.sleep(2000);
			redBus.findElement(By.xpath("//input[@id='src']")).sendKeys("Bidar");
			redBus.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
			redBus.findElement(By.xpath("//label[@for='onward_cal']")).sendKeys("24-Jul-2021");
			redBus.findElement(By.xpath("//button[@id='search_btn']")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			redBus=null;
		}

	}

}
