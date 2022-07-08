package excelOperation;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class DataManagementWithHashTable 
{
  @Test(dataProvider = "getData")
  public void f(Hashtable<String , String>h)
  {
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	  ExcelAPI e=new ExcelAPI("C:\\Users\\mama\\Desktop\\suitex.xlsx");	
		String sheetName =  "data";
		String testCaseName = "TestA ";
		
		int testStartRowNum=0;
		while(!e.getCellData(sheetName, 0, testStartRowNum).equals(testCaseName));
		{
		testStartRowNum++;
		}
		System.out.println(" test start from : "+ testStartRowNum);
		
		int colStartRowNum=testStartRowNum+1;
		int dataStartRowNum=testStartRowNum+2;
		
		//calculate row of data
		int rows=0;
		while(!e.getCellData(sheetName, 0 ,dataStartRowNum+rows).equals(""))
		{
			rows++;
		}
		System.out.println("total Row :" + rows);
		
		//calculate  cols of data
		int cols = 0;

		while(!e.getCellData(sheetName,cols,colStartRowNum).equals(""))
		{
			cols++;
		}
		System.out.println("total cols are:"+cols);
		//read the test data
		int dataRow=0;
		Object[][] data=new Object[rows][cols];
		Hashtable<String,String> table=null;
		for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++)
		{
			table=new Hashtable<String ,String>();
			for(int cNum=0;cNum<cols;cNum++ )
			{
			//data[dataRow][cNum] = e.getCellData(sheetName, cNum, rNum);
			String keys = e.getCellData(sheetName, cNum, colStartRowNum);
			String values = e.getCellData(sheetName, cNum, rNum);
			table.put(keys, values);
			}
			data[dataRow][0]=table;
			dataRow++;             //its all are comon for every class i dont want to write its all so i create one class-->datautils(java class)
		}
	return null;
   
  }
}
