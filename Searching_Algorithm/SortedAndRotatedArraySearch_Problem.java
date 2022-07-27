package Searching_Algorithm;

public class SortedAndRotatedArraySearch_Problem {
	
	public static int binarySearch(int arr[], int startIndex, int lastIndex, int key) {
		
		while (startIndex <= lastIndex) {
			int mid = startIndex + (lastIndex - startIndex)/2;
			if(arr[mid] == key) return mid;
			
			if(arr[startIndex] < arr[mid]) {
				if(arr[startIndex] <= key && key < arr[mid]) {
					lastIndex = mid - 1;
				}
				else startIndex = mid + 1;
			}
			else {
				if(arr[mid] < key && key <= arr[lastIndex]) {
					startIndex = mid + 1;
				}
				else lastIndex = mid - 1; 
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[] = {4,5,6,7,8,9,10,1,2,3};
		int lengthArray = arr.length;
		System.out.println(binarySearch(arr, 0, lengthArray-1, 3));
	}

}
