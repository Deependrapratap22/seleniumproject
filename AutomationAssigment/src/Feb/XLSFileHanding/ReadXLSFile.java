package Feb.XLSFileHanding;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadXLSFile {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
       
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
	    		Cell cellValue=sheet.getCell(j, i);
	    		System.out.print("|"+cellValue.getContents()+"|");
	    		
	    	}
	    	System.out.println("");
	    }
		
		
	}

}
