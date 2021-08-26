package com.poi.prog;

import java.io.FileInputStream;
import java.util.Calendar;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormatTheCellTypes 
{
	public static void main(String[] args) 
	{
		readExcelData();
	}
	
	//Read the data from the excel file which is having data of different datatypes
		static void readExcelData()
		{
			FileInputStream fin = null;
			Workbook wb = null;
			Sheet sh = null;
			Row row = null;
			Cell cell = null;
			int rowNum = 0;
			int colNum = 0;
			String strData = null;
			String sDay = null;
			String sMonth = null;
			String sYear = null;
			try 
			{
				fin = new FileInputStream("");
				wb = new XSSFWorkbook(fin);
				sh = wb.getSheet("FormatData");
				
				//Verify the sheet exist or not
				if(sh == null)
				{
					System.out.println("The sheet name 'FormatData' doesnot exist");
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
						
						//Here format cell data
						if(cell==null || cell.getCellType()==CellType.BLANK) 
						{
							strData = "";
						}
						else if(cell.getCellType()==CellType.BOOLEAN)
						{
							strData = String.valueOf(cell.getBooleanCellValue());
						}
						else if(cell.getCellType()==CellType.STRING)
						{
							strData = cell.getStringCellValue();
						}
						else if(cell.getCellType()==CellType.NUMERIC)
						{
							//verify the cell contains date OR number
							if(DateUtil.isCellDateFormatted(cell) == true)
							{
								//Read the date form excel and convert to java date
								double dt = cell.getNumericCellValue();
								Calendar cal = Calendar.getInstance();
								cal.setTime(DateUtil.getJavaDate(dt));
								
								//If day is <10, then prefix with zero
								if(cal.get(Calendar.DAY_OF_MONTH) < 10) 
								{
									sDay = "0" + cal.get(Calendar.DAY_OF_MONTH);
								}
								else 
								{
									sDay = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
								}
								
								
								//If month is < 10, then prefix with zero
								if((cal.get(Calendar.MONTH)+1) < 10) 
								{
									sMonth = "0" + (cal.get(Calendar.MONTH)+1);
								}
								else 
								{
									sMonth = String.valueOf((cal.get(Calendar.MONTH)+1));
								}
								
								sYear = String.valueOf(cal.get(Calendar.YEAR));
								strData = sDay +"/"+ sMonth +"/"+ sYear;
							}
							else
							{
								strData = String.valueOf(cell.getNumericCellValue());
							}
						}
						System.out.print(strData + "    ");
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
					sDay = null;
					sMonth = null;
					sYear = null;
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
}
