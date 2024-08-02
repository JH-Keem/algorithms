package algorithms.boj.string.step;

import java.util.Scanner;

public class Q2908 {
	// 734 893
	// output expectation : 437
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String inputText = sc.nextLine();
		String[] inputTexts = inputText.split(" ");
		
		char[] first = inputTexts[0].toCharArray();
		char[] second = inputTexts[1].toCharArray();
		
		int firstNum = 0;
		for(int i=0; i<first.length; i++) {
			firstNum += Character.getNumericValue(first[i]) * Math.pow(10, i);
		}
		int secondNum = 0;
		for(int i=0; i<second.length; i++) {
			secondNum += Character.getNumericValue(second[i]) * Math.pow(10, i);
		}
		
		if(firstNum > secondNum) {
			System.out.println(firstNum);
		}else {
			System.out.println(secondNum);
		}
	}
}
