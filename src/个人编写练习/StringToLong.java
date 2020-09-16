package 个人编写练习;

public class StringToLong {
    public @interface MyAn{         //定义一个注解
        int a() default 1;
        String b() default "zhumei架构设计";
    }

    @MyAn(a=3, b="哈哈")
    public static class MyTest{
        void print(String sss){
            System.out.println(sss);
        }
    }

    // java 将String字符串转换为List<Long>类型,Stirng类型如1,2,3,4等这样的形式
    public static void main(String[] args){
        String ss = "1,2,3,4";
        String[] ww = ss.split(",");
        for(int i =0; i<ww.length; i++){
            System.out.println(ww[i]);
        }
        String bb = "a ,e , i";
        String BB = bb.replaceAll(" ","");
        System.out.println(BB);

        MyTest t = new MyTest();
        t.print("什么鬼！！");
    }
}
