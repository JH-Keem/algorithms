package algorithms.boj.string;

import java.util.Scanner;

public class Q13223 {
	// 20:00:00
	// 04:00:00 expectation : 08:00:00
	
	// 12:34:56
	// 14:36:22 expectation : 02:01:26
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input nowTime : ");
		String now = sc.nextLine();
		System.out.print("Input tagetTime : ");
		String target = sc.nextLine();
		
		int nowH = Integer.parseInt(now.split(":")[0]);
		int nowM = Integer.parseInt(now.split(":")[1]);
		int nowS = Integer.parseInt(now.split(":")[2]);
		
		int nowMills = nowH*3600 + nowM*60 + nowS;
		System.out.println("nowMills : " + nowMills);
		
		int targetH = Integer.parseInt(target.split(":")[0]);
		int targetM = Integer.parseInt(target.split(":")[1]);
		int targetS = Integer.parseInt(target.split(":")[2]);
		
		int targetMills = targetH*3600 + targetM*60 + targetS;
		System.out.println("targetMills : " + targetMills);

		if(targetMills <= nowMills) {
			targetMills += (24*3600);
		}
		int resultMills = targetMills - nowMills;
		System.out.println("resultMills : " + resultMills);
		
		int resultH = resultMills/3600;
		System.out.println("resultH : " + resultH);
		int resultM = (resultMills%3600)/60;
		System.out.println("resultM : " + resultM);
		int resultS = (resultMills%60);
		System.out.println("resultM : " + resultS);

		System.out.printf("result : %02d:%02d:%02d", resultH, resultM, resultS);
	}
	
	public static void test() {
		String str = "04:12:34";
		int hour = Integer.parseInt(str.split(":")[0]);
		int min = Integer.parseInt(str.split(":")[1]);
		int sec = Integer.parseInt(str.split(":")[2]);
		
		int mills = sec + (min*60) + (hour*3600);
		System.out.println(mills);
		
		int h = mills/3600;
		System.out.println("h : " + h);
		int m = (mills-h*3600)/60;
		System.out.println("m : " + m);
		int s = mills - h*3600 - m*60;
		System.out.println("s : " + s);
		
		System.out.printf("%02d:%02d:%02d", h, m, s);
	}
}
