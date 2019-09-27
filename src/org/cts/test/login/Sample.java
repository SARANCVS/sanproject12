package org.cts.test.login;


import java.util.*;

public class Sample {
	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40l);
		li.add(50f);
		li.add(true);
		li.add(10);
		li.add(7,20);
		System.out.println(li);
		int si = li.size();
		System.out.println("size is" +si);
		 Object si1 = li.get(5);
		 System.out.println("value of index"+si1);
		// Object si2 = li.get(9);
		// System.out.println("value at 9th index"+si2);
		 li.add(1, 50);
		 System.out.println(li);
		 li.remove(0);
		 System.out.println(li);
		 li.set(5, 100);
		 System.out.println(li);
		

	}
}
