package algorithms.boj.loop.step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2438 {
	// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int round = Integer.parseInt(br.readLine());
		
		for(int i=0; i<round; i++) {
			for(int j=0; j<i+1; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		br.close();
		bw.flush();
		bw.close();
		
	}
}
