package SJJG;
/**
 *
 * @ClassName SortArray
 * @author wanglianjie
 * @Description: 有序数组
 * @date:   2020/3/9 17:35
 * @since V1.0
 *
 * @Copyright: 2019 www.hzcominfo.com Inc. All rights reserved.
 * 注意：本内容仅限于杭州匡信科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class SortArray {
    private int[] array;
    private int size;
    public SortArray(int capacity){
        this.array=new int[capacity];
        size=0;
    }

    public void insert(int elemnet){
        if(size>=array.length){
            resize();
        }
        if(size==0){
            array[0]=elemnet;
        }else if(size>0){

        }
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
}
