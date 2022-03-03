package iciciloans.homeloans;

public class TwoDimenssionArray {

	public static void main(String[] args) {
		//int []a= {10,20,30,40};
		//int[] a=new int[4];    //one dimonssional array
		int [][] a = { {1,2,3},
				      {4,5,6},
				      {7,8,9}
				    };
		for(int i=0;i<3;i++)
		{
		 for(int j=0;j<3;j++)
		 {
		System.out.print(a[i][j]+ " ");
		 }
		 System.out.println();
		 
		}
	}

}
	
