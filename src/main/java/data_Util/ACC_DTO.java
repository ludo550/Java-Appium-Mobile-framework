package data_Util;

import java.util.List;

import org.testng.annotations.DataProvider;

import data_Util.ExcelUtils;

public class ACC_DTO 
{
	public static String Test;
	public static String URL;
	public static String Uname;
	@DataProvider(name = "")
public void Acc_dto(String Test1) throws Exception 
{
		ExcelUtils.setExcelFile("C:\\Users\\Lionel\\workspace\\alkami.bethpage.staging\\src\\main\\data\\data.xlsx", "Sheet1");
		for(int i = 1; i<3; i++)
		{
		   Test = ExcelUtils.getCellData(i, 1);
		   if(ExcelUtils.getCellData(i, 1).contains(Test1))
		   {
		   	URL = ExcelUtils.getCellData(i, 2);
		   	Uname = ExcelUtils.getCellData(i, 3);
		   }
		}
}
}
