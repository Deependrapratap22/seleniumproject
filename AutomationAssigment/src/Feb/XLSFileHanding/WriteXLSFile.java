package Feb.XLSFileHanding;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteXLSFile {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		// TODO Auto-generated method stub

		
		File file=new File("../AutomationAssigment/Files/writesampledata.xls");
		WritableWorkbook wr=Workbook.createWorkbook(file);
		WritableSheet ws=wr.createSheet("Deependera", 0);
		
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				Label content=new Label(j, i, "Deependra pratap Singh");
			     ws.addCell(content);
			}
		}
		
		wr.write();
		wr.close();
	}

}
