package marathon3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class CommonIntegration1 {

	public static String[][] readExcel(String filename) throws IOException {

		XSSFWorkbook wbook=new XSSFWorkbook("./Data/"+filename+".xlsx");
		XSSFSheet sheetAt = wbook.getSheetAt(0);
		int RowCount = sheetAt.getLastRowNum();
		System.out.println("Row Count:"+RowCount);
		int cellcount = sheetAt.getRow(1).getLastCellNum();
		System.out.println("Column Count:"+cellcount);
		//Step1:Create Array-->[5][4]
		String[][] data=new String[RowCount][cellcount];
		for (int i = 1; i <=RowCount ; i++) {
			for (int j = 0; j <cellcount; j++) {
				String stringCellValue = sheetAt.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);	


				//Step2: Read value from excel and pass it dataprovider
				data[i-1][j]=stringCellValue;
			}
		}
		wbook.close();
		//Step3: return variable name
		return data;
	}
}


