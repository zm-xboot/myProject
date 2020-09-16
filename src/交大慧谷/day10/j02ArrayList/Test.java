package 交大慧谷.day10.j02ArrayList;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        // 增
        list.add("hello");
        list.add("world");
        list.add("abc");
        list.add("ert");
        // 在指定位置，在第0位增加
        list.add(0, "haha");
        System.out.println(list);
        // 删
        //删除指定内容
        list.remove("abc");
        System.out.println(list);
        //删除指定索引、下标
        list.remove(2);
        System.out.println(list);
        // 改：set(索引，内容)
        list.set(0,"xyz");
        System.out.println("修改之后的list:"+list);
        // 查
        // 根据索引获取数据
        list.get(1);
        System.out.println(list.get(1));
        // 获取长度,相等于数组的length
        System.out.println(list.size());

        // 获取所有元素
        for(int i = 0; i<list.size(); i++){
            System.out.println("输出list集合第"+i+"位值:" + list.get(i));
        }

        // 集合转换成对象数组：toArray()
        Object[] obj = list.toArray();
        for(int i = 0; i<obj.length; i++){
            System.out.println(obj[i]);
        }

        //判断元素是否存在：contains(元素)
        //以每个元素位单位来判断
        System.out.println(list.contains("hello"));

        //截取集合范围：[第一个参数，第二个参数)
        System.out.println(list.subList(1,2));  //左闭右开

        ArrayList list2 = new ArrayList();
        list2.add("zhumei");
        list2.add("jiaoda");
        list2.add("huigu");

        //组合LIST,以集合为单位传参数做增加OR删除
        list.addAll(list2);
        System.out.println(list);

        list.removeAll(list2);
        System.out.println(list);
    }
}
