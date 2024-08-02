package algorithms.boj.array.step;

import java.util.Scanner;

public class Q10871 {
	//	정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
	//	input =
	//	10 5
	//	1 10 4 9 2 3 8 5 7 6
	
	//	output = 1 4 2 3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] caseCondition = sc.nextLine().split(" ");
		
		int arrLength = Integer.parseInt(caseCondition[0]);
		int caseNum = Integer.parseInt(caseCondition[1]);
		
		String[] inputCase = sc.nextLine().split(" ");
		int[] arr = new int[arrLength];
		
		for(int i=0; i<arrLength; i++) {
			arr[i] = Integer.parseInt(inputCase[i]);
		}
		
		int count = 0;
		for(int i=0; i<arrLength; i++) {
			if(arr[i] < caseNum){
				count++;
			}
		}
		
		int[] answer = new int[count];
		int answerCnt = 0;
		for(int i=0; i<arrLength; i++) {
			if(arr[i] < caseNum){
				answer[answerCnt] = arr[i];
				answerCnt++;
			}
		}
		
		for(int i=0; i<count; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}
