package lab1;
import java.util.Scanner;


public class Lab1 {

	public static int[] readArray() {
		// creates an array from user input and return it
		System.out.println("Enter the size of the array: ");
		int size;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int[] array = new int[size];
		for(int i = 0; i < size; i++) {
			System.out.println("Enter the " + (i+1) + " number:");
			array[i] = sc.nextInt();
		}
		sc.close();
		return array;
	}
	public static void printArray(int[] array) {
		// prints the given array
		for(int i = 0; i< array.length; i++) {
			System.out.println(array[i]);
		}
	}
	public static int[] bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        return arr;
    }
	public static int[] mergeSort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
  
            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
  
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
        return arr;

    }
	private static void merge(int arr[], int l, int m, int r) {
		 // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
  
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
	  
	  
	public static void main(String[] args) {
		printArray(bubbleSort(readArray()));
	}

}
