package com.poi.prog;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromSheet1AndWriteToSheet2 
{
	public static void main(String[] args) 
	{
		readAndWriteToAnotherSheet();
	}
	//Q: How to copy (read) from one sheet to another sheet?
		static void readAndWriteToAnotherSheet()
		{
			FileInputStream fin = null;
			FileOutputStream fout = null;
			Workbook wb = null;
			Sheet sh1 = null;
			Sheet sh2 = null;
			Row row1 = null;
			Row row2 = null;
			Cell cell1 = null;
			Cell cell2 = null;
			int rowNum = 0;
			int colNum = 0;
			String strData = null;
			try {
				fin = new FileInputStream("C:\\temp\\EveningBatch\\Sample1.xlsx");
				wb = new XSSFWorkbook(fin);
				sh1 = wb.getSheet("testData");
				
				if(wb.getSheet("Results") == null) {
					sh2 = wb.createSheet("Results");
				}else {
					sh2 = wb.getSheet("Results");
				}
				
				rowNum = sh1.getPhysicalNumberOfRows();
				for(int r=0; r < rowNum; r++)
				{
					row1 = sh1.getRow(r);
					
					if(sh2.getRow(r) == null) {
						row2 = sh2.createRow(r);
					}else {
						row2 = sh2.getRow(r);
					}
					
					colNum = row1.getPhysicalNumberOfCells();
					for(int c=0; c < colNum; c++)
					{
						cell1 = row1.getCell(c);
						
						if(row2.getCell(c) == null) {
							cell2 = row2.createCell(c);
						}else {
							cell2 = row2.getCell(c);
						}
						
						strData = cell1.getStringCellValue();
						cell2.setCellValue(strData);
					}
				}
				
				fout = new FileOutputStream("C:\\temp\\EveningBatch\\Sample1.xlsx");
				wb.write(fout);
			}catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				try {
					fout.flush();
					fout.close();
					fout = null;
					fin.close();
					fin = null;
					cell1 = null;
					cell2 = null;
					row1 = null;
					row2 = null;
					sh1 = null;
					sh2 = null;
					wb.close();
					wb = null;
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
}
