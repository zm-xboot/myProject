package 交大慧谷.day10.j06Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        if(this.age>p.age){
            return -1;
        }else if(this.age<p.age){
            return 1;
        }else{
            return this.name.compareTo(p.name);
        }
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()*this.age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Person)){
            return false;
        }
        Person p = (Person) obj;
        if(this.name.equals(p.name)&&this.age==p.age){
            return true;
        }
        return false;
    }
}

public class Test03 {
    public static void main(String[] args){
        Person p1 = new Person("jahd", 20);
        Person p2 = new Person("fgh", 10);
        Person p3 = new Person("dfgh", 40);
        // 要求KEY已经排好序了，才能使用
        TreeMap map = new TreeMap();
        map.put(p1, "abc");
        map.put(p2, "opq");
        map.put(p3, "xyz");
        System.out.println(map);

        //迭代Map类型
        // 把每个键值对整体作为一个值存入Set
        // map的key-value实体就是Map.Entry
        Set<Map.Entry> set = map.entrySet();   //拿到map所有的实体集合塞进set
        // 把set交给迭代器处理
        Iterator<Map.Entry> it = set.iterator();
        // 迭代输出
        while(it.hasNext()){
            // 获取每个Map实体
            Map.Entry entry = it.next();
            // 通过实体获取key和value
            System.out.println(entry.getKey()+","+entry.getValue());
        }


    }
}
