package algorithms.sorting;

import algorithms.service.ArrayTools;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] {5, 10, 4, 2, 7, 8, 9, 1, 3, 6};
		bubbleSort(arr);
	}

	
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		ArrayTools.printArr(arr);
		
		for(int i=0; i<n-1; i++) {
			System.out.println("라운드: " + (i+1));
			boolean swapped = false;
			
			for(int j=0; j<n-i-1; j++) {
				System.out.println("선택된 요소: " + arr[j] + ", " + arr[j+1]);
				// 선택된 두 요소를 찾아 비교 후, 정렬이 필요하면 순서를 바꾼다.
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
					System.out.println("[요소 교체]");
					ArrayTools.printArr(arr);
				}else {
					System.out.println("[교체 안함]");
					ArrayTools.printArr(arr);
				}
			}
			System.out.println("===================================================");
			
			if(!swapped) {
				System.out.println("이미 정렬되어있음.");
				break;
			}
		}
		System.out.println("[최종 배열]");
		ArrayTools.printArr(arr);
	}
}
