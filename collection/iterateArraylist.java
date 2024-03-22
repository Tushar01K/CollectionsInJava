package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class iterateArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(45);
		list.add(89);
		list.add(50);

		// iterator
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()==true) {
			System.out.println(it.next());
		}
		
		
		// enhance loop/advance loop
		for(int data : list) {
			System.out.println(data);
		}
		
		
		
		// for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		//while loop
		int index=0;
		while(index<list.size()) {
			System.out.println(list.get(index));
			index++;
		}
	}

}
