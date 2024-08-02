package algorithms.boj.array;

import java.util.Scanner;

public class Q10431 {
	/*
	 * ★★★★★★★★★★★★★★★★★★★★미완★★★★★★★★★★★★★★★★★★★★
	 * 
	 * 자기 앞에 자기보다 키가 큰 학생이 없다면 그냥 그 자리에 서고 차례가 끝난다.
	 * 자기 앞에 자기보다 키가 큰 학생이 한 명 이상 있다면 그중 가장 앞에 있는 학생(A)의 바로 앞에 선다. 
	 * 이때, A부터 그 뒤의 모든 학생들은 공간을 만들기 위해 한 발씩 뒤로 물러서게 된다.
	 * 아이들의 키가 주어지고, 어떤 순서로 아이들이 줄서기를 할 지 주어진다.
	 * 위의 방법을 마지막 학생까지 시행하여 줄서기가 끝났을 때 학생들이 총 몇 번 뒤로 물러서게 될까?
	 * 
	 * Input =
	 * 4
	 * 1 900 901 902 903 904 905 906 907 908 909 910 911 912 913 914 915 916 917 918 919
	 * 2 919 918 917 916 915 914 913 912 911 910 909 908 907 906 905 904 903 902 901 900
	 * 3 901 902 903 904 905 906 907 908 909 910 911 912 913 914 915 916 917 918 919 900
	 * 4 918 917 916 915 914 913 912 911 910 909 908 907 906 905 904 903 902 901 900 919
	 * 
	 * Output =
	 * 1 0
	 * 2 190
	 * 3 19
	 * 4 171
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int round = Integer.parseInt(sc.nextLine());
		int[][] map = new int[round][20];
		for(int i=0; i<round; i++) {
			String[] inputCase = sc.nextLine().split(" ");
			for(int j=0; j<20; j++) {
				map[i][j] = Integer.parseInt(inputCase[j+1]);
			}
		}
		
		//debug
		for(int i=0; i<round; i++) {
			for(int j=0; j<20; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		int count = 0;

		for(int i=0; i<round; i++) {
			
			for(int j=0; j<20; j++) {
				int thisNum = map[i][j];
				if(j>0) {
					// 서야 할 자리 찾기
					int idx = j;
					for(int k=0; k<j; k++) {
						if(thisNum < map[i][k]) {
							idx = k;
							break;
						}
					}
					
					if(idx != j) {
						// 해당 자리에서부터 뒤로 한칸씩 밀고, 자리에 서기
						for(int k=j; k>idx; k--) {
							map[i][k] = map[i][k-1];
							count++;
						}
						map[i][idx] = thisNum;
					}else {
						continue;
					}
				}
			}
			System.out.print(i + " ");
			System.out.println(count);
		}
		
		
	}
	
	
}
