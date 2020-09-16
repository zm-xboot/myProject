package 网易云课堂.j18类和对象;

public class Person3 {

    public void a(){
        Person2 p = new Person2();
        p.sleep();
        p.eatFood();
        p.eatFruit();
        Person2.eatFruit();   //类名直接调static方法
    }

    public void b(){

    }

    public static void main(String[] args){
        Person3 p = new Person3();
        p.a();
    }
}
