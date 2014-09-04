import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	 static XSSFSheet ExcelWSheet;
	    XSSFWorkbook ExcelWBook;
	    static XSSFCell Cell;
	    XSSFRow Row;
	    
	//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method
	public void setExcelFile(String Path,String SheetName) throws Exception {
	       try {
	           // Open the Excel file
	        FileInputStream ExcelFile = new FileInputStream(Path);
	        // Access the required test data sheet
	        ExcelWBook = new XSSFWorkbook(ExcelFile);
	        ExcelWSheet = ExcelWBook.getSheet(SheetName);
	        } catch (Exception e){
	            throw (e);
	        }
	}
	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num
	public static String getCellData(int RowNum, int ColNum) throws Exception{
	       try{
	          Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
	          String CellData = Cell.getStringCellValue();
	          return CellData;
	          }catch (Exception e){
	            return"";
	          }
	}

	public static void main(String[] args) throws Exception {
		String Path = "C:\\Pavan Mitta\\Backup\\Data\\Selenium-WD\\Test\\src\\TestData\\EMV Z01.xlsx";
	    String SheetName = "TestData";
		ExcelRead objExcel = new ExcelRead();
	    objExcel.setExcelFile(Path, SheetName);
		
		String sPwd1 = ExcelRead.getCellData(1, 0);
		String sPwd = ExcelRead.getCellData(1, 1);
		String sName1 = ExcelRead.getCellData(2, 0);
		String sName = ExcelRead.getCellData(2, 1);
		String sName2 = ExcelRead.getCellData(3, 0);
		String sPwd2 = ExcelRead.getCellData(3, 1);
		
		System.out.println(sPwd1);
		System.out.println(sPwd);
		System.out.println(sName1);
		System.out.println(sName);
		System.out.println(sName2);
		System.out.println(sPwd2);
		
		
	}

}

