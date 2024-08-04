package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class util {
	
	
	public static String properties() throws IOException {
		
		
	
	Properties prop =new Properties();
	
	String path = System.getProperty("user.dir")+"\\src\\test\\resources\\Automationtestingfeature\\propfile.properties";
	FileInputStream fs =new FileInputStream(path);
	
	prop.load(fs);
	
	String brname = prop.getProperty("browsername");
	
	String maven_browsername = System.getProperty("clibrowser");
	
	if(maven_browsername!=null)
	{
	
		brname=maven_browsername;
	
	}
	return brname;
	}
	
	public static String testdata(int row,int cell) throws EncryptedDocumentException, IOException {
		
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\Automationtestingfeature\\Practic Microsoft Excel Worksheet.xlsx";
		FileInputStream file=new FileInputStream(path);
		
		
		String value = WorkbookFactory.create(file).getSheet("Sheet9").getRow(row).getCell(cell).getStringCellValue();
		
		return value;
	}
}
