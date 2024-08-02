package algorithms.boj.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q25206 {
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double sumScore = 0;
		double sumTotal = 0;
		for(int i=0; i<20; i++) {
			String[] inputCase = br.readLine().split(" ");
			double score = Double.parseDouble(inputCase[1]);
			char grade = inputCase[2].charAt(0);
			if(grade != 'P') {
				char gradePlus;
				double gradeAvg;
				if(grade == 'F') {
					gradeAvg = 0.0;
				}else {
					gradePlus = inputCase[2].charAt(1);
					switch(grade) {
					case 'A':
						gradeAvg = 4.0;
						break;
					case 'B':
						gradeAvg = 3.0;
						break;
					case 'C':
						gradeAvg = 2.0;
						break;
					case 'D':
						gradeAvg = 1.0;
						break;
					default:
						gradeAvg = 0.0;
						break;
					}
					if(gradePlus == '+') {
						gradeAvg += 0.5;
					}
				}
				sumScore += score * gradeAvg;
				sumTotal += score;
			}
		}
		if(sumScore == 0.0 || sumTotal == 0.0) {
			System.out.println(0.000000);
		}else {
			System.out.printf("%.6f%n", sumScore/sumTotal);
		}
	}
}
