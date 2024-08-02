package algorithms.boj.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10988 {
	//	알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
	//	팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다. 
	//	level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] inputWord = br.readLine().toCharArray();
		boolean[] check = new boolean[inputWord.length];
		
		for(int i=0; i<inputWord.length; i++) {
			if(inputWord[i] == inputWord[inputWord.length-1-i]) {
				check[i] = true;
			}
		}
		
		boolean answer = true;
		for(int i=0; i<check.length; i++) {
			if(!check[i]) {
				answer = false;
			}
		}
		
		if(answer) {
			bw.write("1");
		}else {
			bw.write("0");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
