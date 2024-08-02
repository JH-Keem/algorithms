package algorithms.boj.array.step;

import java.util.Scanner;

public class Q10818 {
	//	N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
	//	input = 
	//	5
	//	20 10 35 30 7
	//	output = 7 35
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		String[] inputArr = sc.nextLine().split(" ");
		
		int[] arr = new int[count];
		for(int i=0; i<count; i++) {
			arr[i] = Integer.parseInt(inputArr[i]);
		}

		int min = arr[0];
		int max = arr[0];

		for(int i=0; i<count; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(min + " " + max);
	}
}
