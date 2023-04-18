package Q14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> synchronizedList = Collections.synchronizedList(new ArrayList<String>());
		
		List<String> list = new ArrayList<String>();
		Object lock = new Object();

		// synchronize access to the list
		synchronized(lock) {
		    list.add("item");
		    String item = list.get(0);
		    // ... other synchronized operations
		}

	}

}
