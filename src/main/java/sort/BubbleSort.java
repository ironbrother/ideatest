package sort;

import java.util.Arrays;

public class BubbleSort {
    public static int[] sort(int [] b){
        for (int i = 0; i <b.length ; i++) {
            for (int j = 0;j<b.length-i-1;j++){
                int temp =b[j];
                if(b[j]<b[j+1]){
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }
        return b;
    }
    public static void main(String[] args){
        int [] a = {2,6,8,3,4,9,1};
        int[] b = sort(a);
        System.out.println(Arrays.toString(b));
    }
}
