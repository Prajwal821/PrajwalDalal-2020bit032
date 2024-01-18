package coding_Test;

import java.util.Iterator;
import java.util.Scanner;

public class Sol2 {
	
	public static int[] evenNumbers(int[]arr) {
		int[] n = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] %2 == 0) {
				n[i] = arr[i];
			}else {
				i--;
			}
		}
		return n;
	}
	
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the length of array:");
	int n = scanner.nextInt();
	int arr[] = new int[n];
	
	System.out.println("Enter the Numbers: ");
	for(int i=0; i<n;i++) {
		arr[i] = scanner.nextInt();
	}
	
	
	System.out.println("Reversed Array");
	
}
}
