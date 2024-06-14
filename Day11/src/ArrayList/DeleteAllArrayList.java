package ArrayList;

import java.util.ArrayList;

public class DeleteAllArrayList {
public static void main(String[] args) {
	ArrayList<String> arrl= new ArrayList<>();
	arrl.add("Zero");
	arrl.add("First");
	arrl.add("Second");
	arrl.add("Third");
	arrl.add("Random");
	System.out.println("Actual ArrayList:"+arrl);
	arrl.clear();
	System.out.println("\n After clear ArrayList:"+arrl);
}
}
