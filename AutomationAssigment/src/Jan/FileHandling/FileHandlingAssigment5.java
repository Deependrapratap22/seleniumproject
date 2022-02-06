package Jan.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingAssigment5 {

	public void CopyAndPastFile() throws IOException {
		File srcFile = new File("../AutomationAssigment/Files/Assignment5SrcFile");
		FileReader fileReader = new FileReader(srcFile);
		@SuppressWarnings("resource")
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		File trgtFile = new File("../AutomationAssigment/Files/Assignment5TragetFile");
		FileWriter fileWriter = new FileWriter(trgtFile);
		BufferedWriter bw = new BufferedWriter(fileWriter);

		String s;
		while ((s = bufferedReader.readLine()) != null) {
			// System.out.println(s);
			bw.write(s);
			bw.newLine();

		}

		bw.close();

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileHandlingAssigment5 obj = new FileHandlingAssigment5();
		obj.CopyAndPastFile();

	}

}
