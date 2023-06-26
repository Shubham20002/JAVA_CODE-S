package Patterns;
import java.util.Scanner;
public class Pattern09 {
  public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter no of rows you want");
	  int n=sc.nextInt();
	  for(int i=1;i<=n;i++) {
		  for(int j=1;j<=n-i;j++) {
			  System.out.print(" ");
		  }
		  int m=i;
		  for(int j=1;j<i+1;j++) {
			  System.out.print(m);
			  m++;
		  }
		  m-=2;
		  for(int k=1;k<i;k++) {
			  System.out.print(m);
			  m--;
		  }
		  System.out.println();
	  }
  }

}
