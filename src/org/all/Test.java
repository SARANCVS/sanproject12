package org.all;

public class Test {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=0;
		a[1]=50;
	    a[2]=90;
	    a[3]=100;
	    a[4]=94;
	    a[1]=90;
	    System.out.println(a[1]);
	  //find the length of array
				int le=a.length;
				System.out.println("lenth is "+le);
				//to print all based on index
				System.out.println("iteration based on index");
				for(int i=0;i<a.length;i++) {
					System.out.println(a[i]);
				}
				//print based on values
				System.out.println("iteration based  on value");
				
				for(int x:a){
					System.out.println(x);
				}
				
	}

}
