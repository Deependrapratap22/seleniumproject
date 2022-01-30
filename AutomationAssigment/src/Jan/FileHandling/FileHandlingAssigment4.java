package Jan.FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingAssigment4 {
	
	public void WriteDataInRange(int startRange, int endRange) throws IOException
	{
		int count=1;
		Scanner sc=new Scanner(System.in);
		File file=new File("../AutomationAssigment/Files/Assignment4.txt");
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		for (int i=1;i<=endRange;i++)
		{
			if (count>=startRange && count<=endRange)
			{
				System.out.print("Enter File Content=>");
				String s=sc.nextLine();
				bw.write(s);
				
			}
			bw.newLine();
			count++;
		}
		bw.close();
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting row number");
		int startrow=sc.nextInt();
		System.out.println("Enter Starting row number");
		int endRange=sc.nextInt();
		
		FileHandlingAssigment4 obj=new FileHandlingAssigment4();
		obj.WriteDataInRange(startrow, endRange);
		

	}

}
