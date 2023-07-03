package com.sgtesting.exceldemo;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAssigne4 {
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
			for(int i=0;i<20;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(4);
				cell.setCellValue("Vegtables"+n);
				n++;
			}
			fout=new FileOutputStream("C:\\Users\\bindu\\OneDrive\\Documents\\Vegtable.xlsx");
			wb.write(fout);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				wb.close();
				fout.close();
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}


	}

}
