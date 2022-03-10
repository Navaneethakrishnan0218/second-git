package org.auto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Autom {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Paramesh\\eclipse-workspace\\Automation\\DB\\Book1.xlsx");
	 FileInputStream stream = new FileInputStream(file);
	 
              Workbook workbook =new XSSFWorkbook(stream);
              
              Sheet sheet = workbook.getSheet("Sheet1");
              Row row = sheet.getRow(2);
               
              Cell cell = row.getCell(1);
              String cellV = cell.getStringCellValue();
              
              if (cellV.equals("Naveen")) {
            	  cell.setCellValue("harsha");
				}
               
             FileOutputStream out =new FileOutputStream(file);
             workbook.write(out);
              
              
//              for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
//            	  Row row = sheet.getRow(i);
//            	   for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//					Cell cell = row.getCell(j);
//					//System.out.println(cell);
//					CellType cellType = cell.getCellType();
//					switch (cellType) {
//		
//					case STRING:
//						String data = cell.getStringCellValue();
//						System.out.println(data);
//						break;
//						
//					case NUMERIC:
//						if (DateUtil.isCellDateFormatted(cell)) {
//							Date date = cell.getDateCellValue();
//							SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy");
//							String dateInfo = format.format(date);
//							System.out.println(dateInfo);
//						}else{
//							double cellValue = cell.getNumericCellValue();
//							BigDecimal aa = BigDecimal.valueOf(cellValue);
//							String string = aa.toString();
//							System.out.println(string);
//							
//						}					
//					}	
//					
//				}
//				
//			}	
	}}


