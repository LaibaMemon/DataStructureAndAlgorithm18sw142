import java.util.Random;

class Task1
{
	 public static void main(String args[])
	 {

	     Random r=new Random();  //here we create the object of random class
	     int[] arr=new int[100]; //here we declare and initialize the array
	     for(int i=0;i<arr.length;i++)
	     {
	        arr[i]=r.nextInt();   //storig the random integers in an array
            System.out.println(arr[i]);    //printing the each array element
	     }
	 }
}