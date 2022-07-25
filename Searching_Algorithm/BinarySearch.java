package Searching_Algorithm;

public class BinarySearch {
	
	public static boolean binarySearch(int arr[], int startIndex, int lastIndex, int number) {
		
		while(startIndex<=lastIndex) {
			int mid = (startIndex + lastIndex)/2;
			if(arr[mid] == number) {
				return true;
			}
			else if(number < arr[mid]) {
				lastIndex = mid - 1;
			}
			else if(number > arr[mid]) {
				startIndex = mid + 1;
			}
		}
		return false;
	}
	
	public static boolean binarySearch_recursion(int arr[], int startIndex, int lastIndex, int number) {
		if(startIndex<=lastIndex) {
			int mid = (startIndex + lastIndex)/2;
			
			if(arr[mid] == number) {
				return true;
			}
			
			if(number < arr[mid]) {
				return binarySearch_recursion(arr, startIndex, mid-1, number);
			}
			
			else {
				return binarySearch_recursion(arr, mid+1, lastIndex, number);
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
	    int search  = 1;
	    int search_2 = 10;
	    if(binarySearch_recursion(arr, 0, arr.length-1, search)){
	        System.out.println("Element "+search+" is present in the array");
	    }
	    else{
	    	System.out.println("Element "+search+" is not present in the array");
	    }
	    
	    if(binarySearch(arr, 0, arr.length-1, search_2)){
	        System.out.println("Element "+search_2+" is present in the array");
	    }
	    else{
	    	System.out.println("Element "+search_2+" is not present in the array");
	    }

	}

}
