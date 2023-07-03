package com.sgtesting.exceldemo;

import java.io.FileOutputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAssigne2 {
	public static void main(String[] args) {
		WriteContent();
	}
	public static void WriteContent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Sheet1");
			int n=1;
			row=sh.createRow(9);
			for(int i=0;i<20;i++)
			{
				cell=row.createCell(i);
				cell.setCellValue("Flower"+n);
				n++;
			}
			fout=new FileOutputStream("C:\\Users\\bindu\\OneDrive\\Documents\\Flowers.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				wb.close();
				fout.close();
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}
