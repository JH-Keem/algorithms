package algorithms.boj.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q3273 {
	//	n개의 서로 다른 양의 정수 a1, a2, ..., an으로 이루어진 수열이 있다.
	//	ai의 값은 1보다 크거나 같고, 1000000보다 작거나 같은 자연수이다.
	//	자연수 x가 주어졌을 때, ai + aj = x (1 ≤ i < j ≤ n)을 만족하는 (ai, aj)쌍의 수를 구하는 프로그램을 작성하시오.
	
	//	input = 
	//	9
	//	5 12 7 10 9 1 2 3 11
	//	13
	
	//	output =
	//	3
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] inputArr = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			inputArr[i] = Integer.parseInt(st.nextToken());
		}
		
		int x = Integer.parseInt(br.readLine());
		br.close();
		
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			if(i<n-1 && inputArr[i] <= x) {
				for(int j=i+1; j<n; j++) {
					if(inputArr[i] + inputArr[j] == x) {
						answer++;
						break;
					}
				}
			}
		}

		br.close();
		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}
}
















