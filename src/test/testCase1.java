package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class testCase1 {
	
	public static void main(String[] args) throws IOException, FileNotFoundException{
	Properties prop = new Properties();
	FileInputStream f = new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\object.properties");
	prop.load(f);
	System.out.println(prop.getProperty("name"));
	System.out.println(prop.getProperty("age"));
	System.out.println(System.getProperty("user.dir"));
	}
}
