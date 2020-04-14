import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {
	
	public static void main(String[] args) throws IOException, FileNotFoundException{
		
		//connecting stream
		File f = new File("C:\\Users\\mai_s\\eclipse-workspace\\filewriter\\new.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		
		//read text file
			//System.out.println(reader.readLine());
		
		
		//apply loop to read the whole file
		String line = null;		
		while((line = reader.readLine())!=null) {
			System.out.println(line);
		}
		
		//close connection stream
		reader.close();
	}

}
