package com.ssjvirtually.ExcelDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	

	public static void createSheet() throws IOException {
		

        // Creating Workbook instances
        Workbook wb = new XSSFWorkbook();
  
        // An output stream accepts output bytes and sends them to sink.
        OutputStream fileOut = null;
		try {
			fileOut = new FileOutputStream("ssjvirtually.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
        // Creating Sheets using sheet object
        Sheet sheet1 = wb.createSheet("Array");
        Sheet sheet2 = wb.createSheet("String");
        Sheet sheet3 = wb.createSheet("LinkedList");
        Sheet sheet4 = wb.createSheet("Tree");
        Sheet sheet5 = wb.createSheet("Dynamic Programing");
        Sheet sheet6 = wb.createSheet("Puzzles");
          
        Row rowhead = sheet1.createRow((short)0);  
        rowhead.createCell(0).setCellValue("S.No.");  
        rowhead.createCell(1).setCellValue("Customer Name");  
        rowhead.createCell(2).setCellValue("Account Number");  
        rowhead.createCell(3).setCellValue("e-mail");  
        rowhead.createCell(4).setCellValue("Balance");  

  
System.out.println("Sheets Has been Created successfully");
  
        wb.write(fileOut);
        fileOut.close();
        wb.close();
	
	}
	
	
}
