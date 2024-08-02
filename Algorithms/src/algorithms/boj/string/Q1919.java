package algorithms.boj.string;

import java.util.Scanner;

public class Q1919 {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		
		String word1 = scan.nextLine();
		String word2 = scan.nextLine();
		
		char[] word1Arr = word1.toCharArray();
		char[] word2Arr = word2.toCharArray();
		
		int[] count1 = new int[26];
		int[] count2 = new int[26];
		
		for(int i=0; i<word1.length(); i++) {
			count1[word1.toCharArray()[i] - 'a'] ++;
		}
		for(int i=0; i<word2.length(); i++) {
			count2[word2.toCharArray()[i] - 'a'] ++;
		}

		int deleteNum = 0;
		
		for(int i=0; i<26; i++) {
			if(count1[i] != count2[i]) {
				deleteNum += Math.abs(count1[i] - count2[i]);
			}
		}
		
		System.out.println(deleteNum);
	}
}
