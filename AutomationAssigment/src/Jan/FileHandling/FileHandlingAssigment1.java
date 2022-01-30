package Jan.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingAssigment1 {
	
	public void ReadData(int rowNumber) throws IOException
	
	{
		String s;
		int count=1;
		File file=new File("../AutomationAssigment/Files/TextFile.txt");
		FileReader fileReader=new FileReader(file);
		BufferedReader reader=new BufferedReader(fileReader);
		while((s=reader.readLine())!=null)
		{
			
			if (count==rowNumber)
			{
				System.out.println(s);
			}
				count++;
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter row number=>");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		FileHandlingAssigment1 obj=new FileHandlingAssigment1();
		obj.ReadData(i);



	}

}
