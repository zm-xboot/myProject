package 个人编写练习.廖雪峰教程;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    static class Student{
        public String name;
        public int score;
        public Student(String name, int score){
            this.name = name;
            this.score = score;
        }
    }

    /**
     * 同一个类中的静态属性和方法可以直接在main方法里面使用
      */
    public static void main(String args[]){
        // 用Map来实现根据name查询某个Student的代码如下
        Student s1 = new Student("xiaomei", 31);
        Student s2 = new Student("xiaoqin", 30);
        // Map这种键值（key-value）映射表的数据结构，作用就是能高效通过key快速查找value（元素）
        Map<String, Student> map = new HashMap<>();  //Map<String, Student> map = new HashMap<String, Student>();
        map.put("xiaomei", s1); // 将"xiaomei"和Student实例映射并关联
        map.put("xiaoqin", s2);
        Student target_1 = map.get("xiaomei");  // 通过key查找并返回映射的Student实例
        System.out.println(target_1 == s1);    //True,同一个实例
        System.out.println(target_1.score);    //31
        Student target_2 = map.get("xiaoqin");   // 通过另一个key查找
        System.out.println(target_2.name+","+target_2.score);
        Student target_3 = map.get("xiaohua");  //不存在的KEY值
        System.out.println(target_3);  // 未找到返回null
        //Map<K, V>是一种键-值映射表，当我们调用put(K key, V value)方法时，就把key和value做了映射并放入Map。
        // 当我们调用V get(K key)时，就可以通过key获取到对应的value。如果key不存在，则返回null。
        // 和List类似，Map也是一个接口，最常用的实现类是HashMap
        // 如果只是想查询某个key是否存在，可以调用boolean containsKey(K key)方法。
        // 如果我们在存储Map映射关系的时候，对同一个key调用两次put()方法，分别放入不同的value，会有什么问题呢？
        // 重复放入key-value并不会有任何问题，但是一个key只能关联一个value
        // 在上面的代码中，一开始我们把key对象"apple"映射到Integer对象123，
        // 然后再次调用put()方法把"apple"映射到789，这时，原来关联的value对象123就被“冲掉”了
        // 实际上，put()方法的签名是V put(K key, V value)，如果放入的key已经存在，put()方法会返回被删除的旧的value，否则，返回null。
        // 始终牢记：Map中不存在重复的key，因为放入相同的key，只会把原有的key-value对应的value给替换掉。
        // 此外，在一个Map中，虽然key不能重复，但value是可以重复的：
        Map<String, Integer> map_1 = new HashMap<>();
        map_1.put("apple", 123);
        map_1.put("pear", 456);
        System.out.println(map_1.get("apple"));  // 123
        map_1.put("apple", 789);  // 再次放入apple作为key，但value变为789
        System.out.println(map_1.get("apple")); // 789
        Map<String, Integer> map_2 = new HashMap<String, Integer>();
        map_2.put("apple", 123);
        map_2.put("pear", 123);
        map_2.put("banana", 567);
        // 对Map来说，要遍历key可以使用for each循环遍历Map实例的keySet()方法返回的Set集合，它包含不重复的key的集合：
        for(String key : map_2.keySet()){
            Integer value = map_2.get(key);
            System.out.println(key + "=" + value);
        }
        // 同时遍历key和value可以使用for each循环遍历Map对象的entrySet()集合，它包含每一个key-value映射：
        for(Map.Entry<String, Integer> entry : map_2.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        // Map和List不同的是，Map存储的是key-value的映射关系，并且，它不保证顺序。
        // 在遍历的时候，遍历的顺序既不一定是put()时放入的key的顺序，也不一定是key的排序顺序。
        // 使用Map时，任何依赖顺序的逻辑都是不可靠的。
        // 以HashMap为例，假设我们放入"A"，"B"，"C"这3个key，遍历的时候，每个key会保证被遍历一次且仅遍历一次，
        // 但顺序完全没有保证，甚至对于不同的JDK版本，相同的代码遍历的输出顺序都是不同的！
        // 遍历Map时，不可假设输出的key是有序的！
    }
}
