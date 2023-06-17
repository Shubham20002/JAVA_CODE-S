package Array;

import java.util.Scanner;

public class SelesctionSort {

	public static void main(String[] args) {
		//selection sorting means find the minimum number in unsorted array and place infront of sorted array
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter"+n+"elements of array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				int temp;
				if(arr[j]<arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}
