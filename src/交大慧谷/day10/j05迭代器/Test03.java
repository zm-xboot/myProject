package 交大慧谷.day10.j05迭代器;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Test03 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("a");
        v.add("b");
        v.add("c");
        v.add("d");
        v.add("e");

        Enumeration en = v.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement()+"、");
        }
    }
}
