package Arraylist;

import java.util.ArrayList;

public class Arraylist01 {

	public static void main(String[] args) {
		//array use continue memory so we can find any element easily
		//but while creating array we need to declare size of array this is disadvantage with array,so we use arraylist
		
		ArrayList <Integer> arrlist=new ArrayList<Integer>();
		arrlist.add(10);
		arrlist.add(20);
		arrlist.add(2,50);
		
		int size=arrlist.size();
		System.out.println("size of arraylist is: "+size);
		System.out.println(arrlist.get(1));
		for(int i=0;i<arrlist.size();i++) {
		System.out.println(i+"th element is"+arrlist.get(i));
		}
		arrlist.remove(1);
		System.out.println("\nafter removing 1st endex element");
		for(int i=0;i<arrlist.size();i++) {
			System.out.println(i+"th element is"+arrlist.get(i));
			}
		
		arrlist.set(0, 100);
		
		System.out.println("\nafter set 0th endex element as 100");
		for(int i=0;i<arrlist.size();i++) {
			System.out.println(i+"th element is"+arrlist.get(i));
			}

	}

}
