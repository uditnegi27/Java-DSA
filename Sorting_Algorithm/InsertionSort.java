package Sorting_Algorithm;

public class InsertionSort {
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void insertionSort(int arr[], int arrayLength) {
		for(int i=1; i<arrayLength; i++) {
			int temp = arr[i];
			int j = i-1;
			
			while(j>=0 && temp < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = temp;
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {7,6,5,4,3,2,1,-1,9, 0, 10};
		insertionSort(arr, arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
