package Feb.XLSFileHanding;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

//Assignment 1 : Create a method (ReadDataBasedUponRowNoAndColumnNo) and pass the rowNp and colNo and that method will read the data of the particular cell
//while calling the method.
//
//Pass the rowno and colno and that method will read the value of that paritcular cell


public class Assigment1 {

	public void ReadDataBasedUponRowNoAndColumnNo(int rangRow, int rangCol) throws BiffException, IOException
	{
		
		File file=new File("../AutomationAssigment/Files/sampledata.xls");
		Workbook workbook=Workbook.getWorkbook(file);
		Sheet sheet=workbook.getSheet(0);
		int row=sheet.getRows();
	    int col=sheet.getColumns();
	    System.out.println("Total row-:"+row);
	    System.out.println("Total col-:"+col);
	    Cell cellValue=sheet.getCell(rangCol, rangRow);
		System.out.print("|"+cellValue.getContents()+"|");
	    
	    
//	    for (int i=0;i<row;i++)
//	    {
//	    	for (int j=0;j<col;j++)
//	    	{
//	    		if((rangRow)==i && (rangCol)==j)
//	    		{
//	    		Cell cellValue=sheet.getCell(j, i);
//	    		System.out.print("|"+cellValue.getContents()+"|");
//	    		}
//	    		
//	    	}
//	    	//System.out.println("");
//	    }
	}
	
	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		Assigment1 obj=new Assigment1();
		obj.ReadDataBasedUponRowNoAndColumnNo(14, 1);
		
	

	}

}
