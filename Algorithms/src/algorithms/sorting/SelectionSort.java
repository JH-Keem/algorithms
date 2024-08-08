package algorithms.sorting;

import algorithms.service.ArrayTools;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[] {5, 10, 4, 2, 7, 8, 9, 1, 3, 6};
		selectionSort(arr);
	}

	public static void selectionSort(int[] arr) {
		int n = arr.length;
		ArrayTools.printArr(arr);
		
		for(int i=0; i<n-1; i++) {
			
			int min_index = i;
			
			// 최솟값 찾기
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			System.out.println("최소값 원소: " + arr[min_index]);
			System.out.println("자리가 바뀔 원소: " + arr[i]);
			
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
			System.out.println("========================================");
			ArrayTools.printArr(arr);
		}
	}
}
