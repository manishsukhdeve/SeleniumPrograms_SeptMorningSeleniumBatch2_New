package ExcelUtilTest;

import Selenium_14_ReadExcel_Using_APACHE_POI_API.Xls_Reader;

public class ExcelUtilTest {

	public static void main(String[] args) {

		Xls_Reader reader = new Xls_Reader("C:\\Users\\Mitansh\\Desktop\\SampleExcel.xlsx");
		
//		Xls_Reader reader = new Xls_Reader("C:\\Users\\Mitansh\\eclipse-workspace\\SeptMorningSeleniumBatch2_New\\src\\main\\java\\Selenium_14_ReadExcel_Using_APACHE_POI_API\\SampleExcel.xlsx");
		
//		1. getCellData
		
		String sheetName = "login";
		String data = reader.getCellData(sheetName, 0, 2);
		System.out.println(data);
		
//		2. getRowCount
		
		int rowCount = reader.getRowCount(sheetName);
		System.out.println("Total rows: " + rowCount);
		
//		3. addColumn
		
//		reader.addColumn(sheetName, "Status");
		
//		4. addSheet
		
//		reader.addSheet("Registration");
		
//		5. isSheetExist
		if (! reader.isSheetExist("Registration")) {
			reader.addSheet("Registration");
		}
		
//		6. setCellData
		reader.setCellData(sheetName, "Status", 2, "Pass");
		
//		7.getCellData
		System.out.println(reader.getCellData(sheetName, "username", 3));
		
//		8. getColumnCount
		System.out.println(reader.getColumnCount(sheetName));
		
//		9. removeColumn
//		reader.removeColumn("Registration", 0);
		
		System.out.println(reader.getCellData("Registration", "phonenumber", 2));
		System.out.println(reader.getCellData("Registration", "age", 2));
		
		
		
	}

}
