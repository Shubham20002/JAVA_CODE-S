package Array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter"+n+"elments of array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter vlue which you want to search");
		int value=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==value) {
				System.out.println("your value"+value+"found at index"+i);
				return;
			}
		}
		System.out.println("value not found");
		

	}

}
