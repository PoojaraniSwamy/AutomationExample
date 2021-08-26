package com.automation.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Q3.launchBrowser-->navigate-->login as admin-->createuser [User1,User2,User3] -->logout--->login as
//User1--->logout-->Login as User2 --> logout -->login as User3 --> logout-->login as admin [modify 
//the password for User1,User2,User3] --> logout -->login as User1--->logout-->Login as User2 -->
//logout -->login as User3 --> logout-->login as Admin --> Delete [User1,User2,User3]-->logout -->
//closeApplication

public class ChromeBrowserDemo3
{
	public static WebDriver obrowser=null;
	
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		handlepopupwindow();
		createuser();
		logout();
		
		loginasuser1();
		logoutasuser1();
		
		loginasuser2();
		logoutasuser2();
		
		loginasuser3();
		logoutasuser3();
		
		loginasadmin();
		modifythepasswordforuser();
		logoutasadmin();
		
		loginasuser1new();
		logoutasuser1new();
		
		loginasuser2new();
		logoutasuser2new();
		
		loginasuser3new();
		logoutasuser3new();
		
		loginasadminnew();
		user();
		logutasadminnew();
		
		closeApplication();
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\JAVAPROGRAMS\\Drivers\\L\\Drivers\\chromedriver.exe");
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
	static void handlepopupwindow()
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
	static void createuser()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("demo1");
			obrowser.findElement(By.name("lastName")).sendKeys("user1");
			obrowser.findElement(By.name("email")).sendKeys("demo1user1@gmail.com");
			obrowser.findElement(By.name("username")).sendKeys("demo1user1");
			obrowser.findElement(By.name("password")).sendKeys("welcome1");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("welcome1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("demo2");
			obrowser.findElement(By.name("lastName")).sendKeys("user2");
			obrowser.findElement(By.name("email")).sendKeys("demo2user2@gmail.com");
			obrowser.findElement(By.name("username")).sendKeys("demo2user2");
			obrowser.findElement(By.name("password")).sendKeys("welcome2");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("welcome2");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("demo3");
			obrowser.findElement(By.name("lastName")).sendKeys("user3");
			obrowser.findElement(By.name("email")).sendKeys("demo1user3@gmail.com");
			obrowser.findElement(By.name("username")).sendKeys("demo3user3");
			obrowser.findElement(By.name("password")).sendKeys("welcome3");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("welcome3");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			
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
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasuser1()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("demo1user1");
			obrowser.findElement(By.name("pwd")).sendKeys("welcome1");
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[2]")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutasuser1()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasuser2()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("demo2user2");
			obrowser.findElement(By.name("pwd")).sendKeys("welcome2");
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[2]")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutasuser2()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasuser3()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("demo3user3");
			obrowser.findElement(By.name("pwd")).sendKeys("welcome3");
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[2]")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutasuser3()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void loginasadmin()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
			
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifythepasswordforuser()
	{
		try
		{
			//user1
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("welcome1new");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("welcome1new");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			//user2
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("welcome2new");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("welcome2new");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			//user3
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("welcome3new");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("welcome3new");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutasadmin()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasuser1new()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("demo1user1");
			obrowser.findElement(By.name("pwd")).sendKeys("welcome1new");
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[2]")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutasuser1new()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasuser2new()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("demo2user2");
			obrowser.findElement(By.name("pwd")).sendKeys("welcome2new");
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[2]")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutasuser2new()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasuser3new()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("demo3user3");
			obrowser.findElement(By.name("pwd")).sendKeys("welcome3new");
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[2]")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutasuser3new()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasadminnew()
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
	static void user()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oalert1=obrowser.switchTo().alert();
			String content1 = oalert1.getText();
			System.out.println(content1);
			oalert1.accept();
			Thread.sleep(1000);
			
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oalert2=obrowser.switchTo().alert();
			String content2 = oalert2.getText();
			System.out.println(content2);
			oalert2.accept();
			Thread.sleep(1000);
			
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oalert3=obrowser.switchTo().alert();
			String content3 = oalert3.getText();
			System.out.println(content3);
			oalert3.accept();
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logutasadminnew()
	{
			try
			{
				obrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(1000);
				
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
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
}
