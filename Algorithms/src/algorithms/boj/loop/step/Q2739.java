package algorithms.boj.loop.step;

import java.util.Scanner;

public class Q2739 {

	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int inputCase = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<9; i++) {
			System.out.println(inputCase + " * " + (i+1) + " = " + inputCase * (i+1));
		}
	}
}
