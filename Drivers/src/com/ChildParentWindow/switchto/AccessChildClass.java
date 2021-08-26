package com.ChildParentWindow.switchto;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;


public class AccessChildClass
{
	public static void main(String[] args)
	{
		ChromeDriver chrome=null;
		try
		{
			
			System.setProperty("webdriver.chrome.driver","D:\\JAVAPROGRAMS\\Drivers\\L\\Drivers\\chromedriver.exe");
			chrome=new ChromeDriver();
			
			chrome.manage().window().maximize();
			
			chrome.get("file:///D:/testing%20classes/HTML/index.html");
			Thread.sleep(2000);
			
			String sParent=chrome.getWindowHandle();
			System.out.println(sParent);
			
			chrome.findElementById("video").click();
			
			Set<String> objChild=chrome.getWindowHandles();
			System.out.println(objChild);
			
			for(String child : objChild)
			{
				if(!child.equals(sParent))
				{
					chrome.switchTo().window(child);
					
					System.out.println(chrome.getTitle());
					Thread.sleep(2000);
					chrome.close();
					Thread.sleep(02000);
				}
			}
			chrome.switchTo().window(sParent);
			chrome.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			chrome=null;
		}

	}

}
