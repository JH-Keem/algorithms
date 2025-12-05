package algorithms.practice.stringCompression;
import algorithms.service.ArrayTools;

public class StringCompression {
    public static void main(String[] args){
        char[] array = "ababcdfdceeedag".toCharArray();

        //  정렬없이 카운트하기
        if(array.length<=1)return;
        ArrayTools.printArr(array);

        int[] table = new int[26];
        for(int i=0; i<array.length; i++){
            table[array[i]-97]++;
        }
        ArrayTools.printArr(table);

        for(int i=0; i<table.length; i++){
            if(table[i]>0)System.out.print((char)('a' + i)+ "" + table[i]);
        }

        //  정렬 후 카운트하며 바로바로 출력하기
        //  정렬
        System.out.println();
        insertionSort(array);


        //  카운트하며 출력
        for(int i=0; i<array.length; i++){
            char current = array[i];
            int cnt = 1;
            int j=1;
            for(; j<array.length; j++){
                if(current == array[j]){
                    cnt++;
                }
            }
            i+=j;
            System.out.print(current + "" + cnt);
        }
    }

    public static void insertionSort(char[] array){

        for(int i=1; i<array.length; i++){
            char key = array[i];
            int j = i-1;
            while(j>=0 && array[j]>key){
                if(array[j]>key){
                    array[j] = array[j-1];
                }
                j--;
            }
        }

        ArrayTools.printArr(array);
    }
}
