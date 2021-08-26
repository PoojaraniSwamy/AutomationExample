package com.automation.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//launchBrowser-->navigate-->login as admin-->createuser [User1] -->logout ->login as User1-->
//createUser [User2] -->logout -->login as User2 --> createUser [User3]--> logout-->login as User3 -->
//logout -->login as User2 -->modify password for User3-->logout --> login as User3 --> logout-->
//login as User1 -->modify password for User2 --> logout -->login as User2 --> logout-->login as
//admin--> modify password for User1 --> logout -->login as User1 --> logout --> login as User2 -->
//Delete User3--> logout --> login as User1 --> delete USer2 --> logout --> login as Admin --> 
//delete User1 --> logout --> closeApplication

public class ChromeBrowserDemo4
{
	public static WebDriver obrowser=null;
	
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		closepopupwindow();
		createuser1();
		logout();
		
		loginasuser1();
		createuser2();
		logoutuser1();
		
		loginasuser2();
		createuser3();
		logoutuser2();
		
		loginasuser3();
		logoutuser3();
		
		loginasuser2new();
		modifypasswordforUser3();
		logoutasuser2new();
		
		loginasuser3new();
		logoutasuser3new();
		
		loginasuser1new();
		modifypasswordforUser2();
		logoutasuser1new();

		loginasuser2new2();
		logoutasuser2new2();
		
		login();
		modifypasswordforuser1();
		logout();
		
		loginasuser1new1();
		logoutasuser1new1();
		
		loginasuser2new2();
		deleteuser3();
		logoutasuser2new2();
		
		loginasuser1new1();
		deleteuser2();
		logoutasuser1new1();
		
		login();
		deleteuser1();
		logout();
		closeapplication();
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\JAVAPROGRAMS\\Drivers\\L\\Drivers\\chromedriver.exe");
			obrowser=new ChromeDriver();
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
			obrowser.findElement(By.name("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closepopupwindow()
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
	static void createuser1()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			obrowser.findElement(By.name("firstName")).sendKeys("demo1");
			obrowser.findElement(By.name("lastName")).sendKeys("user1");
			obrowser.findElement(By.name("email")).sendKeys("user1@gamil.com");
			obrowser.findElement(By.name("username")).sendKeys("user1");
			obrowser.findElement(By.name("password")).sendKeys("welcome1");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("welcome1");
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
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
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
			obrowser.findElement(By.name("username")).sendKeys("user1");
			obrowser.findElement(By.name("pwd")).sendKeys("welcome1");
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser2()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			obrowser.findElement(By.name("firstName")).sendKeys("demo2");
			obrowser.findElement(By.name("lastName")).sendKeys("user2");
			obrowser.findElement(By.name("email")).sendKeys("user2@gamil.com");
			obrowser.findElement(By.name("username")).sendKeys("user2");
			obrowser.findElement(By.name("password")).sendKeys("welcome2");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("welcome2");
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutuser1()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
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
			obrowser.findElement(By.name("username")).sendKeys("user2");
			obrowser.findElement(By.name("pwd")).sendKeys("welcome2");
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser3()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			obrowser.findElement(By.name("firstName")).sendKeys("demo3");
			obrowser.findElement(By.name("lastName")).sendKeys("user3");
			obrowser.findElement(By.name("email")).sendKeys("user3@gamil.com");
			obrowser.findElement(By.name("username")).sendKeys("user3");
			obrowser.findElement(By.name("password")).sendKeys("welcome3");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("welcome3");
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutuser2()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
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
			obrowser.findElement(By.name("username")).sendKeys("user3");
			obrowser.findElement(By.name("pwd")).sendKeys("welcome3");
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutuser3()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
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
			obrowser.findElement(By.name("username")).sendKeys("user2");
			obrowser.findElement(By.name("pwd")).sendKeys("welcome2");
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
	static void modifypasswordforUser3()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("welcome3new");
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
	static void logoutasuser2new()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
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
			obrowser.findElement(By.name("username")).sendKeys("user3");
			obrowser.findElement(By.name("pwd")).sendKeys("welcome3new");
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
	static void logoutasuser3new()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
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
			obrowser.findElement(By.name("username")).sendKeys("user1");
			obrowser.findElement(By.name("pwd")).sendKeys("welcome1");
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
	static void modifypasswordforUser2()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("welcome2new");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("welcome2new");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']")).click();
			Thread.sleep(2000);
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
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasuser2new2()
	{
		try
		{
			obrowser.findElement(By.name("username")).sendKeys("user2");
			obrowser.findElement(By.name("pwd")).sendKeys("welcome2new");
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
	static void logoutasuser2new2()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		static void modifypasswordforuser1()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("welcome1new");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("welcome1new");
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginasuser1new1()
	{
		try
		{
			obrowser.findElement(By.name("username")).sendKeys("user1");
			obrowser.findElement(By.name("pwd")).sendKeys("welcome1new");
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutasuser1new1()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser3()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			obrowser.switchTo().alert();
			Alert oalert=obrowser.switchTo().alert();
			String content = oalert.getText();
			System.out.println(content);
			oalert.accept();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser2()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			obrowser.switchTo().alert();
			Alert oalert=obrowser.switchTo().alert();
			String content = oalert.getText();
			System.out.println(content);
			oalert.accept();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser1()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			obrowser.switchTo().alert();
			Alert oalert=obrowser.switchTo().alert();
			String content = oalert.getText();
			System.out.println(content);
			oalert.accept();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeapplication()
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
