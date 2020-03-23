package SJJG;

import a.C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class UrlSortTest {
    public static void main(String[] args) {
        List<String> urls=new ArrayList<>();
        for(int i=0;i<10000;i++){
            urls.add(String.valueOf(new Random().nextInt(10)));
        }
        List<String> urls2=new ArrayList<>();
        for(int i=0;i<10000;i++){
            urls2.add(String.valueOf(new Random().nextInt(10)));
        }

        Map<String,Integer> map=new HashMap<>();
        for(String url:urls){
            if (map.containsKey(url)) {
             map.put(url,map.get(url)+1);
            }else {
                map.put(url,1);
            }
        }

        System.out.println(map);
        List<Map.Entry<String,Integer>> entries=new ArrayList<>(map.entrySet());
        Collections.sort(entries,new MapValueComparator());
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();
        for(Map.Entry<String,Integer> entry:entries){
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }
        System.out.println(linkedHashMap);
//        List<Integer> integers=new ArrayList<>();
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//           integers.add(entry.getValue());
//        }
//        Collections.sort(integers);
//        System.out.println(integers);
//        for(Integer integer:integers){
//            for (Map.Entry<String, Integer> entry : map.entrySet()) {
//                if(entry.getValue().equals(integer)){
//                    System.out.println(entry.getKey());
//                }
//            }
//        }
    }

    static  class MapValueComparator implements Comparator<Map.Entry<String, Integer>> {

        @Override
        public int compare(Map.Entry<String, Integer> me1, Map.Entry<String, Integer> me2) {

            return me1.getValue().compareTo(me2.getValue());
        }
    }
}
