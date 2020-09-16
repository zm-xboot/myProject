package 网易云课堂.j19方法的返回值和参数问题;

public class People {

    /**
     * 有参 无参
     * 无参方法实现的是个共性问题
     * 有参实现个性化,参数越多越个性化
     */

    /**
     * 数据类型：简单类型（8个，int,byte,char）、引用类型（String,数组）（引用地址）
     *
     */

    public void sleep(){
        System.out.println("睡觉");
    }

    // String name = "zs";
    // 形参
    public void sleep1(String name, String place, String time){
        System.out.println(name+"在"+place+"睡觉..."+time);
    }

    // 数组，参数类型都是一样的可以写成数组
    // 数组infos = {name,place,time}
    public void sleep2(String[] infos){
        infos[1] = "jiali";
        System.out.println(infos[0]+"在"+infos[1]+"睡觉..."+infos[2]);
    }

    // 对象，参数类型不一样的情况下写成对象类
    // 多个类型相同的元素->数组
    // 多个类型不同的元素-> 对象/类

    /**
     * class Person{
     *  String name;
     *  int age;
     *  double height;
     * }
     * @param : args
     */
    public void sleep3(String name,String place, int time){
        System.out.println(name+"在"+place+"睡觉..."+time);
    }

//    MyInfo info = new MyInfo();
////    对象有属性值，类没有属性值
//    info.name = "张三";
//    info.place = "宾馆";
//    info.time = "22";
    public void sleep4(MyInfo info){   // 实参给形参  MyInfo info = ...
        System.out.println(info.name+"在"+info.place+"睡觉..."+info.time);
    }

    public static void main(String[] args){
//        People zs = new People();
//        zs.sleep();
//
//        People ls = new People();
//        ls.sleep();

        People zs = new People();
        // 实参
//        zs.sleep1("zs", "家里", "23:00");

//        String[] infos = {"zs", "家里", "23:00"};
//        infos[0] = "张三";
//        zs.sleep2(infos);

        MyInfo info = new MyInfo();
        //    对象有属性值，类没有属性值
        info.name = "张三";
        info.place = "太平洋";
        info.time = 92;
        zs.sleep4(info);


        People ls = new People();

////        ls.sleep1("ls", "宾馆", "22:00");

//        String[] lsinfos = {"ls", "宾馆", "22:00"};
//        ls.sleep2(lsinfos);

        MyInfo lsinfo = new MyInfo();
        //    对象有属性值，类没有属性值
        lsinfo.name = "李四";
        lsinfo.place = "南极";
        lsinfo.time = 89;
        ls.sleep4(lsinfo);
    }
}
