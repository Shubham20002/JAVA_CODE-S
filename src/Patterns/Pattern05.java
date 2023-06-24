package Patterns;
import java.util.Scanner;
public class Pattern05 {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
//	 Pattern for N = 5
//			 E
//			 DE
//			 CDE
//			 BCDE
//			 ABCDE
	 
	 int n=sc.nextInt();
	 for(int i=n;i>=1;i--) {
		 int k=i;
		 for(int j=5;j>=i;j--) {
			 System.out.print((char)(64+k));
			 k++;
		 }
		 System.out.println();
	 }
 }
}
