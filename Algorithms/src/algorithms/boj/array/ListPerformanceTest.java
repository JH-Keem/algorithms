package algorithms.boj.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListPerformanceTest{

    public static void main(String[] args) {

        //  테스트할 데이터 크기를 백만개로 선언
        int dataSize = 1000000;
        int middleIndex = dataSize / 2;

        System.out.println("인덱스에 접근하고 Add, Remove 속도 비교");
        indexingAndAddRemove(dataSize, middleIndex);

        System.out.println("=======================================");
        System.out.println("단순 Add, Remove 속도 비교");
        justAddAndRemove(dataSize, middleIndex);



    }

    public static void indexingAndAddRemove(int dataSize, int middleIndex){
        //  ArrayList의 삽입/중간 접근 시간을 테스트합니다.
        List<Integer> arrayList = new ArrayList<>();
        long start = System.nanoTime();
        for(int i=0; i<dataSize; i++){
            arrayList.add(i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList 삽입 시간: " + (end - start) / 1000000.0 + "ms");

        start = System.nanoTime();
        arrayList.get(dataSize / 2);
        end = System.nanoTime();
        System.out.println("ArrayList 중간 접근 시간: " + (end - start) / 1000000.0 + "ms");


        //  LinkedList의 삽입/중간 접근 시간을 테스트합니다.
        List<Integer> linkedList = new LinkedList<>();
        start = System.nanoTime();
        for(int i=0; i<dataSize; i++){
            linkedList.add(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList 삽입 시간: " +  (end - start) / 1000000.0 + "ms");

        start = System.nanoTime();
        linkedList.get(dataSize / 2);
        end = System.nanoTime();
        System.out.println("LinkedList 중간 접근 시간: " +  (end - start) / 1000000.0 + "ms");


        //  ArrayList의 중간 삽입/삭제 시간을 테스트합니다.
        start = System.nanoTime();
        arrayList.add(middleIndex, 99999);
        arrayList.remove(middleIndex);
        end = System.nanoTime();
        System.out.println("ArrayList 중간 삽입/삭제 시간: " +  (end - start) / 1000000.0 + "ms");

        //  LinkedList의 중간 삽입/삭제 시간을 테스트합니다.
        start = System.nanoTime();
        linkedList.add(middleIndex, 99999);
        linkedList.remove(middleIndex);
        end = System.nanoTime();
        System.out.println("LinkedList 중간 삽입/삭제 시간: " +  (end - start) / 1000000.0 + "ms");

        //  개선된 LinkedList의 중간 삽입/삭제 시간 테스트 입니다.
        start = System.nanoTime();
        ListIterator<Integer> iterator = linkedList.listIterator(middleIndex);
        iterator.add(99999);
        iterator.previous();
        iterator.remove();
        end = System.nanoTime();
        System.out.println("개선된 LinkedList의 중간 삽입/삭제 시간: " +  (end - start) / 1000000.0 + "ms");
    }

    public static void justAddAndRemove(int dataSize, int middleIndex){
        int iterations = 100; // 반복 횟수

        //  ArrayList 반복 중간 삽입/삭제
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < dataSize; i++) arrayList.add(i);

        long start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            arrayList.add(middleIndex, 99999);
            arrayList.remove(middleIndex);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList 반복 중간 삽입/삭제 시간: " + (end - start) / 1_000_000.0 + " ms");

        //  LinkedList 반복 중간 삽입/삭제 (ListIterator 사용)
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < dataSize; i++) linkedList.add(i);

        start = System.nanoTime();
        ListIterator<Integer> iterator = linkedList.listIterator(middleIndex);
        for (int i = 0; i < iterations; i++) {
            iterator.add(99999);
            iterator.previous();
            iterator.remove();
        }
        end = System.nanoTime();
        System.out.println("LinkedList 반복 중간 삽입/삭제 시간: " + (end - start) / 1_000_000.0 + " ms");
    }
}