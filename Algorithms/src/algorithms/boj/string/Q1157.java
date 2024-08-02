package algorithms.boj.string;

import java.util.Scanner;

public class Q1157 {
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		
		int[] count = new int[26];
		
		for(int i=0; i<inputStr.length(); i++) {
			if(inputStr.charAt(i) >= 'A' && inputStr.charAt(i) <= 'Z') {
				count[inputStr.charAt(i) - 'A']++;
			}else if(inputStr.charAt(i) >= 'a' && inputStr.charAt(i) <= 'z') {
				count[(inputStr.charAt(i) - 'a')]++;
			}
		}
		
		int mostCountedIndex = -1;
		int mostCount = -1;
		boolean isDuplicated = false;
		for(int i=0; i<count.length; i++) {
			if(count[i] > mostCount) {
				mostCount = count[i];
				mostCountedIndex = i;
				isDuplicated = false;
			}
			if(count[i] == mostCount && i != mostCountedIndex) {
				isDuplicated = true;
			}
		}
		
		for(int i=0; i<count.length; i++) {
			System.out.print(count[i] + " ");
		}
		System.out.println("\nmostCountedIndex : " + mostCountedIndex);
		System.out.println("mostCount : " + mostCount);
		
		if(isDuplicated) {
			System.out.println("?");
		}else {
			System.out.println((char)('A' + mostCountedIndex));
		}
	}
	
}
