package algorithms.boj.array.step;

import java.util.Scanner;

public class Q10810 {
	//	도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다.
	//	또, 1번부터 N번까지 번호가 적혀있는 공을 매우 많이 가지고 있다.
	//	가장 처음 바구니에는 공이 들어있지 않으며, 바구니에는 공을 1개만 넣을 수 있다.
	//	도현이는 앞으로 M번 공을 넣으려고 한다.
	//	도현이는 한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고, 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다.
	//	만약, 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다. 공을 넣을 바구니는 연속되어 있어야 한다.
	//	공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오.
	
	//	input = 
	//	5 4		(바구니 5개, 4번 공 넣기)
	//	1 2 3	(1번부터 2번 바구니까지, 3 넣기)	3 3 0 0 0
	//	3 4 4	(3번부터 4번 바구니까지, 4 넣기) 	3 3 4 4 0
	//	1 4 1	(1번부터 4번 바구니까지, 1 넣기)	1 1 1 1 0
	//	2 2 2	(2번부터 2번 바구니까지, 2 넣기)	1 2 1 1 0
	
	// output = 1 2 1 1 0
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] inputCase = sc.nextLine().split(" ");
		int bucketCount = Integer.parseInt(inputCase[0]);
		int inputCount = Integer.parseInt(inputCase[1]);
		
		int[] buckets = new int[bucketCount];
		
		for(int i=0; i<inputCount; i++) {
			String[] inputCondition = sc.nextLine().split(" ");
			int startBucket = Integer.parseInt(inputCondition[0]);
			int endBucket = Integer.parseInt(inputCondition[1]);
			int inputNumber = Integer.parseInt(inputCondition[2]);
			
			for(int j=startBucket - 1; j<=endBucket - 1; j++) {
				buckets[j] = inputNumber;
			}
		}
		
		for(int i=0; i<bucketCount; i++) {
			System.out.print(buckets[i] + " ");
		}
	}

}
