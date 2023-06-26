package Patterns;
import java.util.Scanner;
public class Pattern08 {
public static void main(String args[]) {
	
	//start pattern
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no of rows");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		for(int j=0;j<n-i-1;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++) {
			System.out.print("*");
		}
		for(int m=0;m<i;m++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	
}
}
