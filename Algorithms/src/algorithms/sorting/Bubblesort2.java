package algorithms.sorting;
import algorithms.service.ArrayTools;

public class Bubblesort2 {
    public static void main(String[] args){
        int[] array = new int[]{5, 1, 4, 2, 8};

        for(int i=0; i<array.length-1; i++){
            //  중간에 정렬이 끝나면 반복문을 끝낼 수 있도록 할 수 있음.
            boolean swapFlag = false;

            //  array.length - i - 1로 범위를 지정하면, 이미 정렬된 맨 끝부분은 제외해 나가며 정렬할 수 있음.
            for(int j=0; j<array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    //  스왑
                    swapFlag = true;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

            ArrayTools.printArr(array);
            if(!swapFlag){
                break;
            }
        }



    }


    public static void checkSorted(int[] inputArray){

    }

}
