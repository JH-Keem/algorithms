package algorithms.boj.string.step;

import java.util.Scanner;

public class Q1152 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String inputText = sc.nextLine();
		
		String[] words = inputText.split(" ");
		
		int count = 0;
		for(int i=0; i<words.length; i++) {
			if(words[i].equals("")) {
				continue;
			}else{
				count++;
			}
		}
		System.out.println(count);
	}
}
