package coding_Test;

public class Solution10 {
	
	public static int factorial(int num) {
		int facto = 1;
		if(num == 0) {
			return facto;
		}
		
		facto = num*facto;
		num--;
		return  factorial(num);
		
	}
	
	public static void main(String[] args) {
		int num = 5; 
		
		System.out.println(factorial(num));
	}
}
