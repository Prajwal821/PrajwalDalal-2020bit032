package coding_Test;

import java.util.Scanner;

  

public class Solution8 {
	
	public static boolean isPalindrome(String string) {
		int n = string.length();
		for(int i=0; i<n; i++) {
			if(string.charAt(i) != string.charAt(n-i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String string = scanner.nextLine().toLowerCase();
		
		System.out.println(isPalindrome(string));
	}
}
