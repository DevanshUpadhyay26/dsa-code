package JavaCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
//        Map<Integer, String> map= new HashMap<>();
        Map<Integer, String> map= new TreeMap<>();


        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five");
        System.out.println(map);

//         map.putIfAbsent(2, "hehehe");
//
//        for(Map.Entry<Integer, String> e: map.entrySet()){
//
//
//            System.out.println(e);
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }

//        for(Integer key: map.keySet()){
//            System.out.println(key);
//        }
//        for(String val: map.values()){
//            System.out.println(val);
//        }


//        System.out.println(map.containsValue("Two"));
//        System.out.println(map.containsKey(2));
    }
}
