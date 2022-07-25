package Sorting_Algorithm;

public class SelectionSort {
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void selectionSort(int arr[], int arrayLength) {
		for(int i=0; i<arrayLength-1; i++) {
			int min = i;
			for(int j=i+1; j<arrayLength; j++) {
				if(arr[j] < arr[min]) min = j;
			}
			if(min != i) {
				swap(arr, i, min);
			}
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {7,6,5,4,3,2,1,-1,9, 0, 10};
		selectionSort(arr, arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
