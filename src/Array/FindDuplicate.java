package Array;
import java.util.Scanner;
public class FindDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6,3};
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
			if(count>1) {
				System.out.println("duplicate element is"+arr[i]);
				return;
			}
		}
     System.out.println("duplicate element not found");
	}

}
