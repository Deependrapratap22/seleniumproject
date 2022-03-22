package Feb.XLSFileHanding;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assigment2 {

	public void ReadDataBasedUponRange(int rowNo) throws  IOException, BiffException
	{
		File file=new File("../AutomationAssigment/Files/sampledata.xls");
		Workbook workbook=Workbook.getWorkbook(file);
		Sheet sheet=workbook.getSheet(0);
		int row=sheet.getRows();
		int col=sheet.getColumns();
		
		System.out.println("Total row-:"+row);
	    System.out.println("Total col-:"+col);
	    for (int i=0;i<row;i++)
	    {
	    	for (int j=0;j<col;j++)
	    	{
	    		if((rowNo-1)==i)
	    		{
	    		Cell cellValue=sheet.getCell(j, i);
	    		System.out.print("|"+cellValue.getContents()+"|");
	    		}
	    		
	    	}
	    	//System.out.println("");
	    }
		
	}
	
	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		Assigment2 obj=new Assigment2();
		obj.ReadDataBasedUponRange(3);

	}

}
