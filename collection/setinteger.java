package collection;

import java.util.ArrayList;

public class setinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(40);
		a1.add(78);
		
		// remove using object
		Integer data =20;
		a1.remove(data);
		System.out.println(a1);
		
		// using index

		a1.remove(1);
		System.out.println(a1);
		
		a1.set(0, 100);
		System.out.println(a1);
	}

}
