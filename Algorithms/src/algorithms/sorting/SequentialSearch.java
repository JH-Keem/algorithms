package algorithms.sorting;
import algorithms.service.ArrayTools;

public class SequentialSearch {
    public static void main(String[] args){
        int[] array = new int[]{8, 1, 1, 3, 2, 5, 1, 2, 1, 1};

        System.out.println("Count 9 = " + count(array, 9));
        System.out.println("Count 2 = " + count(array, 2));
        System.out.println("Count 8 = " + count(array, 8));
        System.out.println("Count 1 = " + count(array, 1) + "\n");

        System.out.println("Search 2 = " + sSearch(array, 2));
        System.out.println("Search 5 = " + sSearch(array, 5));
        System.out.println("Search 9 = " + sSearch(array, 9) + "\n");

        insertionSort(array);
        ArrayTools.printArr(array);

        System.out.println("\nCount 9 = " + count(array, 9));
        System.out.println("Count 2 = " + count(array, 2));
        System.out.println("Count 8 = " + count(array, 8));
        System.out.println("Count 1 = " + count(array, 1));
    }

    public static int count(int[] array, int number){
        int cnt = 0;
        for(int i=0; i<array.length; i++) {
            if (array[i] == number) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int sSearch(int[] array, int number){
        int index = -1;
        for(int i=0; i<array.length; i++){
            if(array[i] == number){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void insertionSort(int[] array){
        for(int i=1; i<array.length; i++) {
            int key = array[i];
            int j = i;
            for(; j>0 && key<array[j-1]; j--){
                array[j] = array[j-1];
            }
            array[j] = key;
        }
    }

    public static int sortedCount(int[] array, int number){
        int i = sSearch(array, number);
        if(i >= 0){
            return sCountedHelper(array, number, i+1) + 1;
        }else return 0;
    }

    public static int sCountedHelper(int[] array, int number, int i){
        int cnt = 0;
        for(int j=i; j<array.length; j++){
            if(array[j] == number){
                cnt++;
            }else{
                //  조기종료
                return 0;
            }
        }
        return cnt;
    }
}
