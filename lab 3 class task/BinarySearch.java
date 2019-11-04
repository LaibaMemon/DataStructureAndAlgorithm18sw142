class BinarySearch
{
	 static int i;
	static int Binary(int[] a,int x)
	{
		  int p=0;
		  int q=a.length-1;
		  while(p<=q)
		  {
		  	 int i=(p+q)/2;
		  	 if(a[i]==x)
		  	 {
		  	 	 return i;
		  	 }
		  	 if(a[i]<x)
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
		 int[] a={1,2,3,4,5,6};
		 System.out.println("the index of 6 is="+Binary(a,6));
	}
}