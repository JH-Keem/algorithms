package algorithms.sorting;

public class SelectionSort2 {

    public static void main(String[] args){
        for (int k=0; k<2; k++){
            for(int j=0; j<2; j++){
                for (int i=0; i<2; i++){

                    int[] arr = new int[]{i, j, k};

                    System.out.print(arr[i] + " " + arr[j] + " "  + arr[k]);
                    System.out.print(" -> ");

                    int[] newArr = selectionSort(arr);

                    System.out.print(newArr[0] + " " + newArr[1] + " "  + newArr[2]);
                    System.out.print(" " + checkSorted() + "\n");
                }
            }
        }

    }

    public static int[] selectionSort(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){

            }
        }

        return arr;
    }

    public static boolean checkSorted(){

        return false;
    }
}
