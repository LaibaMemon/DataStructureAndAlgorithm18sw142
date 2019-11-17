class LinearSearchInString
{
	public static int Linear(String[] arr,String target)
	{
	   for(int i=0;i<arr.length;i++)
	   {
	      if(arr[i]==target)
	      {
	         return i;
	      }
	   }
	   return-1;
	}

	public static void main(String args[])
	{
	    String[] arr={"Canada","Dubai","USA","Germany"};
	    String target="Dubai";
	    System.out.println("Print the String="+target);
	    System.out.println("index is"+Linear(arr,target));
	}
}