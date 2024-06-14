package HashMap;

import java.util.HashMap;

public class HashMap_Demo {
public static void main(String[] args) {
	HashMap<String,String>hm = new HashMap<String,String> ();
	hm.put("one", "java");
	hm.put("two", "By");
	hm.put("three", "kiran");
	System.out.println(hm);
	System.out.println("value of second:="+hm.get("two"));
	System.out.println("Is hashmap empty:= "+hm.isEmpty());
	hm.remove("three");
	System.out.println("Size of hashmap :="+hm.size());
}
}
