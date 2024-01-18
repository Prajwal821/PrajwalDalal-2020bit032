package coding_Test;

import java.util.HashMap;

public class Solution5 {
	public static void main(String[] args) {
		int numbers[] = {2,4,5,3,1,6,8,9,7};
		
		int target_sum = 10;
		
		
		
		for(int i=0; i<numbers.length;i++) {
			for(int j=i+1; j<numbers.length; j++) {
				if(numbers[i] + numbers[j] == target_sum) {
					System.out.println("(" + numbers[i]+"," + numbers[j] + ")");
				}
			}
		}
		
		
	}
}
