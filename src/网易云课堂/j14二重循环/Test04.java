package 网易云课堂.j14二重循环;

public class Test04 {
    public static void main(String[] args){
        /**
         * 九九乘法口诀表：
         * 外部：行
         * 内部：每一行内部的表达式
         * i:0  1  2
         * j:1  2  3   j=i+1
         */

        for(int i=0;i<9;i++){
                for(int j=0;j<i+1;j++){
                    System.out.print((j+1)+"*"+(i+1)+"="+(j+1)*(i+1)+"\t\t");  // \t为占位符
                }
                System.out.println();
            }
    }
}
