package Sorting;
import java.util.Scanner;
public class selection {

	public static void main(String[] args) {
		int n, i, j, temp;    
	       Scanner in = new Scanner(System.in);    
	       System.out.print("Enter Array Size : ");  
	       n = in.nextInt();  
	       int arr[]=new int[n];
	       System.out.print("Enter Array Elements : ");  
	       for(i=0; i<n; i++)    
	           arr[i] = in.nextInt();    
	       for(i=0; i<n; i++)  
	       {  
	           for(j=i+1; j<n; j++)  
	           {  
	               if(arr[i] > arr[j])  
	               {  
	                   temp = arr[i];  
	                   arr[i] = arr[j];  
	                   arr[j] = temp;  
	               }  
	           }  
	       }    
	       System.out.print("Array after Sorting is :\n");  
	       for(i=0; i<n; i++)  
	           System.out.print(arr[i]+ "  ");    

	}

}
