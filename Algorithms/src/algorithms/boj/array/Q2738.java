package algorithms.boj.array;

import java.util.Scanner;

public class Q2738 {

	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matX = sc.nextInt();
		int matY = sc.nextInt();
		
		int[][] matA = new int[matX][matY];
		int[][] matB = new int[matX][matY];
		int[][] matAnswer = new int[matX][matY];
		
		for(int i=0; i<matX; i++) {
			for(int j=0; j<matY; j++) {
				matA[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<matX; i++) {
			for(int j=0; j<matY; j++) {
				matB[i][j] = sc.nextInt();
			}
		}
		sc.close();
		for(int i=0; i<matX; i++) {
			for(int j=0; j<matY; j++) {
				matAnswer[i][j] = matA[i][j] + matB[i][j];
				System.out.print(matAnswer[i][j]+" ");
			}
			System.out.println();
		}

	}
}
