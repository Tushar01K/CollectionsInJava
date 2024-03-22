
package collection;

import java.util.ArrayList;

public class getelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(47);
		list.add(90);
		// to print the 2nd index element
		System.out.println(list.get(2));
		// to get the 2nd element of arraylist
		int num = list.get(2);
		System.out.println(num);
		
		//to add element at first position
		list.add(0,89);
		System.out.println(list);
		
		

	}

}
