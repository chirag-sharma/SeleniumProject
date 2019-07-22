package dataprovider;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() {
		
		File src = new File("./Configuration/application.properties");
		try 
		{
			FileInputStream fis = new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
			
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/*public String getCoderName() {
		String name = pro.getProperty("coderName");
		System.out.println("Coder Name is:"+name);
		return name;
	}	
	public String getURL() {
		String name = pro.getProperty("url");
		System.out.println("url of the application is:"+name);
		return name;
	}*/
	
	//read property from application.properties file
	public String getConfigProperty(String key) {
		String value = pro.getProperty(key);
		return value;
	}

}
