package com.commonLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	static FileInputStream fis;
	
	public static String projectLocation = "src/test/resources";
	
	public static String getPropValue(String variable) throws IOException {
		
		Properties prop = new Properties();
		
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/TestData.properties");
			prop.load(fis);
		}catch (FileNotFoundException e){
			e.printStackTrace();
			
		}
		return prop.getProperty(variable);
	}

}

