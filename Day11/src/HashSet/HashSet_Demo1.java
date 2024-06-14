package HashSet;

import java.util.HashSet;

public class HashSet_Demo1 {
public static void main(String[] args) {
	HashSet<String> hs = new HashSet<>();
	hs.add("java");
	hs.add("by");
	hs.add("kiran");
	System.out.println(hs);
	System.out.println("HashSet is empty or not="+hs.isEmpty());
	hs.remove("Karvenagar");
	System.out.println(hs);
	System.out.println("Size of HashSet ="+hs.size());
	System.out.println("Does Hashset contains first element ="+hs.contains("java"));
}
}
