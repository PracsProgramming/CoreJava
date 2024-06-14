package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Demo2 {
public static void main(String[] args) {
	HashMap<String,String>hm = new HashMap<>();
	hm.put("java", "First");
	hm.put("second", "by");
	hm.put("third", "kiran");
	System.out.println(hm);
	Set<String> keys = hm.keySet();
	for(String key: keys) {
		System.out.println("Value of"+key+"is:"+hm.get(key));
	}
}
}
