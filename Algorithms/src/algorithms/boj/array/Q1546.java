package algorithms.boj.array;

import java.io.*;
import java.util.StringTokenizer;

public class Q1546 {
    /*
        세준이는 기말고사 점수를 조작한다. 자기점수 중 최댓값 M을 고른다음 모든 점수를 점수/M*100으로 고쳤다.
        예를들어 최고점이 70점, 수학점수 50점이라면 수학점수는 50/70*100 이므로 71.43점이다.
        새로운 평균을 구하는 프로그램 작성하기
     */
    public static void main(String[] args) throws IOException {
        //  입력: 1번째 줄에 시험 본 과목 갯수 N(1000>=N)
        //  2번재 줄에 현재 성적이 주어진다. (100>=N>0) 적어도 한개는 0보다 크다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //  시험 본 과목 갯수 입력받기
        int N = Integer.parseInt(br.readLine());

        //  시험 본 과목 점수들 입력받아 배열에 저장하기 + 최고점수 찾기
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] scores = new double[N];
        double maxS = 0;
        for(int i=0; i<N; i++){
            scores[i] = Double.parseDouble(st.nextToken());
            if(scores[i] > maxS){
                maxS = scores[i];
            }
        }

        //  최고점수로 새 점수 만들고 새 점수들의 평균 값 구하기
        double sum = 0;
        for(int i=0; i<N; i++){
            sum += (scores[i]/ maxS) * 100.0;
        }
        double newAvg = sum/N;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(newAvg));

        bw.flush();
        bw.close();
        br.close();
    }
}
