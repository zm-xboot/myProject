package 个人编写练习.廖雪峰教程;

import java.util.ArrayList;
import java.util.List;

public class FX {
    // 泛型
    public class ArrayListW<T>{
        private T[] array;
        private int size;
        public void add(T e){
        }
        public void remove(int index){

        }
        public T get(int index){
            return null;
        }
    }

    public static void main(String[] args){
        // 使用ArrayList时，如果不定义泛型类型时，泛型类型实际上就是Object：
        List list = new ArrayList();
        list.add("Hello");
        list.add("World");
        String first = (String)list.get(0);
        String second = (String)list.get(1);

        List<String> list1 = new ArrayList<String>();
        list1.add("zhu");
        list1.add("mei");
        String x = list1.get(0);
        String m = list1.get(1);

        List<Number> list2 = new ArrayList<Number>();
        list2.add(124);
        list2.add(3567);
        Number s = list2.get(0);
        Number z = list2.get(1);

        List<String> sd = new ArrayList<>();

        System.out.print(s+":"+z);

    }
}
