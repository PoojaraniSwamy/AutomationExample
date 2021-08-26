package com.properties.files;

import java.io.FileOutputStream;
import java.util.Properties;

public class CreateAndWriteToPropertiesFiles 
{
	public static void main(String[] args)
	{
		writeToPropFile();
	}
	
	//Create and write to properties file
		static void writeToPropFile()
		{
			FileOutputStream fout = null;
			Properties prop = null;
			try 
			{
				fout = new FileOutputStream("D:\\JAVAPROGRAMS\\Drivers\\PropertiesFiles\\sample.properties");
				prop = new Properties();
				
				prop.setProperty("URL", "http://sgtestinginstitute.com/admin/");
				prop.setProperty("UserName", "admin");
				prop.setProperty("Password", "manager");
				prop.setProperty("Port", "8080");
				
				prop.store(fout, null);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				try 
				{
					fout.flush();
					fout.close();
					fout = null;
					prop = null;
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}

}
