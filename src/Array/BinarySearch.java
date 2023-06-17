package Array;

import java.util.Scanner;
public class BinarySearch {
//for binary search array should be sorted
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]={10,20,30,40,50};
		int s=0,e=arr.length-1;
		int mid;
		int key=20;
		while(s<=e) {
			mid=(s+e)/2;
			if(key==arr[mid]) {
				System.out.println(mid);
				return;
			}
			else if(key>arr[mid]) {
				s=mid+1;
			}
			else{
				e=mid-1;
			}
			
		}
	
	}
}
