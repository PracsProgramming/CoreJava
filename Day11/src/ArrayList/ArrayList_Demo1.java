package ArrayList;

import java.util.ArrayList;

public class ArrayList_Demo1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("PERL");
		al.add("PHP");
		System.out.println(al);
		
		System.out.println("Elements at index 1:"+al.get(1));
		System.out.println("Does list contains JAVA"+al.contains("JAVA"));
		System.out.println(al);
		System.out.println("Is arraylist empty?"+al.isEmpty());
		System.out.println("Index of PERL is "+al.indexOf("PERL"));
		System.out.println("Size of arraylist is "+al.size());
	}
	
}
