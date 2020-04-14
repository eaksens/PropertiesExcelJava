package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//outputStream -write character to file
		//inputStream -read character from file
		/*
		 * Write a text file using java
		 * 1. Use outputStream -selects the directory in which our text file will be saved
		 * 2. User outputStream to create a file and chain it to previous step
		 * 3. 
		 */
		
		//Stream Connectivity
		//outputStream to select directory
		File f = new File("C:\\Users\\mai_s\\eclipse-workspace\\filewriter\\myHtmlFile.html"); //import java.io
		//outputStream to write files, and chainging to previous step
		FileWriter fw = new FileWriter(f,false);
		BufferedWriter writer = new BufferedWriter(fw);
		
		//so write the for loop so that it won't get overrided
		
		/*for(int i=0; i<4; i++) { //row
			for(int j=0; j<3; j++) { //column
				int num = (int)(Math.random()*100);
				writer.write(num +",");
			}
			
			writer.newLine();
		}*/
		//every times this will override the file
		//Writing inside the file
		/*writer.write("second Line");
		writer.newLine();
		writer.write("India");
		writer.newLine();
		writer.write("Mai Eaksen");*/
		
		//create html file
		writer.write("<html> <body> <title> Way2Automation </title><h1>Learning Java for automation</h1></body></html>");
		
		//closing stream
		writer.close();
		
		System.out.println("File is created!!");
	}

}
