package SJJG;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String,Object> param=new HashMap<>(4);
        param.put("1",3);
        param.put("2",4);
        System.out.println(param);
     }
}
