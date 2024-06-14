package exceloperations;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class Excelread {
	
	@Test
	void excelread () throws BiffException, IOException {
	
	FileInputStream fis = new FileInputStream("D:\\Prachi\\JavaByKiran\\TestNG\\src\\exceloperations\\TestData.xls");
	Workbook wb= Workbook.getWorkbook(fis);
	Sheet sh= wb.getSheet("Sheet1");
	
	int rows = sh.getRows();		
	int col = sh.getColumns();// 2
	System.out.println("rows = "+rows +"col ="+col);
	
	for(int i=0;i<rows;i++) {// for rows
		
		for(int j=0;j<col;j++) {// for cols
			
			
			Cell c = sh.getCell(j, i);	
			String data = c.getContents();
			System.out.print(data+"    ");
		}
		System.out.println();
	}
	
	}


	


}

