package algorithms.boj.string.step;

import java.util.Scanner;

public class Q2675 {
	// 2
	// 3 ABC
	// 5 /HTP
	
	// output expectation =
	// AAABBBCCC
	// /////HHHHHTTTTTPPPPP
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		String[] inputTexts = new String[count];
		
		for(int i=0; i<count; i++) {
			inputTexts[i] = sc.nextLine();
		}
		
		String[] answer = new String[count];
		
		for(int i=0; i<inputTexts.length; i++) {
			String[] inputText = inputTexts[i].split(" ");
			
			int repeat = Integer.parseInt(inputText[0]);
			char[] words = inputText[1].toCharArray();
			char[] newWord = new char[words.length * repeat];
			
			for(int j=0; j<words.length; j++) {
				for(int k=0; k<repeat; k++) {
					System.out.print(words[j]);
				}
			}
			System.out.println("");
		}
	}
}
