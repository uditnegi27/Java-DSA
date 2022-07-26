package Sorting_Algorithm;

public class MergeSort {
	
	public static void merge(int arr[], int startIndex, int mid, int lastIndex) {
		int i = startIndex;
		int j = mid + 1;
		int k = 0;
		int b[] = new int[lastIndex - startIndex +1];
		
		
		while(i <= mid && j<= lastIndex) {
			if(arr[i] <= arr[j]) {
				b[k] = arr[i];
				i++;
				k++;
			}
			else {
				b[k] = arr[j];
				j++;
				k++;
			}
		}
			
		while(i <= mid) {
			b[k] = arr[i];
			i++; k++;
		}
		
		while(j <= lastIndex) {
			b[k] = arr[j];
			j++; k++;
		}
		
		for(int p = 0, q=startIndex; p<b.length; p++, q++) {
			arr[q] = b[p];
		}
	}
	
	public static void mergeSort(int arr[], int startIndex, int lastIndex) {
		if(startIndex < lastIndex) {
			int mid = startIndex + (lastIndex - startIndex)/2;
			mergeSort(arr, startIndex, mid);
			mergeSort(arr, mid+1, lastIndex);
			merge(arr, startIndex, mid, lastIndex);
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {7, 6, 5, 4, 3, 2, 1, 9, 0, 10};
		mergeSort(arr, 0, arr.length-1);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
