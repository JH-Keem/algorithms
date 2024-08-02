package algorithms.boj.array;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] arr = {5, 3, 2, 1, 4, 6, 7, 8, 0, 9};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if((i+1) < arr.length && arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void insertAndReversing() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println(arr.length);
		
	}
}
