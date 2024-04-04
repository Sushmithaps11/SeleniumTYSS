package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead 
{
   public static void main(String[] args) throws EncryptedDocumentException, IOException 
   {
	singleRead();
   }
   
   public static void singleRead() throws EncryptedDocumentException, IOException
   {
	   File file=new File("./TestData/TestData.xlsx");
	   FileInputStream fis=new FileInputStream(file);
	   Workbook workbook = WorkbookFactory.create(fis);
	   Sheet sheet = workbook.getSheet("login");
	   int num_rows=sheet.getPhysicalNumberOfRows();//get last row 
	   int num_cell =sheet.getRow(0).getPhysicalNumberOfCells();
	   Row row = sheet.getRow(0);
	   Cell cell = row.getCell(1);
	   System.out.println(cell.toString());
	   System.out.println(num_cell);
	   System.out.println(num_rows);
   }
   
   
}
