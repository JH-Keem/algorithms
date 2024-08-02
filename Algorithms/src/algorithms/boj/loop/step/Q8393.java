package algorithms.boj.loop.step;

import java.util.Scanner;

public class Q8393 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int inputCase = Integer.parseInt(sc.nextLine());
		
		int sum = 0;
		for(int i=1; i<=inputCase; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
}
