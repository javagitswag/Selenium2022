package excelOperation;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class DataManagementFinalVersion 
{
  @Test(dataProvider = "getData")
  public void f(Hashtable<String,String> hs)
  {
  }

  @DataProvider
  public Object[][] getData() throws Exception
  {
	    ExcelAPI e=new ExcelAPI("C:\\Users\\mama\\Desktop\\suitex.xlsx");	
		String sheetName =  "data";
		String testCaseName = "TestA ";
	return DataUtils.getTestData(e, sheetName, testCaseName);
}
}
