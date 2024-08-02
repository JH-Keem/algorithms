package algorithms.boj.string.step;

import java.util.Scanner;

public class Q11720 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		char[] inputNumber = sc.nextLine().toCharArray();
		
		int sum = 0;
		for(int i=0; i<count; i++) {
			sum += Character.getNumericValue(inputNumber[i]);
		}
		
		System.out.println(sum);
	}
}
