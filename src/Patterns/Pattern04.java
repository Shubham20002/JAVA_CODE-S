package Patterns;
import java.util.Scanner;
public class Pattern04 {

	public static void main(String args[]) {
//		Pattern for N = 4
//				A
//				BC
//				CDE
//				DEFG
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int k=i;
			for(int j=0;j<=i;j++) {
				System.out.print((char)(65+k));
				k++;
			}
			System.out.println();
		}
		
	}
}
