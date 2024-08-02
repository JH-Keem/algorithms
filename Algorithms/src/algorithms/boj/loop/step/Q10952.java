package algorithms.boj.loop.step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10952 {
	//	input = 
	//	1 1
	//	2 3
	//	3 4
	//	9 8
	//	5 2
	//	0 0
	
	//	output =
	//	2
	//	5
	//	7
	//	17
	//	7
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st ;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a!=0 && b!=0) {
				bw.write(a + b + "\n");
				bw.flush();
				continue;
			}
			break;
		}
		br.close();
		bw.close();
		
	}
}
