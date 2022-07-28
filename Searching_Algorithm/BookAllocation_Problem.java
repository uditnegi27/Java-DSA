package Searching_Algorithm;

public class BookAllocation_Problem {
	
	public static int max(int arr[], int arrayLength) {
		int max = 0;
		for(int i=0; i<arrayLength; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int sum(int arr[], int arrayLength) {
		int sum = 0;
		for(int i=0; i<arrayLength; i++) {
			sum += arr[i];
		}
		return sum;
	}
		
	
	public static boolean valid(int arr[], int mid, int arrayLength, int studentCount) {
		int student = 1;
		int sum = 0;
		for(int i=0; i<arrayLength; i++) {
			if(sum + arr[i] > mid ) {
				student++;
				sum = arr[i];
			}
			else {
				sum += arr[i];
			}
		}
		return student<=studentCount;
	}
	
	public static int bookAllocation(int arr[], int arrayLength, int studentCount) {
		
		int startEle = max(arr, arrayLength);
		int lastEle = sum(arr, arrayLength);
		int ans = 0;
		
		while(startEle <= lastEle) {
			int mid  = startEle + (lastEle - startEle)/2;
			
			if(valid(arr, mid, arrayLength, studentCount)) {
				ans = mid;
				lastEle = mid - 1;
			}
			else {
				startEle = mid + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		
		int arr[] = {10, 10, 20, 30};
		int arrayLength = arr.length;
		int studentCount = 2;
//		System.out.println(sum(arr, arrayLength));
//		System.out.println(max(arr, arrayLength));
		System.out.println(bookAllocation(arr, arrayLength, studentCount));
		
	}

}
