package algorithms.boj.bruteForce;

import java.util.HashSet;
import java.util.Scanner;

public class Q10448_2 {

	public static void main(String[] args){
		int[] triangleNumsArray = setTriangleArray();
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		for(int t = 0; t < T; t++){
			int inputNum = scan.nextInt();
			int ans = triangleTest(inputNum, triangleNumsArray);
			System.out.println(ans);
		}

	}

	//	먼저, 삼각수 배열을 만드는 코드를 작성해본다.
	//	삼각수 공식은 T(n) = n*(n+1)/2 임을 기억하자 !
	public static int[] setTriangleArray(){
		//	그런데 삼각수 배열의 최대 길이는 삼각수가 1000이 넘지 않는 T(n) n만큼의 길이, 따라서 이 n값을 먼저 찾아야 한다.
		int n = 1;
		while(true){
			int triangleNum = n * (n + 1) / 2;
			if(triangleNum > 1000) break;
			n++;
		}

		//	구한 n을 가지고 배열을 선언하고, 해당 배열 안에 삼각수를 저장한다.
		int[] triangleNumsArray = new int[n-1];
		for(int i = 1; i <= triangleNumsArray.length; i++) {
			triangleNumsArray[i-1] = i * (i + 1) / 2;
		}
		return triangleNumsArray;
	}

	public static int triangleTest(int inputNum, int[] triangleNumsArray){
		//	다음, 입력받은 K 값을 이용해 삼각수 세개로 표현이 가능한지 알아보는 완전탐색 for문을 작성한다.
		for(int i = 0; i < triangleNumsArray.length; i++) {
			//	첫번째 삼각수
			for (int j = 0; j < triangleNumsArray.length; j++) {
				//	두번째 삼각수
				for(int k = 0; k < triangleNumsArray.length; k++) {
					//	세번째 삼각수
					if((triangleNumsArray[i] + triangleNumsArray[j] + triangleNumsArray[k]) == inputNum){
						return 1;
					}

				}
			}
		}
		return 0;
	}
//
//	public static void preprocess(int[] triangleNumsArray){
//		HashSet<Integer> possibleSums = new HashSet<>();
//
//		for(int i = 0; i < triangleNumsArray.length; i++){
//			for(int j = 0; j < triangleNumsArray.length; j++){
//				for(int k = 0; k < triangleNumsArray.length; k++){
//					int sum = triangleNumsArray[i] + triangleNumsArray[j] + triangleNumsArray[k];
//					possibleSums.add(sum);
//				}
//			}
//		}
//
//		for(int t = 0; t < possibleSums.size(); t++){
//			int K = scan.nextInt();
//			if(possibleSums.contains(K)){
//				System.out.println("1");
//			}else{
//				System.out.println("0");
//			}
//		}
//
//	}


}
