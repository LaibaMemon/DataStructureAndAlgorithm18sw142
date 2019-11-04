 public class MyLinearSearch {
 
    public static int linerSearch(int[] arr, int value)
    {
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == value)
            {
                return i;
            }
        }
        return -1;
    }
     
    public static void main(String args[]){
         
        int[] arr1= {23,45,21,55,234,1,34,90};
        int value = 34;
        System.out.println("Value found at index: "+linerSearch(arr1, value));
        
    }
}