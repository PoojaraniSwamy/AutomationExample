package com.poi.prog;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelSheet_Read 
{
	public static void main(String[] args) 
	{
		writeToExcel2();
	}
	static void writeToExcel2()
	{
		FileInputStream fin = null;
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		int rowNum = 0;
		int colNum = 0;
		
		try 
		{
			fin = new FileInputStream("D:\\JAVAPROGRAMS\\Drivers\\Excel Files\\CoachingInstitute 4X3.xlsx");
			wb = new XSSFWorkbook(fin);		//Opening the existing excel file
			sh = wb.getSheet("data");
			
			//Verify that the sheet 'data' exist?
			if(sh == null)
		        {
					System.out.println("The sheet 'data' doesnot exist");
					return;
		        }
			
			rowNum = sh.getPhysicalNumberOfRows();
			for(int r=0; r < rowNum; r++)
			{
				row = sh.getRow(r);
				
				colNum = row.getPhysicalNumberOfCells();
				for(int c=0; c < colNum; c++)
				{
					cell = row.getCell(c);
					System.out.print(cell.getStringCellValue() + "      ");
				}
				System.out.println();
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try 
			{
				fin.close();
				fin = null;
				cell = null;
				row = null;
				sh = null;
				wb.close();
				wb = null;
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
