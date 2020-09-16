package 交大慧谷.day10.j06Map;

import java.util.HashMap;

class Students {
    private String name;
    private int age;

    public Students(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    //equals和hashcode方法必须复写，用来验证是否为相同元素
    //如果需要进行排序比较，则需要实现Comparable接口，实现compareTo方法
    //如果需要进行克隆的，则需要实现Cloneable接口，复写clone方法
    //如果需要进行对象序列化，则需要实现Serializable接口
    @Override
    public int hashCode() {
        return this.name.hashCode()*this.age;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if(!(o instanceof Students)){
            return false;
        }

        Students s = (Students) o;
        if(this.name.equals(s.name)&&this.age==s.age){
            return true;
        }
        return false;
    }
}

public class Test04 {
    public static void main(String[] args){
        //对于自定义类来说，如果key为匿名对象，则该类必须复写equals和hashCode方法来完成重复元素的验证

        HashMap map = new HashMap();
        map.put(new Students("zhumei", 18), "werty");
        System.out.println(map.get(new Students("zhumei", 18)));

        //系统类就不需要复写equals和hashCode方法了,可以直接使用KEY为匿名对象
        map.put(new String("567"), 10);
        System.out.println(map.get(new String("567")));

    }
}
