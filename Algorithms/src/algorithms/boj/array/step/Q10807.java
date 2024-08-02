package algorithms.boj.array.step;

import java.util.Scanner;

public class Q10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = Integer.parseInt(sc.nextLine());
		
		int[] testArr = new int[testCase];
		String[] inputArr = sc.nextLine().split(" ");
		for(int i=0; i<testCase; i++) {
			testArr[i] = Integer.parseInt(inputArr[i]);
		}
		
		int inputCase = Integer.parseInt(sc.nextLine());
		
		int count = 0;
		for(int i=0; i<testCase; i++) {
			if(testArr[i] == inputCase) count++;
		}
		
		System.out.println(count);
	}

}
