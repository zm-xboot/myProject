package 交大慧谷.day09.j08对象序列化;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/eleme/Downloads/Hello/10.txt");
        FileOutputStream fos = new FileOutputStream(file);
        Person p = new Person("zhumei", 10);
        // 对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p);
    }
}

// 要完成对象序列化，必须实现Serializable类
class Person implements Serializable{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
