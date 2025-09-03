package algorithms.boj.array;

import java.io.*;
import java.util.StringTokenizer;

public class Q11720 {
    //  N개의 숫자가 공백 없이 쓰여 있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.
    //  숫자 갯수는 (1 <= N <= 100)
    /*
        입력예제
        5   (숫자의 개수)
        54321   (공백 없이 주어진 N개의 숫자)

        출력: 15
     */
    public static void main(String[] args) throws IOException {

        //  N값 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //  길이 String 변수 sNum에 저장하기
        String sNum = br.readLine();
        br.close();
        
        //  sNum을 다시 char[]형 변수 cNum에 변환, 저장하기  
        char[] cNum = sNum.toCharArray();

        //  int형 변수 sum 선언하기
        int sum = 0;
        
        //  for(cNum)길이만큼 반복하기
        for(int i=0; i < cNum.length; i++){
             sum += cNum[i] - '0';
        }

        //  sum 출력하기
        System.out.println(sum);

    }
}
