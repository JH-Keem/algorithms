package algorithms.boj.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10989 {
	//	input =
	//	10 (N)
	//	5
	//	2
	//	3
	//	1
	//	4
	//	2
	//	3
	//	5
	//	1
	//	7
	
	//	output =
	//	1
	//	1
	//	2
	//	2
	//	3
	//	3
	//	4
	//	5
	//	5
	//	7
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//	첫 줄에 몇개의 숫자를 받을 지(N) 입력 받기
		int N = Integer.parseInt(br.readLine());
		//	카운트 배열을 생성함으로서 이미 오름차순 정렬된 배열을 가지는 것과 마찬가지
		//	But, 반드시 모든 입력제한범위만큼 순회해야함
		int[] cnt = new int[10001];
		
		//	지정된 숫자만큼 반복
		for(int i=0; i<N; i++) {
			//	입력된 숫자번째 배열의 카운트 ++
			cnt[Integer.parseInt(br.readLine())]++;
		}
		br.close();
		
		//	입력제한범위 1~10000만큼 반복 (작은수부터 차례대로 조회)
		for(int i=1; i<10001; i++) {
			//	카운트가 1이상이면 출력하고, 카운트 -- (카운트 된 만큼 출력)
			while(cnt[i] > 0) {
				bw.write(i + "\n");
				cnt[i]--;
			}
		}
		bw.flush();
		bw.close();
	}
	
	public static void sortAfterTake() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] answer = new int[N];
		
		for(int i=0; i<N; i++) {
			int inputNumber = Integer.parseInt(br.readLine());
			answer[i] = inputNumber;
		}
		
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				if((i+1)<N && answer[i] > answer[j]) {
					int temp = answer[i];
					answer[i] = answer[j];
					answer[j] = temp;
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			bw.write(answer[i] + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static void withoutSort() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] cntArr = new int[10001];

		for(int i=0; i<N; i++) {
			int inputNumber = Integer.parseInt(br.readLine());
			cntArr[inputNumber]++;
		}
		
		for(int i=0; i<N; i++) {
			if(cntArr[i] > 0) {
				for(int j=0; j<cntArr[i]; j++) {
					bw.write(i + "\n");
				}
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
