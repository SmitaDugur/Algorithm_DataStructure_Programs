package com.bridgelabz;

public class BubbleSort {
    

	private static void printArray(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {5,7,3,2,8};
		
		for(int i=0; i< arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		
       printArray(arr);
	}


}