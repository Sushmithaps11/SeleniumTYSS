package testng;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleExcelRead {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		multipleRead();
	}

	public static String[][] multipleRead() throws EncryptedDocumentException, IOException {
		File file = new File("./TestData/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("login");
		int rowSize = sheet.getPhysicalNumberOfRows();
		int colSize = sheet.getRow(0).getPhysicalNumberOfCells();

		String[][] data = new String[rowSize-1][colSize];
		for (int i = 0; i < rowSize-1; i++) {
			for (int j = 0; j < colSize; j++) {
				data[i][j] = sheet.getRow(i).getCell(j).toString();

			}

		}
		/*for (int i = 0; i < rowSize - 1; i++) {
			for (int j = 0; j < colSize; j++) {
				System.out.println(data[i][j]);
			}
		}
		System.out.println();
*/
		return data;
	}
}
