package algorithms.boj.string.step;

import java.util.Scanner;

public class Q5622 {
	// 1-> , 2->ABC, 3->DEF ... 9->WXYZ
	// 1->2초, 2->3초 ... 9-> 10초
	// UNUCIC(868242)
	// input : WA
	// output : 13 (10 + 3)
	// input UNUCIC
	// output : 36 (9 + 7 + 9 + 3 + 5 + 3)
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		char[] inputCharArr = sc.nextLine().toCharArray();
		
		int[] charToNum = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};

		int timeOut = 0;
		for(int i=0; i<inputCharArr.length; i++) {
			timeOut += charToNum[inputCharArr[i] - 'A'];
		}
		System.out.println(timeOut);
	}
}
