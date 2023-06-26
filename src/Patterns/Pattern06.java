package Patterns;

import java.util.Scanner;

public class Pattern06 {

	public static void main(String[] args) {
		
    //Mirror Image Number Pattern
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter no of rows you want");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++) {
				System.out.print(k+1);
			}
			System.out.println();
		}
	}

}
