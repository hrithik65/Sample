package Sorting;
import java.util.Scanner;
public class linear {

	public static void main(String[] args) {
		int n, i, d, key,count=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Input number of integers");
		n = in.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the "+n+" integers");
		for(i=0; i<n; i++)
			array[i] = in.nextInt();
		System.out.println("The array is\n");
		for(i=0; i<n; i++)
			System.out.println(array[i]);
		System.out.println("Enter the key to search for: ");
		key=in.nextInt();
		System.out.println("The key is " +key);
		for(i=0; i<n; i++) {
			if (array[i]==key)
					count=i+1;
		}
		if(count>0)
			System.out.println("Found at "+count);
		else
			System.out.println("Not found");

	}

}
