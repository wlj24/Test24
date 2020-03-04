package lianxi.xmg;

import java.util.HashSet;
import java.util.Set;

public class ShortSet {
    public static void main(String[] args) {

        Set<Short> shorts=new HashSet<>();
        for(short i=0;i<100;i++){
            shorts.add(i);
            //这里发生低精度到高精度 short 变integer short -integer=integer
            shorts.remove(i-1);
        }
        System.out.println(shorts.size());
    }
}
