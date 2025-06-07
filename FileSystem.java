import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileSystem{
	public static void main(String[] args)throws IOException
	{
		File f1 = new File("D:/report.txt");
		BufferedReader reader = new BufferedReader(new FileReader(f1));
		f1.createNewFile();
		System.out.println(f1.length());
		System.out.println(f1.getName());
		String line;
		while((line = reader.readLine()) != null){
			System.out.println(line);
		}
	}
} 

/**
FileSystem.java:6: error: unreported exception IOException; must be caught or declared to be thrown
                f1.createNewFile();
                                ^
1 error
error: compilation failed
**/