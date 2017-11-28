package demoex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Sheet;
import jxl.Workbook;

public class Ex2 {

	public static void main(String[] args) throws Exception {
	FileInputStream f=new FileInputStream("C:\\Users\\Lab\\Documents\\new23.xls");
	Workbook w1=Workbook.getWorkbook(f);
	Sheet s=w1.getSheet("Sheet1");
	System.out.println(s.getName());
	int i=1;
	String EmplID = s.getCell(0, i).getContents();
	String EmplPW = s.getCell(1, i).getContents();
	System.out.println(EmplID);
	System.out.println(EmplPW);
	w1.close();
	}
}
