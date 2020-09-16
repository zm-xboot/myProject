package 交大慧谷.day10.j01对象反序列化;

import java.io.*;

class Person implements Serializable {
    //通过transient关键字，可以不把该属性保存到外部文件
//    private transient String name;
    private String name;
    private int age;
    public Person(String name, int age){
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
}

public class Test {
    public static void main(String[] args) throws Exception{
        // 序列化
//        File file = new File("/Users/eleme/Downloads/Hello/person.txt");
//        FileOutputStream fos = new FileOutputStream(file);
//        Person p1 = new Person("hello", 3);
//        // 对象输出流
//        ObjectOutputStream op = new ObjectOutputStream(fos);
//        op.writeObject(p1);
//        // 反着关闭流
//        op.close();
//        fos.close();

        // 反序列化
        File file = new File("/Users/eleme/Downloads/Hello/person.txt");
        FileInputStream fi = new FileInputStream(file);
        ObjectInputStream oi = new ObjectInputStream(fi);
        Person p = (Person)oi.readObject();
        System.out.println(p);
        oi.close();
        fi.close();
    }
}
