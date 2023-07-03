package com.sgtesting.exceldemo;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ExcelFileDemo {

	public static void main(String[] args) {
		readContent();
	}
	public static void readContent()
	{
		FileInputStream fin=null;
	     Workbook wb=null;
		Sheet sh=null;
		Row rw=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("C:\\Apple.xlsx");
			wb=new XSSFWorkbook(fin);
			sh= wb.getSheet("Sheet1");
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				Row row = sh.getRow(r);
				int cc=row.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cell=row.getCell(c);
					String data=cell.getStringCellValue();
					System.out.println(data+"   ");

				}
				System.out.println();
			}


		}catch (Exception e)
		{
			e.getStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
