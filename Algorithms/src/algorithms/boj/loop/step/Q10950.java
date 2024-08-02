package algorithms.boj.loop.step;

import java.util.Scanner;

public class Q10950 {
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int round = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<round; i++) {
			String[] inputCase = sc.nextLine().split(" ");
			int A = Integer.parseInt(inputCase[0]);
			int B = Integer.parseInt(inputCase[1]);
			System.out.println(A + B);
		}
	}
}
