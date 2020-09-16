package 交大慧谷.day10.j06Map;

import java.util.TreeMap;

public class Test02 {
    public static void main(String[] args){
        TreeMap map = new TreeMap();
        map.put(9, "abc");
        map.put(3, "opq");
        map.put(7, "xyz");
        map.put(1, "xyz");
        System.out.println(map);
    }
}
