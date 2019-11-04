import java.util.Arrays;
public class Task3{ 
public static void printArray(double arg[])   //properties that return the size of array
{
    for(int i=0;i<arg.length;i++)
    {
        System.out.println(arg[i]);
    }
}
	public static void main(String arg[]){
	double[] arr = {1.1,2.2,3.3,4.4,5.5,6.6};
    double[] unsort = {1.1,6.6,4.4,5.5,3.3,2.2};
    double[] arr2 = {1.1,2.2,3.3,4.4,5.5,6.6};
    double[] dest=new double[10];
	//sort array
	Arrays.sort(arr);
	//print length
	System.out.print("Length of an array");
	System.out.println(arr.length);
	System.out.println("Binary Search of number 3");     // if there is sorted array then it will be search otherwise not
	//apply binary search and print results
	System.out.println(Arrays.binarySearch(arr, 3));
	//create a copy of array truncated or padded with zero based on size 
	//of new array
    double[] arrCopy=Arrays.copyOf(arr,10);   
    System.out.println("copy of array printed");
    printArray(arrCopy);

    //copy of range
    System.out.println("Copy Into Range");
    double[] copyIntoRange=Arrays.copyOfRange(arr,1,4);         
    //printing array
    printArray(copyIntoRange);
    //equals method
    System.out.println("Equals Method in arrays");
    System.out.println(Arrays.equals(arr,arr2));
    //fill method
    Arrays.fill(arr2,2);
    //printing filled array
    System.out.println("filled array with 2");
	printArray(arr2);
	//filling in specific range
	Arrays.fill(arr2,2,4,0);
	//print array
	System.out.println("filling in specific range");
	printArray(arr2);	
	//sorting in specific range
	Arrays.sort(unsort,2,5);
	//print sorted array from 2 to 4 index
	System.out.println("Print Sorted Array");
    //print sorted array
	printArray(unsort);
	//print array converted to string
	System.out.println(Arrays.toString(unsort));
	}
}