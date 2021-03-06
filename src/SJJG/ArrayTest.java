package SJJG;
/**
 *
 * @ClassName ArrayTest
 * @author wanglianjie
 * @Description: 数组扩容
 * @date:   2020/3/9 17:34
 * @since V1.0
 *
 * @Copyright: 2019 www.hzcominfo.com Inc. All rights reserved.
 * 注意：本内容仅限于杭州匡信科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class ArrayTest {

    private int[] array;
    private int size;
    public ArrayTest(int capacity){
        this.array=new int[capacity];
        size=0;
    }

    public void insert(int elemnet,int index) throws Exception{
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("数组越界");
        }
        if(size>=array.length){
            resize();
        }
        for(int i=size-1;i>=index;i--){
            array[i+1]=array[i];
        }
        array[index]=elemnet;
        size++;
    }

    public void delete(int index){

    }

    public void resize(){
        int[] arrayNew=new int[array.length*2];
        System.arraycopy(array,0,arrayNew,0,array.length);
        array=arrayNew;
    }

    public void outPut(){
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) throws Exception{
        ArrayTest arrayTest=new ArrayTest(3);
        arrayTest.insert(3,0);
        arrayTest.insert(3,1);
        arrayTest.insert(3,2);
        arrayTest.insert(4,2);
        arrayTest.outPut();
    }
}
