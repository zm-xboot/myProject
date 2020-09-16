package 网易云课堂.j14二重循环;

public class Test05 {
    public static void main(String[] args){
        /**
         * break  continue:仅仅对当前层次的循环有效
         */
        for(int i=0;i<10;i++){
            System.out.print("外层："+i);
            for(int j=0;j<10;j++){
                if(j==3){
                    break;   //执行到第三个后跳出中断循环，往后的循环不再执行
//                    continue;   //执行到第三个就跳过，继续执行后面的循环
                }
                System.out.print("\t内层："+j);
            }
            System.out.println();
        }

    }
}
