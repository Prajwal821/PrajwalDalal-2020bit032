package coding_Test;

import java.util.HashSet;

public class Solution7 {
	public static void main(String[] args) {
		String str = "abcabcbb";
		
		StringBuilder string = new StringBuilder();
		
		HashSet<Character> h = new HashSet<>();
		
		for(int i=0; i<str.length(); i++) {
			
			if(h.contains(str.charAt(i))) {
				string.append(str.charAt(i));
			}
			else {
				h.add(str.charAt(i));
			}
			
		}
		System.out.println(string);
	}
}
