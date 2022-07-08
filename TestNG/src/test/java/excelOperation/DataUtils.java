 package excelOperation;

import java.util.Hashtable;

public class DataUtils 
{
  public static Object[][] getTestData(ExcelAPI e,String sheetName,String testCaseName)
  {
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
			dataRow++;             
		}
	return null;
 
  }

}
