package algorithms.boj.string.step;

import java.util.Scanner;

public class Q10809 {
	// "baekjoon"
	// output expectation = "1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1"
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		char[] inputText = sc.nextLine().toCharArray();
		int[] countArr = new int[26];
		
		for(int i=0; i<26; i++) {
			countArr[i] = -1;
		}

		for(int i=0; i<inputText.length; i++) {
			if((countArr[(int)inputText[i] - 97]) == -1){
				countArr[(int)inputText[i] - 97] = i;
			}
		}
		
		for(int i=0; i<26; i++) {
			System.out.print(countArr[i] + " ");
		}
	}
}
