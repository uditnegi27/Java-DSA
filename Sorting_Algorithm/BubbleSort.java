package Sorting_Algorithm;

public class BubbleSort {
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void bubbleSort(int arr[], int lengthArray) {
		
		boolean flag = false;
		
		for(int i=0; i<lengthArray; i++) {
			
			for(int j=0; j<lengthArray-i-1; j++) {
				if(arr[j+1] < arr[j]) {
					
					flag = true;
					swap(arr, j, j+1);
					
				}
			}
			if(!flag) {
				break;
			}
		}
		
		
	}

	public static void main(String[] args) {
	
		int arr[] = {7,6,5,4,3,2,1,-1,9, 0, 10};
		bubbleSort(arr, arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
