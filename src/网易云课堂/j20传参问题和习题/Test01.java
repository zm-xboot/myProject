package 网易云课堂.j20传参问题和习题;

public class Test01 {
    //语法
    public static void myMethod(String a, int b, double c){    //参数列表   // double c= 12
        System.out.println(a+","+b+","+c);
    }

    /**
     * public void xx(参数列表)
     * 参数类型、参数值
     * 参数列表必须满足：类型、个数、顺序完全一致
     * @param args
     */

    public static void main(String[] args){
        myMethod("hello world", 10, 12);
    }
}
