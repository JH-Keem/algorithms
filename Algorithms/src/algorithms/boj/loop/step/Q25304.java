package algorithms.boj.loop.step;

import java.util.Scanner;

public class Q25304 {
	//	영수증에 적힌,
	//	구매한 각 물건의 가격과 개수
	//	구매한 물건들의 총 금액
	//	을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
	
	//	input = 
	//	260000
	//	4
	//	20000 5
	//	30000 2
	//	10000 6
	// 	5000 8
	
	//	output = Yes
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int totalPrice = Integer.parseInt(sc.nextLine());
		int totalAmount = Integer.parseInt(sc.nextLine());
		
		int sum = 0;
		for(int i=0; i<totalAmount; i++) {
			String[] inputCase = sc.nextLine().split(" ");
			int price = Integer.parseInt(inputCase[0]);
			int amount = Integer.parseInt(inputCase[1]);
			
			sum += price*amount;
		}
		
		if(totalPrice == sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}
