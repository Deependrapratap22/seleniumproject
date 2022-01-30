package Jan.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFileLinebyLine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("../AutomationAssigment/Files/TextFile.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
		
		

	}

}
