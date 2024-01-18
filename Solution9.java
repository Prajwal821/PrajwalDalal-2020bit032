package coding_Test;

public class Solution9 {

	public static void main(String[] args) {
		String [] strings  = {"Flower", "Flow", "Flight"};
		
		StringBuilder str = new StringBuilder();
		
		for(int i=1; i<strings.length; i++) {
			if(strings[i-1].charAt(i-1) == strings[i].charAt(i-1)) {
				str.append(strings[i].charAt(i));
			}
		}
		
		System.out.println(str);
		
	}
	
}
