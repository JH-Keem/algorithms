package algorithms.practice;

import java.util.Arrays;
import java.util.Collections;

public class Practice {
    public static void main(String[] args){

        int[] A = {5,3,2,4,1};
        negate(A);

        Arrays.sort(A);
        negate(A);
        System.out.println(Arrays.toString(A));
    }

    public static void negate(int[] temp){
        for(int i=0; i<temp.length; i++){
            temp[i] *= -1;
        }
    }
}
