class BinarySearchInChar
{
	 static int i;
	public static int Binary(char[] arr,int target)
	{
		  int p=0;
		  int q=arr.length-1;
		  while(p<=q)
		  {
		  	 int i=(p+q)/2;
		  	 if(arr[i]==target)
		  	 {
		  	 	 return i;
		  	 }
		  	 if(arr[i]<target)
		  	 {
		  	 	 p=i+1;
		  	 }
		  	 else
		  	 {
		  	 	q=i-1;
		  	 }
		  }
		  return-1;
	}


	public static void main(String args[])
	{
		 char[] arr={'a','e','i','o','u'};
		 char target='u';
		 System.out.println("print the character="+target);
	     System.out.println("the index is="+Binary(arr,target));
	}
}