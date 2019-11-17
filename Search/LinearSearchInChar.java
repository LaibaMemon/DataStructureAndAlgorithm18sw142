class LinearSearchInChar
{
	public static int Linear(char[] arr,char target)
	{
	   for(int i=0;i<arr.length;i++)
	   {
	       if(arr[i]==target)          //search the index no in the array 
	       {
	          return i;
	       }
	   }
	   return-1;
	}


	public static void main(String args[])
	{
	   char[] arr={'a','e','i','y','o'};       //character datatype array
	   char target='i';
	   System.out.println("print the Character="+target);
        System.out.println("index is="+Linear(arr,target));
	}

}