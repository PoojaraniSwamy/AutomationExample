package com.properties.files;

import java.io.FileInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class ReadFromPropertiesFiles 
{
	public static void main(String[] args) 
	{
		readPropFile();
	}

	//Read from the properties file
	static void readPropFile()
	{
		FileInputStream fin = null;
		Properties prop = null;
		try 
		{
			fin = new FileInputStream("D:\\JAVAPROGRAMS\\Drivers\\PropertiesFiles\\sample.properties");
			prop = new Properties();
			
			prop.load(fin);
			
			
			//Read only Keys
			System.out.println("******************Read Only KEYS****************");
			Set<Object> oKeys = prop.keySet();
			Iterator<Object> it1 = oKeys.iterator();
			while(it1.hasNext())
			{
				System.out.println(it1.next());
			}
			
			
			//Read only the values
			System.out.println("******************Read Only VALUES****************");
			Collection<Object> oValues = prop.values();
			Iterator<Object> it2 = oValues.iterator();
			while(it2.hasNext())
			{
				System.out.println(it2.next());
			}
			
			
			//Read both key and values
			System.out.println("******************Read both KEY & VALUES****************");
			//case1:
			prop.forEach((key, value)->System.out.println(key +" = "+value));
			System.out.println("-----------------------");
			//case2:
			Set<Entry<Object, Object>> oBoth = prop.entrySet();
			Iterator<Entry<Object, Object>> it3 = oBoth.iterator();
			while(it3.hasNext())
			{
				System.out.println(it3.next());
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try 
			{
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
