
package collection;

import java.util.*;

import java.text.CollationElementIterator;
import java.util.ArrayList;

public class sortshuffelcontains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(29);
		al.add(30);
		al.add(83);
		al.add(78);
		boolean ans = al.contains(30);
		System.out.println(ans);
		
	// change the order of element
		Collections.shuffle(al);
		System.out.println(al);
		
		//sort
		
	
	}

}
