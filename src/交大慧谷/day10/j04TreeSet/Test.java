package 交大慧谷.day10.j04TreeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args){
        // 有序存放
        TreeSet set = new TreeSet();
        set.add("c");
        set.add("w");
        set.add("a");
        set.add("d");
        set.add("a");
        set.add("d");
        System.out.println(set);
    }
}
