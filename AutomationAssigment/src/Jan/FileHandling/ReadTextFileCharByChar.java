package Jan.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFileCharByChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("../AutomationAssigment/Files/TextFile.txt");
		FileReader fr=new FileReader(file);
		int a;
		while((a=fr.read())!=-1)
		{
		    System.out.println((char)a);	
		}
		

	}

}
