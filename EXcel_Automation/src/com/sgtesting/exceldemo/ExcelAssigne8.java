package com.sgtesting.exceldemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAssigne8 {
	
	public static void main(String[] args) {
		writeContent();
	}
	private static void writeContent() {
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb1=null;
		Workbook wb2=null;
		Sheet wb1sh=null;
		Sheet wb2sh=null;
		Row rowwb1=null;
		Row rowwb2=null;
		Cell cellwb1=null;
		Cell cellwb2=null;

		try
		{
			fin=new FileInputStream("C:\\Excel\\Assigne8.xlsx");
			wb1=new XSSFWorkbook(fin);
			wb2=new XSSFWorkbook();
			wb1sh=wb1.getSheet("Sheet1");
			wb2sh=wb2.getSheet("Sheet1");
			if(wb2sh==null)
			{
				wb2sh=wb2.createSheet("Sheet1");
			}
			int rc=wb1sh.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				rowwb1=wb1sh.getRow(r);
				rowwb2=wb2sh.getRow(r);
				if(rowwb2==null)
				{
					rowwb2=wb2sh.createRow(r);
				}
				int cc=rowwb1.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cellwb1=rowwb1.getCell(c);
					cellwb2=rowwb2.getCell(c);
					if(cellwb2==null)
					{
						cellwb2=rowwb2.createCell(c);
					}
					String data=cellwb1.getStringCellValue();
					cellwb2.setCellValue(data);
				}
			}
			fout=new FileOutputStream("C:\\Excel\\Assigne8.xlsx");
			wb2.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
				wb2.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
