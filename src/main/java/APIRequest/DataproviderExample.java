package APIRequest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.EvaluationWorkbook;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.CellReferenceType;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetVisibility;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExample {

	
	  @Test(dataProvider="dataDriver") 
	  public void demo(String username, String pwd,String email) throws IOException {
	  System.out.println(username+" "+pwd+" "+email);
	  
	  }
	  
	  @DataProvider(name="dataDriver")
	  public Object[][] dataset() throws IOException
	  {
		 return new Object[][] {{"Admin","Pawwword","@gmail"},{"Admin","Pawwword","@yahoo"},{"Admin","Pawwword","@facebook"}};
	  }
	  
	  
	/*  @DataProvider(name="dataDriver") 
	  public Object[][] dataset() throws IOException
	  { 
	  String filePath="C:\\Users\\ritkumar\\Documents\\DataExecl_22\\MyData.xlsx";
	  File file=new File(filePath);
	  FileInputStream fis= new FileInputStream(file);
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sht=wb.getSheetAt(0);
	  int rowcount=sht.getPhysicalNumberOfRows();
	  XSSFRow row=sht.getRow(0);
	  int colcount=row.getLastCellNum();
	  Object[][] data=new Object[rowcount-1][colcount]; 
	  for(int i=0;i<rowcount-1;i++)
	  {
	  row=sht.getRow(i+1);
	  for(int j=0;j<colcount;j++)
	  { XSSFCell cell=row.getCell(j);
	  DataFormatter df= new DataFormatter();
	  data[i][j]=df.formatCellValue(cell); 
	  }
	  }
	  
	  return data; 
	  
	  } */
	  
	 
}
