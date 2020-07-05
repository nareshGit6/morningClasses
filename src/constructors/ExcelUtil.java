package constructors;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtil {
	
	public static void main(String[] args) {
		ExcelUtil obj=new ExcelUtil();
		//obj.m1();
		//obj.m2();
	}
	
	public void getRow() {
		System.out.println("methos 1");
		
	}
	public void m2() {
		System.out.println("method 2");
	}
	public ExcelUtil(File f) {//method contains same as class name no return type even void not returns
		try {
			FileInputStream fis=new FileInputStream(f);
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("give a accurate excel file location");
			e.printStackTrace();
		}
	}

}
