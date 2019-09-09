package Sorting;
public class merge {
	 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] num = { 3,6,1,7,2,8,10,4,9,5};
        int n = num.length;
        
        mergeSort(num, 0, n-1);
        System.out.println("Sorted Array is");
        for (int i=0; i<n; i++)
            System.out.print(num[i]+ " ");
    }
     public static void mergeSort(int[] elements, int low, int high) {
        if (low < high) 
        {
            int mid = (low + high)/2; 
            mergeSort(elements, low, mid); 
            mergeSort(elements, mid+1, high);
            merger(elements, low, mid, high); 
        }
    }
    public static void merger(int[] subset, int low, int mid, int high)
    {
        int n = high-low+1;
        int[] Temp = new int[n];        
        int i = low, j= mid+1;
        int k = 0;
        while (i<=mid || j<=high) 
        {
            if (i>mid)
                Temp[k++] = subset[j++];
            else if (j>high)
                Temp[k++] = subset[i++];
            else if (subset[i]<subset[j])
                Temp[k++] = subset[i++];
            else
                Temp[k++] = subset[j++];
        }
        for (j=0; j<n; j++)
            subset[low+j] = Temp[j];
    }
 
}
