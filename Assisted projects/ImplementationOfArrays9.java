package assisted;

public class ImplementationOfArrays9 {

	public static void main(String[] args) {
		//single dimensional array
		int arr[]= {1,8,9,5,4};
		System.out.println("The single dimensional array");
		for(int i=0;i<arr.length;i++)
		{
          System.out.print(arr[i]+" "); //printing the 1D array

		}
		System.out.println("\n");
	//multidimensional array
		int a[][]={ {1,2,3,4},
				{5,6,7,8},
				{0,6,3,1}
				};
		System.out.println("The 2D array is");
		for(int i=0;i<a.length;i++)
		{
		 for(int j=0;j<a[i].length;j++)
		 {
			 System.out.print(a[i][j]+" "); //printing the 2D array
		 }
		 System.out.println();
		}
}
}
