package algorithms.practice.twodimentionalarraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class TwodimentionalArrayList {
    public static void main(String[] args) throws IOException {
        //  이차원 ArrayList를 만들고 불러오는 방법

        ArrayList<Edge> list[] = new ArrayList[10];
        //  위 한줄로는 초기화 된것이 아니라 메모리에 할당해야 함

        for(int i=0; i<10; i++){
            list[i] = new ArrayList<>();
        }

        //  노드와 엣지 갯수를 입력받는다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer getInput = new StringTokenizer(br.readLine());
        int iteration = Integer.parseInt(getInput.nextToken());
        int edges = Integer.parseInt(getInput.nextToken());
        
        for(int i=0; i<edges; i++){
            //  입력받은 노드 갯수만큼 반복
            StringTokenizer newSt = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(newSt.nextToken());
            int e = Integer.parseInt(newSt.nextToken());
            int v = Integer.parseInt(newSt.nextToken());
            
            //  몇번 노드의 다음 노드가 몇번이고 엣지(가중치)는 몇인지 저장
            list[s].add(new Edge(e, v));
        }

        //  출력을 통해 확인
        for(int i=0; i<list[1].size(); i++){
            Edge tmp = list[1].get(i);
            int next = tmp.endNode;
            int value = tmp.value;
            System.out.println("next is: " + next + ", edge value is: " + value);
        }
    }
}
