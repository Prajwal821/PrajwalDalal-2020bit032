package coding_Test;

public class Solution6 {
	
	public static int findMid(int[]arr, int high, int low) {
		
		int mid = (high+low)/2;
		
	}
	
	public static int BinarySearch(int[]arr, int high, int low, int target) {
		int n = arr.length;
		
		int mid = findMid(arr, high, low);
		
		if(mid==target) {
			return mid;
		}
				
	}
	
	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5,6,7,8,9};
		
		int target = 6;
		int n = numbers.length;
		int low = 0;
		int mid = n/2;
		int high = n-1;
		
		BinarySearch(numbers, low, mid);
		BinarySearch(numbers, mid+1, high);

		
		
 	}
}
