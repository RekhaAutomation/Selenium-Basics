package com.excel.poi;

import com.excel.utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {
		Xls_Reader reader=new Xls_Reader("C:\\Users\\ganib\\eclipse-workspace\\newproject\\src\\com\\testdata\\Ebaytestdata.xlsx");

if(!reader.isSheetExist("HomePage")){
	reader.addSheet("HomePage");
}

reader.addHyperLink("HomePage", "screeshot1", "login_username", 1, "http://www.facebook.com", "testcase failed");
int colCount=reader.getColumnCount("RegTestData");
System.out.println("Number of coloms present in this sheet are*********"+colCount);
int rowNum=reader.getCellRowNum("RegTestData", "Firstname", "Tom");
System.out.println("The row no.is:"+rowNum);
	}
	}


