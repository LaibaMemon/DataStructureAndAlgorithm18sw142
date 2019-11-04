import java.util.Arrays;

class Task2
{

  public static void main(String args[])
{
	//Here we create the different Integer Arrays
	 int[] arr1={1,2,3,4};
	 int[] arr2={1,2,3,4};
	 int[] arr3={1,2,4,3};

	 System.out.println("arr1 is equals to arr2");
	 System.out.println(Arrays.equals(arr1,arr2));

	 System.out.println("arr1 is not equals to arr3");
	 System.out.println(Arrays.equals(arr1,arr3));

}

}



