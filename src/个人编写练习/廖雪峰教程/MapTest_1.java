package 个人编写练习.廖雪峰教程;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest_1 {
    public static void main(String[] args){
        List<Student> list = new ArrayList<>();
//        List<Student> list = List.of(new Student("Bob", 78), new Student("Alice", 85), new Student("Brush", 66), new Student("Newton", 99));
        list.add(new Student("Bob", 78));
        list.add(new Student("Alice", 85));
        list.add(new Student("Brush", 66));
        list.add(new Student("Newton", 99));
        Students holder = new Students(list);
        System.out.println(holder.getScore("Bob"));
        System.out.println(holder.getScore("Bob") == 78 ? "测试成功!" : "测试失败!");
        System.out.println(holder.getScore("Alice") == 85 ? "测试成功!" : "测试失败!");
        System.out.println(holder.getScore("Tom") == -1 ? "测试成功!" : "测试失败!");
    }


    static class Students{
        List<Student> list;
        Map<String, Integer> cache;

        Students(List<Student> list){
            this.list = list;
            this.cache = new HashMap<>();
        }
        /**
         * 根据name查找score，找到返回score，未找到返回-1
         */
        int getScore(String name){
            // 先在Map中查找：
            Integer score = this.cache.get(name);
            // 如果在Map中找不到，再在List中找
            if (score == null){
                // TODO:
                score = this.findInList(name);
                // 如果在LIST中找到了，则更新到MAP中
                if(score != null){
                    this.cache.put(name, score);
                }
            }
            // 如果都找不到，则返回-1
            return score == null ? -1 : score.intValue();    // 三元运算符，如果?前面的式子为真，那么就返回冒号:左边的值；否则返回右边的值
        }

        Integer findInList(String name){
            for(Student ss : this.list){
                if(ss.name.equals(name)){
                    return ss.score;
                }
            }
            return null;
        }
    }

    static class Student{
        String name;
        int score;

        Student(String name, int score){
            this.name = name;
            this.score = score;
        }
    }
}
