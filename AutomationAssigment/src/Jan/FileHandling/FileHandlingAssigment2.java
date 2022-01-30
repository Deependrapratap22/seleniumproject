package Jan.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingAssigment2 {

	public void ReadDataOfRange(int startingrow, int endrow) throws IOException {
		String s;
		int count = 0;
		File file = new File("../AutomationAssigment/Files/TextFile.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);

		while ((s = reader.readLine()) != null) {
			count++;
			if (count >= startingrow && count <= endrow) {
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Enter Start row number=>");
		Scanner sc = new Scanner(System.in);
		int startingrow = sc.nextInt();

		System.out.println("Enter End row number=>");
		int endrow = sc.nextInt();

		FileHandlingAssigment2 obj = new FileHandlingAssigment2();
		obj.ReadDataOfRange(startingrow, endrow);

	}

}
