package Patterns;
import java.util.Scanner;
public class Pattern07 {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   	   System.out.println("enter no of rows");
	   	int n=sc.nextInt();

	   for(int i=n;i>=1;i--) {
		   for(int j=0;j<i;j++) {
			   System.out.print(i);
		   }
		   for(int k=0;k<n-i;k++) {
			   System.out.print("");
		   }
		   System.out.println();
	   }
	   
   }
}
