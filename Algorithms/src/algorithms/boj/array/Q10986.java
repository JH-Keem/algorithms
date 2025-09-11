package algorithms.boj.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10986 {
    /*
        수 N개 A1 .. AN이 주어진다. 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.
        즉, Aj + Aj (i<=j)의 합이 M으로 나누어 떨어지는 (i, j)쌍의 개수를 구해야 한다.
        5 3
        1 2 3 1 2
        을 입력 예제로 할 때, 1+2, 1+2+3, 1+2+3+1+2, 2+3+1, 3, 3+1+2, 1+2로 출력은 7이 나와야 한다.
        (A + B) % C 는 ((A % C) + (B % C)) % C와 같다.
        즉, 특정 구간의 수들의 나머지연산을 더해 나머지 연산을 한 값과 이 구간 합에 나머지 연산을 한 값은 동일하다.
     */

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] S = new long[N];
        long[] C = new long[M];

        //  합 배열 만들기
        st = new StringTokenizer(br.readLine());
        S[0] = Long.parseLong(st.nextToken());
        for(int i=1; i<N; i++){
            S[i] = S[i-1] + Long.parseLong(st.nextToken());
        }

        long answer = 0;
        for(int i=0; i<N; i++){
            int remainder = (int)(S[i] % M);
            if(remainder == 0) answer++;
            C[remainder]++;
        }

        for(int i=0; i<M; i++){
            if(C[i] > 1){
                answer = answer + (C[i] * (C[i] - 1) / 2);
            }
        }

        System.out.println(answer);
    }
}
