package algorithms.boj.loop.step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11021 {
	//	A + B
	
	//	input = 
	//	5
	//	1 1
	//	2 3
	//	3 4
	//	9 8
	//	5 2
	
	//	output = 
	//	Case #1: 2
	//	Case #2: 5
	//	Case #3: 7
	//	Case #4: 17
	//	Case #5: 7
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int round = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i=0; i<round; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write("Case #" + (i + 1) + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
