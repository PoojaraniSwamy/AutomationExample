package com.poi.prog;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelSheet_Write 
{
	public static void main(String[] args) 
	{
		//writeToExcel1();
		writeToExcel2();
	}
	static void writeToExcel1()
	{
		 FileOutputStream fout = null;
		 Workbook wb = null;
		 Sheet sh = null;
		 Row row = null;
		 Cell cell = null;
		 
		 try
		 {
			 wb=new XSSFWorkbook();
			 sh=wb.createSheet("Testdata");
			 
			 //creating 1th row
			 row=sh.createRow(0);
			 cell=row.createCell(0);
			 cell.setCellValue("SG Testing");
			 
			 //creating 2nd row
			 row=sh.createRow(1);
			 cell=row.createCell(1);
			 cell.setCellValue("Vijaynagar");
			 
			//creating 3rd row
			 row=sh.createRow(2);
			 cell=row.createCell(2);
			 cell.setCellValue("Bangalore");
			 
			 fout=new FileOutputStream("D:\\JAVAPROGRAMS\\Drivers\\Excel Files\\CoachingInstitute.xlsx");
			 wb.write(fout);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 finally
		 {
			 try
			 {
				 fout.flush();
				 fout.close();
				 wb.close();
				 fout=null;
				 wb=null;
				 sh=null;
				 row=null;
				 cell=null;
				 
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
		 }
	}



//Create and write to excel (4x3)
 static void writeToExcel2()
 {
	FileOutputStream fout = null;
	Workbook wb = null;
	Sheet sh = null;
	Row row = null;
	Cell cell = null;
	
	try 
	{
		wb = new XSSFWorkbook();
		sh = wb.createSheet("data");
		
		for(int r=0; r<4; r++)
		{
			row = sh.createRow(r);
			
			for(int c=0; c<3; c++)
			{
				cell = row.createCell(c);
				cell.setCellValue("Row:"+r+", Cell:"+c);
			}
		}
		
		fout = new FileOutputStream("D:\\JAVAPROGRAMS\\Drivers\\Excel Files\\CoachingInstitute 4X3.xlsx");
		wb.write(fout);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		try 
		{
			fout.flush();
			fout.close();
			fout = null;
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

