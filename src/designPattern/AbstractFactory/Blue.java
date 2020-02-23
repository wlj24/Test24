package designPattern.AbstractFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }

    public static void main(String[] args) {
        Map<String,Object> param=new HashMap<>();
        param.put("s","1");
        param.put("a","3");
        param.put("badsaa","2");

        param.put("x","3");
        System.out.println(param);

        for(Map.Entry<String,Object> entry:param.entrySet()){
            System.out.println(entry.getKey());

        }
        param.put("h","3");
        System.out.println(param);
        for(Map.Entry<String,Object> entry:param.entrySet()){
            System.out.println(entry.getKey());

        }

        String a="ab";
        String b="a"+"b";
        String c=new String("ab");
        System.out.println(a==b);
    }
}
