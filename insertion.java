package Sorting;
import java.util.Scanner;
public class insertion 
{
	public static void sort( int arr[] )
	{
		int n=arr.length;
	    int i, j, temp;
        for (i=1; i<n; i++) 
        {
            j=i;
            temp=arr[i];    
	        while(j>0 && temp<arr[j-1])
	        {
                arr[j]=arr[j-1];
                j=j-1;
	        }
	        arr[j]=temp;            
	    }        
	}    
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);        
	    int m, i;
        System.out.println("Enter number of integer elements");
        m = in.nextInt();
	    int arr[] = new int[m];
	    System.out.println("\nEnter "+ m +" integer elements");
	    for (i=0; i<m; i++)
          arr[i] = in.nextInt();
	    sort(arr);
	    System.out.println("\nElements after sorting ");        
	    for (i=0; i<m; i++)
	    	System.out.print(arr[i]+" ");                                 
	}    
}

