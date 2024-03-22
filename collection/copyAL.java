package collection;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class copyAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
	ArrayList<Integer> al2= new ArrayList<>(al);
	System.out.println(al2);
	
//	al3.addAll(al);
//	System.out.println(al3);
	
	ArrayList<Integer> al3 = new ArrayList<>();
	al3.add(1);
	al3.add(2);
	al3.add(3);
	Collections.copy(al3,al);
	System.out.println(al3);
	

	}

}
