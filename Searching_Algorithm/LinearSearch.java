package Searching_Algorithm;

public class LinearSearch {
	
	public static boolean linearSearch(int arr[], int number) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == number) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
	    int search  = 5;
	    if(linearSearch(arr, search)){
	        System.out.println("Element "+search+" is present in the array");
	    }
	    else{
	    	System.out.println("Element "+search+" is not present in the array");
	    }

	}

}
