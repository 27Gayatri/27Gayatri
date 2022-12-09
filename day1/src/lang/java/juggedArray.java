package lang.java;

public class juggedArray {

		 public static void main(String[] args)
	{
		        //declaring a 2D array with odd columns
		        int arr[][] = new int[3][];
		        arr[0] = new int[3];
		        arr[1] = new int[4];
		        arr[2] = new int[2];
		        //initializing a juggled array
		        int count = 0;
		        for (int i=0; i<arr.length; i++)
		            for(int j=0; j<arr[i].length; j++)
		                arr[i][j] = count++;
		 
		        //printing the data of a jugged array 
		        for (int i=0; i<arr.length; i++){
		            for (int j=0; j<arr[i].length; j++){
		                System.out.print(arr[i][j]+" ");
		            }
		            System.out.println();//new line
		        }
		  

	}

}
