package algorithms.boj.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1316 {
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int round = Integer.parseInt(br.readLine());
		int answer = 0;
		
		for(int i=0; i<round; i++) {
			char[] inputArr = (br.readLine()).toCharArray();
			boolean[] count = new boolean[26];
			boolean groupWord = true;
			
			for(int j=0; j<inputArr.length; j++) {
				char prevLetter = inputArr[j];
				count[prevLetter - 'a'] = true;
				
				if((j+1)<inputArr.length && inputArr[j+1] != prevLetter) {
					prevLetter = inputArr[j+1];
					if(count[prevLetter - 'a']) {
						groupWord = false;
						break;
					}
				}
			}
			if(groupWord) {
				answer++;
			}
		}
		
		System.out.println(answer);
		br.close();
	}
}
