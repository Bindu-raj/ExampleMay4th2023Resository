package com.sgtesting.exceldemo;


import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemoWrite {
	public static void main(String[] args) {
		writeContent();
	}
	public static void writeContent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;

		try
		{
			wb= new XSSFWorkbook();
			sh=wb.createSheet("Credentials");
			//First row
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("UserName");
			cell=row.createCell(1);
			cell.setCellValue("Password");
			//Second row
			row=sh.createRow(1);
			cell=row.createCell(0);
			cell.setCellValue("Admin");
			cell=row.createCell(1);
			cell.setCellValue("Manager");
			fout=new FileOutputStream("C:\\Users\\bindu\\OneDrive\\Documents\\Book11.xlsx");
			wb.write(fout);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}


	}


}
