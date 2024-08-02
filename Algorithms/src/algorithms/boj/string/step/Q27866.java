package algorithms.boj.string.step;

import java.util.Scanner;

public class Q27866 {
	// Sprout
	// 3 (output expectation = r)
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String inputText = sc.nextLine();
		int inputInt = Integer.parseInt(sc.nextLine());
		
		System.out.println(inputText.charAt(inputInt-1));
	}
}
