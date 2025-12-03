package algorithms.sorting;
import algorithms.service.ArrayTools;

public class InsertionSort2 {

    public static void main(String[] args){
//        practice();

        int[] array = new int[]{3, 8, 2, 5, 1, 2};

        for(int i=1; i<array.length; i++){
            int temp = array[i];
            int j = i;
            for(; (j>0) && (array[j-1]> temp); j--){
                array[j] = array[j-1];
            }
            array[j] = temp;

            ArrayTools.printArr(array);
        }


    }

    public static void practice(){
        //  밀어내기 연습 ! (3을 정렬할 차례라고 가정하고, 4, 5를 옆으로 밀어내기 위한 연습하기)
        int[] array = new int[]{1, 2, 4, 5, 3, 6};
        int i=4;
        int temp = array[i];
        int j = i;
        for(; (j>0) && (array[j-1] > temp); j--){
            array[j] = array[j-1];
            ArrayTools.printArr(array);
        }
        array[j] = temp;
        ArrayTools.printArr(array);
    }


}
