package com.ts.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfig {
	Properties pro;
	
	public ReadConfig()
	{
		String path="C:\\Users\\Lenovo\\Downloads\\DalalStreet17SeptFramework\\src\\test\\resources\\configs\\Configs.properties";
		
		
		
			try 
			{
				
				File file =new File(path);
			    FileInputStream fis=new FileInputStream (file);
			    pro =new Properties();
				pro.load(fis);
			} 
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
		} 
	
	public String getApplicationUrl()
	{
		String url=pro.getProperty("url");
		return url;

	}
	public String getEmailAddress()
	{
		return pro.getProperty("email");

	}
	public String getPassword()
	{
		return pro.getProperty("password");
	}
		
		
		
		
		
	
	

}

