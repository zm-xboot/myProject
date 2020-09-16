package 交大慧谷.day08.j02大数操作;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test {
    public static void main(String[] args){
        String a = "99999999999999999999999999999999999";
        String b = "99999999999999999999999999999999999";
        BigInteger bi1 = new BigInteger(a);
        BigInteger bi2 = new BigInteger(b);
        // 加法
        System.out.println(bi1.add(bi2));
        // 减法
        System.out.println(bi1.subtract(bi2));
        // 乘法
        System.out.println(bi1.multiply(bi2));
        // 除法
        System.out.println(bi1.divide(bi2));

//         BigDecimal  小数的大数计算
        String a2 = "12345.07891";
        String b2 = "3333.5101";
        BigDecimal bd1 = new BigDecimal(a2);
        BigDecimal bd2 = new BigDecimal(b2);
        // 四舍五入保留对象
        // divide(实例化对象，保留位数，模式)
        System.out.println(bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP));
    }
}
