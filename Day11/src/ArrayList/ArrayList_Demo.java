package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Demo {

	public static void main(String[] args) {
		ArrayList<String> arrl = new ArrayList<>();
		arrl.add("Pune");
		arrl.add("Mumbai");
		arrl.add("Aurangabad");
		arrl.add("Nagpur");
		Iterator<String>itr=arrl.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
