package excelOperation;

public class DataDemo
{
	public static void main(String[] args) throws Exception 
	{
	ExcelAPI e = new ExcelAPI("C:\\Users\\mama\\Desktop\\book1.xlsx");
	System.out.println(e.getRowCount("login"));
	System.out.println(e.columnCount("login"));
	System.out.println(e.getCellData("login", 1 , 1));
	System.out.println(e.getCellData("login","username", 1));
	e.setCellData("login", 4, 4, "pass");
	}

}
