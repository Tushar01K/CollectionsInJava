package collection;

import java.util.ArrayList;

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 11, 22, 33, 22, 55, 33, 11, 55, 77, 88, 99 };
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (al.contains(a[i]) == false) {
				al.add(a[i]);
			}

		}
		System.out.println(al);
		
		for(int data :a) {
			if(al.contains(data)==false) {
				al.add(data);
			}
		}
		System.out.println(al);
	}

}
