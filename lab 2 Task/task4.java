class task4
{
	 public static float apply(float[] a)   // this method will return the apply
	 {
	    float ave=0.0f;
	    for(int i=0;i<a.length;i++)
	    {
	        ave=ave+a[i];
	    }
	    System.out.println(ave);
    	return (ave/a.length);
	 }

	 public static void main(String args[])
	 {
	    float[] l={1.1f,2.2f,3.3f,4.7f,7.9f};       //initializing and declaring the array
	    System.out.println("Print the Average="+apply(l));   //printing the average in an array
	 }
}