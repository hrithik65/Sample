package Sorting;
import java.util.Scanner;
public class missingnum {

	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter end integer:");
		n=in.nextInt();
		sum(n);
	}
	public static void sum(int a) {
		int p=a,q,sum=0,nsum=0;
		Scanner in=new Scanner(System.in);
		sum=p*((p+1)/2);
		System.out.println("Sum is "+sum);
		int arr[]= new int[p];
		System.out.println("Enter the array of numbers");
		for(q=0; q<p; q++)
		{
			arr[q]= in.nextInt();
			nsum+=arr[q];
		}
		System.out.println("The array is");
		for(q=0;q<p;q++)
			System.out.println(arr[q]);
		System.out.println("Other sum is "+nsum);
		System.out.println("Missing integer is"+(sum-nsum));
	}

}
