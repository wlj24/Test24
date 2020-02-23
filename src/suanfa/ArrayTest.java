package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest {
    private int[] array;
    private int size;
    public ArrayTest(int capacity){
        this.array=new int[capacity];
        size=0;
    }

    public void insert(int element,int index){
        if(size>=array.length){
            int[] array1=new int[array.length*2];
            System.arraycopy(array,0,array1,0,array.length);
            array=array1;
        }
            if(index>size|| index<0){
            throw new IndexOutOfBoundsException("数组越界异常");
        }
        for(int i=size-1;i>=index;i--){
            array[i+1]=array[i];
        }

        array[index]=element;
        size++;
    }

    public void delete(int index){
        if(index>size || index<0){
            throw new IndexOutOfBoundsException("异常");
        }
        for(int i=index;i<size-1;i++){
            array[i]=array[i+1];
        }
        size--;


    }

    public void outPut(){
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(0,0);
        list.add(1,0);
        list.remove(1);
        System.out.println(list);

        ArrayTest arrayTest=new ArrayTest(1);
        arrayTest.insert(0,0);
        arrayTest.insert(1,1);

        arrayTest.insert(2,0);
        arrayTest.delete(1);
        arrayTest.outPut();

    }


}
