package 交大慧谷.day10.j04TreeSet;

import java.util.TreeSet;

class Person implements Comparable<Person>{  //实现比较器接口
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //系统内部两两比较
    @Override
    public int compareTo(Person p) {
        if(this.age < p.age){
            return -1;
        }else if(this.age > p.age){
            return 1;
        }else{
            return this.name.compareTo(p.name);
        }
    }

    //系统内部两两比较
    @Override
    public boolean equals(Object obj) {
        if(this==obj){
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

    // 哈希值、哈希码
    @Override
    public int hashCode() {
        return this.name.hashCode()*this.age;
    }
}

public class Test02 {
    public static void main(String[] args){
        Person p1 = new Person("zhumei",31);
        Person p2 = new Person("tom",51);
        Person p3 = new Person("tom",51);

        TreeSet<Person> set = new TreeSet<Person>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
