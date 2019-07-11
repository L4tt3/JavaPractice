package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("kor", 100);
        map.put("mat", 90);
        map.put("eng", 80);

        System.out.println(map.get("kor"));
        System.out.println(map.get("sci"));

        map.remove("eng");

        printMap(map);

        Map<String, List<String>> map1 = new HashMap<>();
        List<Map<String, String>> map2 = new ArrayList<>();

    }

    private static void printMap(Map<String, Integer> map){
        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
    }

}
