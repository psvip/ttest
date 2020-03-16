package test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(10);
        Map<Integer, String> map1 = new HashMap<>(10);

        map.put(0, "aaa");
        map.put(1, "bbb");
        map1.put(10, "ccc");
        map1.put(3, "ddd");
        map.putAll(map1);
        //遍历输出map
        map.forEach((name,a)-> System.out.println(name+a));
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        for (Integer  key : map.keySet()) {
            System.out.println(key);
        }
        for(String value :map.values()){
            System.out.println(value);
        }
    }
}
