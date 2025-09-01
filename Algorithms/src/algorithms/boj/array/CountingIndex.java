package algorithms.boj.array;

import java.io.*;
import java.util.StringTokenizer;

public class CountingIndex {

    public static void main(String[] args) throws IOException {
        //   입출력 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //  첫번째로 몇개의 정수가 입력될지 입력받기
        int N = Integer.parseInt(br.readLine());
        int[] count = new int[1001];
        StringTokenizer st = new StringTokenizer(br.readLine());

        //  입력받은 정수만큼 새로운 정수를 입력받아 해당 정수번째 인덱스에 카운트 횟수 증가
        for(int i=0; i<N; i++){
            int number = Integer.parseInt(st.nextToken());
            count[number]++;
        }
        br.close();

        //  1000사이즈 배열을 돌면서 카운트 횟수가 0이 아닌 인덱스 횟수만큼 출력
        for(int i=0; i<=1000; i++){
            if(count[i] != 0){
                for (int j=0; j<count[i]; j++){
                    bw.write(i + " ");
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
