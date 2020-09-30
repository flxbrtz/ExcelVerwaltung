package Excel_ReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Verwaltung.Student;

public class ReadExcel 
{
	// Reads the input excel file and creates for each student a new Object of class Student
	public List<Student> readStudentsFromExcelFile(String excelFilePath) 
			throws IOException 
	{
		List<Student> allStudents = new ArrayList<Student>();
		FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

		Workbook workbook = getWorkbook(inputStream, excelFilePath);
		Sheet firstSheet = workbook.getSheetAt(0);
		firstSheet.removeRow(firstSheet.getRow(0));
		Iterator<Row> iterator = firstSheet.iterator();
		Row row;
		

		while (iterator.hasNext()) 
		{
			
			Row nextRow = iterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();
			Student student = new Student(null, null, null, null, null, null, null);

			while (cellIterator.hasNext()) 
			{
				Cell nextCell = cellIterator.next();
				int columnIndex = nextCell.getColumnIndex();

				switch (columnIndex) 
				{
						case 0:
							student.SetName(
									(String) getCellValue(nextCell)
									);
							break;
						case 1:
							student.SetKlassenName(
									(String) getCellValue(nextCell)
									);
							break;
						case 2:
							student.SetVorname(
									(String) getCellValue(nextCell)
									);
							break;
						case 3: // Date Column
							// Array which holds the splitted Date
							String TempDateArr[] = getCellValue(nextCell).toString().split(".");
							if(TempDateArr.length > 1) 
							{
								//Creating into a valid format for the Date.valueOf() function
								String BirthDate =    TempDateArr[2] 
													+ "-" 
													+ TempDateArr[1] 
													+ "-" 
													+ TempDateArr[0];
								
								student.SetGeburtsdatum(
										 Date.valueOf(
												 BirthDate
												 ));
							}
							else 
							{
								student.SetGeburtsdatum(
										Date.valueOf(
												"1990-01-01"
												)
										);
							}
							break;
							
						case 4:
							student.SetKlassenStufe(
									(String) getCellValue(nextCell)
									);
							break;
						case 5:
							student.SetGeschlecht(
									(String) getCellValue(nextCell)
									);
							break;
				}
				
			allStudents.add(student); 
			}
			
		}

		workbook.close();
		inputStream.close();
		
		return allStudents;
	}
	
	
	// Gets the cell value of the given cell
	private Object getCellValue(Cell cell) 
	{
		switch (cell.getCellType()) 
		{
		case STRING:
			return cell.getStringCellValue();

		case BOOLEAN:
			return cell.getBooleanCellValue();

		case NUMERIC:
			return cell.getNumericCellValue();
		
		case BLANK:
			break;
		}


		return null;
	}
	
	
	// Creats the Workbook depending on which ending "xls" or "xlsx" the Excel Data
	private Workbook getWorkbook(FileInputStream inputStream, String excelFilePath)
			throws IOException 
	{
		Workbook workbook = null;

		if (excelFilePath.endsWith("xlsx")) 
		{
			workbook = new XSSFWorkbook(inputStream);
		}
		else if (excelFilePath.endsWith("xls")) 
		{
			workbook = new HSSFWorkbook(inputStream);
		} 
		else 
		{
			throw new IllegalArgumentException("The specified file is not Excel file");
		}

		return workbook;
	}
	
}