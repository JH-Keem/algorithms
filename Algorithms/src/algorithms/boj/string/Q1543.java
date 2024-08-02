package algorithms.boj.string;

import java.util.Scanner;

public class Q1543 {
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		String doc = sc.nextLine();
		String word = sc.nextLine();
		
		// abcdbc
		// bc (output exception = 2)
		// 문제 : word반복문을 다 돌고 다음으로 넘어가는방법?
		// break 되지 않아도 같은 반복문 내에서 다시 도는것을 깜빡했음
		
		int count = 0;
		for(int i=0; i<doc.length(); i++) {
			boolean isMatch = true;
			for(int j=0; j<word.length(); j++) {
				if((i+j) >= doc.length() || doc.charAt(i+j) != word.charAt(j)) {
					isMatch = false;
					break;
				}
			}
			if(isMatch) {
				count++;
				i = i + word.length() -1;
			}
		}	
		System.out.println(count);
	}
	
	public static void solve2() {
		Scanner sc = new Scanner(System.in);
		
		String doc = sc.nextLine();
		String word = sc.nextLine();

		int count = 0;
		int index = 0;
		while(true) {
			if(doc.indexOf(word, index) == -1) {
				break;
			}else {
				index = doc.indexOf(word, index) + word.length();
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	
	
}
