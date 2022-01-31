package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class BaseConfig {
	
	public String getValue( String value) throws Exception {
		
		String path="./config.properties";//location of config file
		FileInputStream fis = new FileInputStream(path);//into stream
		//read file data 
		Properties pro = new Properties(); 
		pro.load(fis);
		//return value 
		return pro.get(value).toString();
		
		
		
	}
		
		
}