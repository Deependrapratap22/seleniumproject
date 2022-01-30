package Jan.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("../AutomationAssigment/Files/WriteTextFile.txt");
		FileWriter fw=new FileWriter(file);
		fw.write("This is deependra pratap singh");
		fw.write("working in tcs");
		fw.close();

	}

}
