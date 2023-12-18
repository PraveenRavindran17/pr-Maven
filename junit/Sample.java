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

public class Sample {

	public static void main(String[] args) throws IOException {

		File excelLoc = new File("C:\\Users\\praveen kumar\\eclipse-workspace\\MavenProject\\Excel\\details.xlsx");

		FileInputStream fin = new FileInputStream(excelLoc);

		Workbook w = new XSSFWorkbook(fin);

		Sheet s = w.getSheet("data");

		// to iterate the rows one by one
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			// to get row from sheet
			Row r = s.getRow(i);

			// to iterate the cells one by one
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {

				// to get the cells from row
				Cell c = r.getCell(j);
				System.out.println(c);
			}

		}

	}

}
