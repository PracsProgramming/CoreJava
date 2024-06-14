package HashMap;

import java.util.HashMap;

public class HashMap_Demo1 {
public static void main(String[] args) {
	HashMap<String,String>hm = new HashMap<>();
	hm.put("First", "Java");
	hm.put("second", "By");
	hm.put("third", "kiran");
	
	System.out.println(hm);
	
	HashMap<String,String> hm1 = new HashMap<String,String>();
	hm1.put("c1", "java");
	hm.put("c2", "selenium");
	hm.putAll(hm1);
	
	System.out.println(hm);
}
}
