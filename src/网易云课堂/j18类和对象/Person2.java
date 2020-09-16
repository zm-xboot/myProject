package 网易云课堂.j18类和对象;

public class Person2 {

    //属性。。。


    //方法

    /**
     * 方法的调用的常见情况：
     * 同一个类中：
     * 都有static,或都没有static,没有的调有的:直接调用有static
     * =======有static不能直接调用没有static的方法。=======
     * 不在同一个类中：
     * 万能方法： new 对象，对象.方法();
     *  Person2 p = new Person2();
     *  p.eatFruit();
     * 调用的另一个方法必须是静态的：
     * Person2.eatFruit();   //类名.方法()  其中的方法必须是static修饰的
     * static方法是类级别的，属于类
     * 非static方法是对象级别的，属于对象
     * 对象.static方法()  对象.非static方法()
     *                   类.static方法()
     * 类有的，对象自然有：
     * 对象有的，类不一定有
     * 静态方法
     * public static void eatFruit(){...}
     * 非静态方法
     * public void eatFruit(){...}
     */


    public static void eatFruit(){
        System.out.println("吃水果。。。");
    }

    public void eatFood(){
        System.out.println("吃主食。。。");
        eatFruit();
    }

    public void sleep(){
        System.out.println("睡觉。。。");
    }

    public static void main(String[] args){
        Person2 p = new Person2();
        p.eatFood();
    }
}
