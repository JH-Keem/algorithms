package algorithms.boj.string.step;

import java.util.Scanner;

public class Q9086 {
	
	public static void main(String[] args) throws Exception{
		/*
			3
			ACDKJFOWIEGHE
			O
			AB
			(output expectation = AE\nOO\nAB
		 */
		Scanner sc = new Scanner(System.in);
		int inputCount = Integer.parseInt(sc.nextLine());
		String[] inputTextArr = new String[inputCount];
		
		for(int i=0; i<inputCount; i++) {
			inputTextArr[i] = sc.nextLine();
		}
		
		for(int i=0; i<inputCount; i++) {
			System.out.println(inputTextArr[i].charAt(0) + "" + inputTextArr[i].charAt(inputTextArr[i].length()-1));
		}
	}
	
	
}
