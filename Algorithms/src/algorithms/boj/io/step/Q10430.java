package algorithms.boj.io.step;

import java.util.Scanner;

public class Q10430 {
	//	(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
	//	(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
	//	세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
	
	//	input = 5 8 4
	//	output =
	//	1
	//	1
	//	0
	//	0
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String[] inputCase = sc.nextLine().split(" ");
		int num1 = Integer.parseInt(inputCase[0]);
		int num2 = Integer.parseInt(inputCase[1]);
		int num3 = Integer.parseInt(inputCase[2]);
		
		System.out.println((num1+num2)%num3);
		System.out.println(((num1%num3)+(num2%num3))%num3);
		System.out.println((num1*num2)%num3);
		System.out.println(((num1%num3)*(num2%num3))%num3);
	}
}
