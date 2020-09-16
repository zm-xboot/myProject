package 个人编写练习.廖雪峰教程;

import java.util.Arrays;

public class FX_1 {
    public static void main(String[] arg){
        // Arrays.sort(Object[])可以对任意数组进行排序, 但待排序的元素必须实现Comparable<T>这个泛型接口：
        String[] ss = new String[]{"Zhu", "Apple", "Tom", "Bob"};
        Arrays.sort(ss);
        System.out.println(Arrays.toString(ss));

        Person[] person = new Person[]{
                new Person("W", 8),
                new Person("B", 5),
                new Person("Q", 9)
        };
        Arrays.sort(person);
        System.out.println(Arrays.toString(person));
    }

    static class Person implements Comparable<Person>{
        String name;
        int score;
        Person(String name, int score){
            this.name = name;
            this.score = score;
        }
        @Override
        public int compareTo(Person o) {
//            return this.name.compareTo(o.name);
            return this.score-o.score;
        }
        public String toString(){
            return this.name + "," + this.score;
        }
    }
}
