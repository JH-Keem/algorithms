package algorithms.boj.loop.step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11022 {
	//	input = 
	//	5
	//	1 1
	//	2 3
	//	3 4
	//	9 8
	//	5 2
	
	//	output =
	//	Case #1: 1 + 1 = 2
	//	Case #2: 2 + 3 = 5
	//	Case #3: 3 + 4 = 7
	//	Case #4: 9 + 8 = 17
	//	Case #5: 5 + 2 = 7
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int round = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i=0; i<round; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y= Integer.parseInt(st.nextToken());
			bw.write("Case #" + (i+1) + ": " + x + " + " + y + " = " + (x+y) + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
