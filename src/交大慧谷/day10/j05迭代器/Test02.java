package 交大慧谷.day10.j05迭代器;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        // ListIterator只能用于List接口，默认指针在最左边
        ListIterator<String> it = list.listIterator();
        // 从左往右输出
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // 从右往左输出，前提条件：一开始指针是在最左边，所以必须先通过next，
        //把指针移动到最右边，才能从右往左输出
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }

        //增强型for,适用于集合+数组
        // foreach
        for(Object s:list){
            System.out.println(s);
        }

        System.out.println("\n----------------------------------------");
        int[] a = {1,2,3,4,5};
        for(int t:a){
            System.out.print(t+",");
        }

    }
}
