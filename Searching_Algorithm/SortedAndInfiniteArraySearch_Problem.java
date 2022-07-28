package Searching_Algorithm;

public class SortedAndInfiniteArraySearch_Problem {
	
	public static boolean binarySeach(int arr[], int si, int li, int sNumber) {
		
		while(si <= li) {
			int mid = si + (li - si)/2;
			if(arr[mid] == sNumber) return true;
			if(arr[mid] > sNumber) return binarySeach(arr, si, mid - 1, sNumber);
			else return binarySeach(arr, mid + 1, li, sNumber);
		}
		
		return false;
	}
	
	public static boolean binarySearchInfiniteArray(int arr[], int key) {
		
		int startIndex = 0;
		int lastIndex = 2;
		while(key >= arr[lastIndex]) {
				startIndex = lastIndex + 1;
				lastIndex = lastIndex * 2;
			}
		
		return binarySeach(arr, startIndex, lastIndex, key);
		
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34};
		
		System.out.println(binarySearchInfiniteArray(arr, 10));

	}

}
