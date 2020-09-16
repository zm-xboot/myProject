package 网易云课堂.j25StringBuffer的使用;

public class Test02 {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("abc"); //等于String str = "abc"
        // str+="aaa"
        sb.append("aaa");  //追加
        sb.insert(2, "eee");  //插入
        System.out.println(sb);
        sb.reverse();  //逆序
        System.out.println(sb);

        // String-StringBuffer各自独立，可以互相转换
        // String->StringBuffer
        String a = "Hello";
        StringBuffer sb2 = new StringBuffer(a);

        //StringBuffer ->String
        String b = sb2.toString();
        System.out.println(b);
        String c = b + "";   // 任何类型遇到字符串，都会转为字符串
        System.out.println(b);
    }
}
