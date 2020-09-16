package 网易云课堂.j14二重循环;

public class Test03 {
    public static void main(String[] args){
        //打印直角三角形
//        System.out.println("*");   0  1
//        System.out.println("**");  1  2
//        System.out.println("***"); 2  3
//        System.out.println("****"); 3  4
//        System.out.println("*****"); 4  5

//        for(int i=0;i<5;i++){
//            for(int j=0;j<i+1;j++){    //外层与内层的数学关系：外层i行对应内层j=i+1个
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //打印倒三角形
        for(int i=4;i>=0;i--){
            for(int j=0;j<i+1;j++){    //外层与内层的数学关系：外层i行对应内层j=i+1个
                System.out.print("*");
            }
            System.out.println();
        }

        //打印倒三角形
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){    //外层与内层的数学关系：外层i行对应内层j=5-i个
                System.out.print("*");
            }
            System.out.println();
        }

        //打印菱形
//        System.out.println("   *");
//        System.out.println("  ***");
//        System.out.println(" *****");
//        System.out.println("*******");
//        System.out.println(" *****");
//        System.out.println("  ***");
//        System.out.println("   *");

        /**
         * 分析
         * i行外层   0   1   2   3
         * k空格内层 3   2   1   0   k=3-i
         * j* 内层  1   3   5   7   j=2*i+1
         */
        for(int i=0;i<4;i++){
            for(int k=0;k<3-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                if(j==0||j==2*i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        /**
         * 倒序拼装
         */
        for(int i=2;i>=0;i--){
            for(int k=0;k<3-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                if(j==0||j==2*i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
