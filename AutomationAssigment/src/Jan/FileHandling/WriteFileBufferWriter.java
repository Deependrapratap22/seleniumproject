package Jan.FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileBufferWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("../AutomationAssigment/Files/WriteTextFile.txt");
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("this is deependra pratap singh");
		bw.newLine();
		bw.write("currently working");
		bw.close();
		
		
		//through bufferwriter appen in file
	
	
		
		File appendfile=new File("../AutomationAssigment/Files/WriteTextFile.txt");
		FileWriter appendfw=new FileWriter(appendfile,true);
		BufferedWriter appendbw=new BufferedWriter(appendfw);
		appendbw.newLine();
		appendbw.write("this is third line");
		appendbw.close();
		
		
		
		
		
	}

}
