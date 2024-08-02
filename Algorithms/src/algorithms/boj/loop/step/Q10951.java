package algorithms.boj.loop.step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10951 {
	//	input =
	//	1 1
	//	2 3
	//	3 4
	//	9 8
	//	5 2
	
	//	output =
	//	2
	//	5
	//	7
	//	17
	//	7
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		String inputCase;
		
		while((inputCase = br.readLine()) != null) {
			st = new StringTokenizer(inputCase, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());	
			bw.write(a + b + "\n");
			bw.flush();
		}
		
		br.close();
		bw.close();
	}
}
