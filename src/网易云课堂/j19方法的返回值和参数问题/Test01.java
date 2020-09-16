package 网易云课堂.j19方法的返回值和参数问题;

public class Test01 {
/**
 * 静态方法
 * public static void eatFruit(){...}
 * 非静态方法
 * public void eatFruit(){...}
 * 方法：
 * 动作、功能
 * 方法需要写在类中
 * 1\非静态方法调用，对象.方法()
 * 2\静态方法调用，类名.static方法()/对象.方法()
 * 3\如果在同一个类中：可以直接调用 class A{  a(); b();};
 * public void a(){
 *     b();
 * }
 * 返回值：
 *  有返回值   public int a(){
 *      return 1;
 *  }
 *  public String a(){
 *      return "zs";
 *  }
 *  public 返回值类型 方法名(){
 *      return 类型对应的数据
 *  }
 *
 *  无返回值（返回值为void）
 *
 * 在调用有返回值的方法时，需要接收 String xx = a1();
 *
 * main(){...}
 * 面向对象编程：类和对象、将功能独立的写在方法中
 * a()
 * b()
 * c()
 */
    public void a(){
        String name = "zs";
        System.out.println(name);
    }

    public String a1(){
        String name = "zs";
//        System.out.println(name);
        return name;
    }

    public void b(){
//        a();
        String name = a1();
        System.out.println("b:" + name);
    }

    public static void main(String[] args){
        //静态方法只能调另一个静态的static方法
        //万能写法，对象.方法()
        Test01 t = new Test01();
        t.b();
    }
}
