package SJJG;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class HashMapNotSafe {
    public static void main(String[] args) {
        final Map<Integer,String> map=new HashMap<>();
        final Integer keyValue=0b1111_1111_1111_1111;
        final String value="v";
        map.put(keyValue,value);
        new Thread(() ->{
            IntStream.range(0,keyValue).forEach(key ->map.put(key,value));
        }).start();
        while (true){
            if(null==map.get(keyValue)){
                throw new RuntimeException("HashMap is not thread safe.");
            }
        }
    }
}
