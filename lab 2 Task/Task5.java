class Task5
{
	 public static int Array(int[] arr)
	 {
	     int max=0;
	     int secondlargest=0;
	     int index=0;

	     for(int i=0;i<arr.length;i++)
	     {
	        if(max<arr[i])
	        maz=arr[i];
	     }
	     for(int j=0;j<arr.length;j++)
	     {
	         if(secondlargest<arr[j] && arr[j]!=max)
	         {
	            secondlargest=arr[j];
	            index=j+1;
	         }
	     }
	     return index;
	 }

	 public static void main(String[] args) 
	 {
		int[] a={1,2,3,5,8,0,3,6};
		System.out.println("the index of second largest element in array"+Array(a));
}