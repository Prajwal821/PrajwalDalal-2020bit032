package coding_Test;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("enter the string");
	String string = scanner.nextLine();
	
	StringBuilder stringBuilder = new StringBuilder();
	
	for(int i=string.length()-1; i>=0; i--) {
		stringBuilder.append(string.charAt(i));
	}
	
	System.out.println(stringBuilder);
}
}
