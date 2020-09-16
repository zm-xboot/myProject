package 网易云课堂.j14二重循环;

public class Test02 {
    //打印矩形
    public static void main(String[] args){
//        System.out.println("**************");
//        System.out.println("**************");
//        System.out.println("**************");
//        System.out.println("**************");
//        System.out.println("**************");
        // 每一行的内部：很多*，每一行内部循环
        //行本身也是循环
        for(int j=0;j<3;j++){
            for(int i=0;i<7;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
