package Arraylist;

import java.util.ArrayList;

public class Arraylsit02 {
      
	public static ArrayList<Integer> removeduplicate(int arr[]){
		 ArrayList<Integer> result=new ArrayList<Integer>();
		 result.add(0,arr[0]);
		 for(int i=1;i<arr.length;i++) {
			 if(arr[i] != arr[i-1])
			 result.add(arr[i]);
		 }
		 return result;
	}
      
      public static void main(String args[]) {
    	  int arr[]= {10,10,20,30,30,40,50,60,};
    	  ArrayList<Integer> result=removeduplicate(arr);
    	  for(int i=0;i<result.size();i++) {
    		  System.out.println(result.get(i));
    	  }
      }
      
      
}
