package SJJG;

import java.util.HashMap;
import java.util.Map;

public class Kj {
    public static void main(String[] args) {
        int[] a={3,1,2,5,4,9,7,2};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i==j){
                    continue;
                }
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                    break;
                }
            }

        }

        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                System.out.println(a[i]);
            }else {
                map.put(a[i], 1);
            }
        }

    }
}
