package coding_Test;

import java.util.HashMap;

public class solution3 {
public static void main(String[] args) {
	String str = "This is a sample text. This text is used for teesting purposes";
	
	String[] words = str.split(" ");
	
	HashMap<String, Integer> h = new HashMap<>();
	
	for(int i=0; i<words.length; i++) {
		if(h.containsKey(words[i])) {
			h.put(words[i], h.get(words[i])+1);
		}else {
			h.put(words[i], 1);
		}
	}
	
	System.out.println(h);
}
}
