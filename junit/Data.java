package org.junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {
	public static void main(String[] args) throws IOException {

		File excelLoc = new File("C:\\Users\\praveen kumar\\eclipse-workspace\\MavenProject\\Excel\\details.xlsx");
		FileInputStream fin = new FileInputStream(excelLoc);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("data");
       int rowNo = s.getPhysicalNumberOfRows();
       
		
		Row r = s.getRow(0);
		int cellNo = r.getPhysicalNumberOfCells();
		
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r1 = s.getRow(i);
		for (int j = 0; j < r1.getPhysicalNumberOfCells(); j++) {

		Cell c = r1.getCell(j);
		System.out.println(c);

	}
	}
	}
	}
