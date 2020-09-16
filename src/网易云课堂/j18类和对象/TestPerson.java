package 网易云课堂.j18类和对象;

public class TestPerson {
    public static void main(String[] args){
//        类 对象 = new 类();
        // 栈，对象的引用----堆，对象
        Person zs = new Person();   // 创建一个内存地址，0x12abc,zs指向这个内存地址0x12abc，"遥控器---电视机"的关系
        // zs是引用类型
        // 一般而言，对象是指堆中的东西。。。
        // 栈里面的称为引用
        // 引用：相当于C语言的指针，持有对象的内存地址
        // 属性：就是全局变量
        // 全局变量：方法以外，类以内；有初始值（数据类型的默认值 int 0）
        // 局部变量：方法内部;没有初始值，在使用前必须赋初始值
        // 局部变量可以和全局变量重名，并且局部变量优先级高
        // new:实例化
        // 对象使用前必须先实例化(new)
        /**
         *
         */

        zs.name = "张三";
        zs.age = 28;

//        对象.属性
        System.out.println(zs.name);
        System.out.println(zs.age);

//        对象.方法
        zs.eat();
        zs.sleep();

        /**
         * 方法是多个对象共享的
         * 属性 是各个对象独有的
         *
         */

        Person ls = new Person();
        ls.name = "李四";
        ls.age = 28;

//        对象.属性
        System.out.println(ls.name);
        System.out.println(ls.age);

//        对象.方法
        ls.eat();
        ls.sleep();


    }
}
