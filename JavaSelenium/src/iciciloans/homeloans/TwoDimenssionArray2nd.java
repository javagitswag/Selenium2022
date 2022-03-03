package iciciloans.homeloans;

public class TwoDimenssionArray2nd {

	public static void main(String[] args) {
	int [][]a= {{1,2,3},
			{4,5},
			{6,7,8,9}};
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
		}
	System.out.println();
	}               //using for each loop    
	for(int []p:a)//p is holding rows
	{
		for(int q:p)//q is holding columns
		{
		System.out.print(q+" ");
		}
		System.out.println();
	}
	}
	

	}


