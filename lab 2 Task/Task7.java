public class Task7
{  
    public static int removeDuplicate(int arr[], int element)
    {  
        if (element==0 || element==1)
        {  
            return element;  
        }  
        int[] n = new int[element];  
        int j = 0;  
        for (int i=0; i<element-1; i++)
        {  
            if (arr[i] != arr[i+1]){  
                n[j++] = arr[i];  
            }  
         }  
        n[j++] = arr[element-1];     
        // Changing original array  
        for (int i=0; i<j; i++)
        {  
            arr[i] = n[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args)
     {  
        int arr[] = { [20,20,30,40,50,50,50};  
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
}  