package 交大慧谷.day10.j05迭代器;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        //通过迭代器，输出集合
        Iterator it = list.iterator();
        while(it.hasNext()){   //替代了for循环语句
            System.out.println(it.next());
        }

//        Iterator<String> it2 = list.iterator();
//        while(it2.hasNext()){
//            String s = it2.next();
//            if(s.equals("c")){
//                it2.remove();     //迭代器删除
//            }
//            System.out.println(list);
//        }

        // 用集合自带的remove:
        // 会破坏原始给到迭代器时集合的结构
        // 所以如果要在输出过程中删除元素，必须使用迭代器本身的remove
//        Iterator<String> it3 = list.iterator();
//        while(it3.hasNext()){
//            String s = it3.next();
//            if(s.equals("c")){
//                list.remove("c");
//            }
//        }
//        System.out.println(list);

//        Iterator<String> it4 = list.iterator();
//        while(it4.hasNext()){
//            String s = it4.next();
//            System.out.println(s);
//        }




    }
}
