package algorithms.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Camparable {
    //  예: 영어 점수가 같은 경우 수학 점수를 기준으로 정렬하고자 하는 경우 => 다중 조건 정렬을 사용한다.

    public static class Score implements Comparable<Score>{
        int english;
        int math;

        public Score(int english, int math){
            this.english = english;
            this.math = math;
        }

        @Override
        public String toString(){
            return "SCore{" + "english=" + english + ", math=" + math + '}';
        }

        @Override
        public int compareTo(Score o) {
            if (this.english == o.english) return o.math - this.math;
            return o.english - this.english;
        }
        //  compareTo 메서드는 클래스 객체의 자연순서를 정한다.
        //  반환값의 양수/음수 여부에 다라 현재 객체와 매개변수로 입력된 비교대상을 비교한다.
        //

    }

    public static class ScoreComparator implements java.util.Comparator<Score>{
        @Override
        public int compare(Score o1, Score o2){
            if(o1.math == o2.math) return o2.english - o1.english;
            return o2.math - o1.math;
        }
    }

    public static void main(String[] args){
        ArrayList<Score> myArr = new ArrayList<>();
        myArr.add(new Score(80, 100));
        myArr.add(new Score(100, 50));
        myArr.add(new Score(70, 100));
        myArr.add(new Score(80, 90));

        Collections.sort(myArr);
        for(Score s : myArr){
            System.out.println(s.toString());
        }

        System.out.println("==========================");

        Collections.sort(myArr, new ScoreComparator());
        for (Score s : myArr){
            System.out.println(s.toString());
        }
    }

}
