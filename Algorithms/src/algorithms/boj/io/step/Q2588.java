package algorithms.boj.io.step;

import java.util.Scanner;

public class Q2588 {

	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int num1 = Integer.parseInt(sc.nextLine());
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println(num1 * (num2%10));
		System.out.println(num1 * ((num2%100 - num2%10)/10));
		System.out.println(num1 * ((num2 - num2%100)/100));
		System.out.println(num1 * num2);
	}
}
