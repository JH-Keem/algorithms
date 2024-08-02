package algorithms.boj.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2941 {
	//	č	c=
	//	ć	c-
	//	dž	dz=
	//	đ	d-
	//	lj	lj
	//	nj	nj
	//	š	s=
	//	ž	z=
	
	//	input = ljes=njak
	//	output =  6
	
	//	input = ddz=z=
	//	output =  3
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputCase = br.readLine();
		int count = 0;
		
		for(int i=0; i<inputCase.length(); i++) {
			char ch = inputCase.charAt(i);
			
			if(i<inputCase.length()-1) {
	            if(ch=='c') {
	                if(inputCase.charAt(i+1)=='=' || inputCase.charAt(i+1)=='-') {
	                    i++;
	                }
	            }else if(ch=='d') {
	                if(inputCase.charAt(i+1)=='-') {
	                    i++;
	                }else if(i<inputCase.length()-2 && inputCase.charAt(i+1)=='z' && inputCase.charAt(i+2)=='=') {
	                    i+=2;
	                }
	            }else if((ch=='l' || ch=='n') && inputCase.charAt(i+1)=='j') {
	                i++;
	            }else if((ch=='s' || ch=='z') && inputCase.charAt(i+1)=='=') {
	                i++;
	            }
	        }
			count++;
		}
		br.close();
		System.out.println(count);
	}
}
