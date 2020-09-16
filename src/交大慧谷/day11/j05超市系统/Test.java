package 交大慧谷.day11.j05超市系统;

import java.util.ArrayList;

public class Test {
    //现在要求实现一个超市商品的管理程序，可以添加商品、查询商品信息，商品下架操作，问此程序该如何设计？
    public static void main(String[] args){
        Supermarket sm = new Supermarket("全家");
        Apple a1 = new Apple("红苹果", 10);
        Apple a2 = new Apple("绿苹果", 12);
        Apple a3 = new Apple("红黄苹果", 15);

        sm.add(a1);
        sm.add(a2);
        sm.add(a3);

        System.out.println(sm.getFruits());

        ArrayList<String> list = sm.search("红");
        System.out.println(list);

        sm.remove(a1);
        System.out.println(sm.getFruits());

    }
}
