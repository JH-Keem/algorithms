package algorithms.boj.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2444 {
	//    *
	//   ***
	//  *****
	// *******
	//*********
	// *******
	//  *****
	//   ***
	//    *
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int offset = 0;
		for(int i=0; i<2*N-1; i++) {
			if(i<N) {
				for(int k=N-1-i; k>0 ; k--) {
					bw.write(" ");
				}
				for(int k=0; k<2*i+1; k++) {
					bw.write("*");
				}
				bw.write("\n");
			}else {
				for(int k=0; k<i-N+1; k++) {
					bw.write(" ");
				}
				for(int k=0; k<2*(2*N-1-i)-1 ; k++) {
					bw.write("*");
				}				
				bw.write("\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
}
