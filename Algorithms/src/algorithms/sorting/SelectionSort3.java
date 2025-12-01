package algorithms.sorting;
import algorithms.service.ArrayTools;

public class SelectionSort3 {

    public static void main(String[] args){
        int[] arr = new int[]{8, 3, 2, 5, 1, 1, 2, 5, 8, 9};
        int minNumber = findMinNumber(arr);
        int minIndex = findMinIndex(arr);


        int min_index = 0;
        for(int i=0; i<arr.length-1; i++){

            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            System.out.println("Minimum index number is : " + min_index);

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

            ArrayTools.printArr(arr);
        }


    }

    public static int findMinNumber(int[] arr){
        int minNumber = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] < minNumber){
                minNumber = arr[i];
            }
        }
        return minNumber;
    }

    public static int findMinIndex(int[] arr){
        int minIndex = 0;

        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int[] selectionSort(int[] arr, int minIndex){

        for(int j=0; j<arr.length-1; j++){
            for(int i=0; i<arr.length-1; i++){
                int pickNum = arr[i];
                if(pickNum > arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = pickNum;
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }

    public static boolean checkSorted(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] <= arr[i+1]){
                continue;
            }else{
                return false;
            }
        }

        return true;
    }
}
