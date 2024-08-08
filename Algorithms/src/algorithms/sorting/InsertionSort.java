package algorithms.sorting;

import algorithms.service.ArrayTools;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[] {5, 10, 4, 2, 7, 8, 9, 1, 3, 6};
		insertionSort(arr);
	}

	public static void insertionSort(int[] arr) {
		int n = arr.length;
		
		for(int i=1; i<n; i++) {
			System.out.println("타겟 원소: " + arr[i]);
			int target = arr[i];
			
			int j = i - 1;
			System.out.println("앞 원소: " + arr[j]);
			while(j >= 0 && target < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			
			arr[j + 1] = target;
			ArrayTools.printArr(arr);
		}
		
		System.out.println("=========================================");
		
	}
}
