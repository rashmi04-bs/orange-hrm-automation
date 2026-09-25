package com.qa.orangehrm.configreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
public static String getProperty(String key) throws Exception {
	Properties prop = new Properties();
	FileInputStream file = new FileInputStream("./src/test/resources/configfile.properties");
	prop.load(file);
	return prop.getProperty(key);
}


}
