package algorithms.boj.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //  배열길이와 몇개의 구간합을 구할지 입력받는다
        int arrayLength = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        //  입력받은 배열길이 + 1의 길이의 합배열을 만든다.
        long[] S = new long[arrayLength + 1];
        st = new StringTokenizer(br.readLine());

        //  배열을 입력받으면 바로 합배열로 만들어 저장한다.
        for(int i=1; i<S.length; i++){
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        //  구간합을 구해야 하는 길이를 입력받고, 합배열 공식을 이용해 해당 구간합을 구한다.
        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            System.out.println(S[k] - S[j-1]);
        }
    }
}
