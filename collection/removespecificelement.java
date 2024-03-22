package collection;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.Arrays;

public class removespecificelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 20, 30, 20, 40, 50, 20, 30, 57 };

// way 1st
		ArrayList<Integer> al1 = new ArrayList<>();
		for (int data : a) {
			if (data != 20) {
				al1.add(data);
			}
		}
		System.out.println(al1);

		// way 2nd
		ArrayList<Integer> al2 = new ArrayList<>();
		for (int data : a) {

			al2.add(data);
		}
		for (int i = 0; i < al2.size(); i++) {
			if (al2.get(i) == 20) {
				al2.remove(i);
				i--;
			}

		}
		System.out.println(al2);

		// 3rd way

		ArrayList<Integer> al3 = new ArrayList<>();
		for (int data : a) {
			al3.add(data);
		}
		ArrayList<Integer> al4 = new ArrayList<>();
		al4.add(20);
		al4.add(30);
		al3.removeAll(al4);

		System.out.println(al3);

	}
}
