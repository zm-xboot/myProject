package 交大慧谷.day10.j06Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args){
        HashMap map = new HashMap();
        // 以键值对方式保存内容
        map.put("zhumei", 20);
        map.put("hello", 40);
        map.put("cet", 10);
        System.out.println(map);
        // get()通过键，获取值，如果未找到则返回null
        System.out.println(map.get("zhumei"));
        System.out.println(map.get("2345"));
        // map中键不能重复，如果重复则值被替换覆盖
        map.put("zhumei", 18);
        System.out.println(map);

        // 把所有的key转换成SET集合
        Set set = map.keySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            String s = (String) it.next();
            System.out.println(s+":"+map.get(s));
        }

        // 把所有value转换成Collection集合
        Collection c = map.values();
        Iterator it2 = set.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        //根据KE，删除值
        map.remove("hello");
        System.out.println(map);
    }
}
