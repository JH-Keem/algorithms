package algorithms.sorting;

public class SelectionSort2 {

    public static void main(String[] args){
        for (int k=0; k<3; k++){
            for(int j=0; j<3; j++){
                for (int i=0; i<3; i++){

                    int[] arr = new int[]{i, j, k};

                    System.out.print(arr[0] + " " + arr[1] + " "  + arr[2]);
                    System.out.print(" -> ");

                    int[] newArr = selectionSort(arr);

                    System.out.print(newArr[0] + " " + newArr[1] + " "  + newArr[2]);
                    System.out.print(" " + checkSorted(newArr) + "\n");
                }
            }
        }

    }

    public static int[] selectionSort(int[] arr){

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
