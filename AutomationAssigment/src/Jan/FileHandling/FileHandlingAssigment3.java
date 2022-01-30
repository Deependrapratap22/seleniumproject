package Jan.FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingAssigment3 {
	

	public void WriteData(int rowcount) throws IOException
	{
		int count=1;
		Scanner sc=new Scanner(System.in);
		
		File file=new File("../AutomationAssigment/Files/Assignment2.txt");
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		for(int i=1;i<=rowcount;i++)
		{
		if(count<=rowcount)
		{
			System.out.println("Entre then conten of "+count+" row=>");
			String s=sc.nextLine();
			bw.write(s);
			bw.newLine();
			count++;
			
					}
		}
		bw.close();
		}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many line you want to print in file.");
		System.out.println("Please Enter the Row number->");
		int row=sc.nextInt();
		
		FileHandlingAssigment3 obj=new FileHandlingAssigment3();
		obj.WriteData(row);
		

	}

}
