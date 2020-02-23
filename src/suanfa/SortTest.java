package suanfa;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] a={9,8,7,9,6,5,4};
     //   sort(a);
        sort1(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int array[]){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                int temp=0;
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    public static void sort1(int array[]){
        for(int i=0;i<array.length-1;i++){
            boolean isSorted=true;
            for(int j=0;j<array.length-i-1;j++){
                int temp=0;
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    isSorted=false;
                }
            }
            if(isSorted){
                break;
            }
        }
    }
}
