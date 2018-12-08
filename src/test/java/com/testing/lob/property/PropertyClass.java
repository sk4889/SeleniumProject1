package com.testing.lob.property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyClass {
	
	public String getPropertyFile(String str) throws IOException{
		String property = null;
		FileInputStream fs=new FileInputStream(System.getProperty("user.dir") + "//Property//xpath.properties");
	
	if(fs!=null)
	{
		Properties prop = new Properties();
		prop.load(fs);
		property = prop.getProperty(str);
		
	}
	return property;
	}
	  
	/*public static void main(String[] args) throws IOException {
		PropertyClass p = new PropertyClass();
		p.getPropertyFile();
	}*/
}
