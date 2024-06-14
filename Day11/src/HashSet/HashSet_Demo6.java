package HashSet;

import java.util.HashSet;

public class HashSet_Demo6 {
public static void main(String[] args) {
	HashSet<String> hs = new HashSet <>();
	hs.add("java");
	hs.add("by");
	hs.add("Kiran");
	hs.add("karvenagar");
	hs.add("pune");
	System.out.println("First Hashset:="+hs);
	HashSet<String> subset = new HashSet<>();
	subset.add("java");
	subset.add("J2EE");
	subset.add("Selenium");
	System.out.println("Second Hashset:="+subset);
	hs.retainAll(subset);
	System.out.println(""+"common hashset content from both");
	System.out.println(hs);
}
}
