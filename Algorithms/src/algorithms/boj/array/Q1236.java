package algorithms.boj.array;

import java.util.Scanner;

public class Q1236 {
	
	/*
	 * 영식이는 직사각형 모양의 성을 가지고 있다. 성의 1층은 몇 명의 경비원에 의해서 보호되고 있다.
	 * 영식이는 모든 행과 모든 열에 한 명 이상의 경비원이 있으면 좋겠다고 생각했다.
	 * 성의 크기와 경비원이 어디있는지 주어졌을 때,
	 * 몇 명의 경비원을 최소로 추가해야 영식이를 만족시키는지 구하는 프로그램을 작성하시오.
	 * 
	 * 첫째 줄에 성의 세로 크기 N과 가로 크기 M이 주어진다. N과 M은 50보다 작거나 같은 자연수이다.
	 * 둘째 줄부터 N개의 줄에는 성의 상태가 주어진다. 성의 상태는 .은 빈칸, X는 경비원이 있는 칸이다.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputText = sc.nextLine(); 
		int height = Integer.parseInt(inputText.split(" ")[0]);
		int width = Integer.parseInt(inputText.split(" ")[1]);

		String[] castle = new String[height];
		
		for(int i=0; i<castle.length; i++) {
			castle[i] = sc.nextLine();
		}

		
		int count = 0;
		int[] emptyStageNum = new int[height];
		int[] emptyColumnNum = new int[width];
		
		// stage check
		for(int stage=0; stage<height; stage++) {
			char[] stageArr = castle[stage].toCharArray();
			
			boolean isStageEmpty = true;
			for(int column=0; column<width; column++) {
				if(stageArr[column]=='X') {
					isStageEmpty = false;
				}
			}
			if(isStageEmpty) {
				emptyStageNum[stage] = 1;
			}else {
				emptyStageNum[stage] = 0;
			}
		}
		
		// column check
		for(int column=0; column<width; column++) {
			
			boolean isColumnEmpty = true;
			for(int stage=0; stage<height; stage++) {
				char[] stageArr = castle[stage].toCharArray();
				if(stageArr[column] == 'X') {
					isColumnEmpty = false;
				}
			}
			
			if(isColumnEmpty) {
				emptyColumnNum[column] = 1;
			}else {
				emptyColumnNum[column] = 0;
			}
		}
		int emptyStages = 0;
		int emptyColumns =0;
		for(int i=0; i<height; i++) {
			if(emptyStageNum[i] == 1) emptyStages++;
		}
		
		for(int i=0; i<width; i++) {
			if(emptyColumnNum[i] == 1) emptyColumns++;
		}

		System.out.println(emptyStages >= emptyColumns ? emptyStages : emptyColumns);
	}
	
	
	public static void solve2() {
		Scanner sc = new Scanner(System.in);
		String inputNM = sc.nextLine();
		int n = Integer.parseInt(inputNM.split(" ")[0]);
		int m = Integer.parseInt(inputNM.split(" ")[1]);
		
		char[][] map = new char[n][m];
		
		for(int i=0; i<n; i++) {
			map[i] = sc.nextLine().toCharArray();
		}
		
		// for debugging
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}	
		boolean[] existRow = new boolean[n];
		boolean[] existCol = new boolean[m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j] == 'X') {
					existRow[i] = true;
					existCol[j] = true;
				}
			}
		}
		
		int needRowCount = 0;
		int needColCount = 0;
		
		for(int i=0; i<n; i++)
			if(!existRow[i]) needRowCount++;
		for(int i=0; i<m; i++)
			if(!existCol[i]) needColCount++;
		
		System.out.println(Math.max(needRowCount, needColCount));
		
		
	}
}
