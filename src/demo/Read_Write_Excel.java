package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Write_Excel {
	private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
    private static XSSFRow Row;
    
    
    public static void setExcelFile(String Path, String SheetName) throws Exception{                

    	try
    	{
    		FileInputStream ExcelFile = new FileInputStream(Path);
    		ExcelWBook = new XSSFWorkbook(ExcelFile);
    		ExcelWSheet = ExcelWBook.getSheet(SheetName);
    	} 
    	catch (Exception e) 
    	{
    		throw (e);
    	}

    }
    public static String getCellData(int Row, int RowNum, String name) throws Exception {

    	try 
    	{
    		DataFormatter formatter = new DataFormatter();
			Cell cell = null;
			int totalColumn = ExcelWSheet.getRow(0).getLastCellNum();
			System.out.println(totalColumn);
    		
    		cell = ExcelWSheet.getRow(Row).getCell(RowNum);
    		String CellData = formatter.formatCellValue(cell);  		
    		return CellData;
    	} 
    	catch (Exception e) 
    	{
    		return "";
    	}
    }
    
    /*public static void setCellData(String Result, int RowNum, int ColNum, File Path) throws Exception {
    	
    	try 
    	{
	       Row = ExcelWSheet.createRow(RowNum - 1);
	       Cell = Row.createCell(ColNum - 1);
	       Cell.setCellValue(Result);
	       FileOutputStream fileOut = new FileOutputStream(Path);
	       ExcelWBook.write(fileOut);
	       fileOut.flush();
	       fileOut.close();
    	} 
    	catch (Exception e) {
    		throw (e);
    	}

    }*/
}
