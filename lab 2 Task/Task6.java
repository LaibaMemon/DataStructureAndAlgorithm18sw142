class Task6
{
	 static int Rowwisesort(int arr[][])
	 {
	   for(int i=0;i<arr.length;i++)             //rows of matrix
	   {
	      for(int j=0;j<arr[i].length;j++)       //column of matrix
	      {
	          for(int k=0; k<arr[i].length-j- 1;k++)     //this for comparision and swapping
	          {
	             if(arr[i][k]>arr[i][k+1])
	             {

	               int e = arr[i][k];          //swapping of elements
                   arr[i][k] = arr[i][k + 1]; 
                   arr[i][k + 1] = e;
	             }
	          }


	      }
	   }

	    for (int i=0;i<arr.length;i++)                //this loops for printing the sorted array
	    { 
          for (int j=0;j<arr[i].length;j++) 
            System.out.print(arr[i][j] + " "); 
            System.out.println(); 
        } 
        return 0;
	 }

	 public static void main(String args[]) 
    { 
        int arr[][] = { { 9, 8, 7, 1 }, { 7, 3, 0, 2 }, { 9, 5, 3, 2 },  { 6, 3, 1, 2 } }; 
        Rowwisesort(arr); 
    } 
}