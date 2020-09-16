package 交大慧谷.day10.j03HashSet;

import java.util.HashSet;

public class Test {
    public static void main(String[] args){
        // 散列存放,有java自己的一套标准
        HashSet set = new HashSet();
        set.add("a");
        set.add("b5678");
        set.add("cghjjk");
        set.add("d");
        set.add("a");
        set.add("d");
        System.out.println(set);
    }
}
