package algorithms.boj.loop.step;

import java.util.Scanner;

public class Q25314 {

	//	input = 4
	//	output = long int
	
	//	input = 20
	//	output = long long long long long int
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int inputCase = Integer.parseInt(sc.nextLine());
		int round = inputCase/4;
		
		String answer = "";
		for(int i=0; i<round; i++) {
			answer += "long ";
		}
		
		answer += "int";
		System.out.println(answer);
	}
}
