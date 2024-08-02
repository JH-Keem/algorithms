package algorithms.boj.array.step;

import java.util.Scanner;

public class Q10813 {
	//	도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다.
	//	바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
	//	도현이는 앞으로 M번 공을 바꾸려고 한다. 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
	//	공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.
	
	//	input = 
	//	5 4		
	//	1 2		1 2 3 4 5 => 2 1 3 4 5
	//	3 4		2 1 3 4 5 => 2 1 4 3 5
	//	1 4		2 1 4 3 5 => 3 1 4 2 5
	//	2 2		3 1 4 2 5 => 3 1 4 2 5
	
	// output = 3 1 4 2 5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] inputCase = sc.nextLine().split(" ");
		int[] buckets = new int[Integer.parseInt(inputCase[0])];
		int changeNum = Integer.parseInt(inputCase[1]);
		
		for(int i=0; i<buckets.length; i++) {
			buckets[i] = i + 1;
		}
		
		for(int i=0; i<changeNum; i++) {
			String[] inputCondition = sc.nextLine().split(" ");
			int bucket1 = Integer.parseInt(inputCondition[0]) - 1;
			int bucket2 = Integer.parseInt(inputCondition[1]) - 1;
			
			int temp = buckets[bucket1];
			buckets[bucket1] = buckets[bucket2];
			buckets[bucket2] = temp;
		}
		
		for(int i=0; i<buckets.length; i++) {
			System.out.print(buckets[i] + " ");
		}
	}
}
