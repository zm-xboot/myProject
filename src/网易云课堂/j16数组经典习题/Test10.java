package 网易云课堂.j16数组经典习题;

public class Test10 {
    public static void main(String[] args){
        //求5个学生的最高分、最低分
        /**
         * {45,89,20,98,34,65,54}; ->排序
         * {20,89,45,,34,54,65,98};
         * 最小值：数组名【0】   最大值：数组名【】
         */
        int[] score = {45,89,20,98,34,65,54};
//        System.out.println(score[0]);
//        System.out.println(score[score.length-1]);

        // 打擂台思想: 假设第一个上台的就是擂主
        int max = score[0];
        /**
        if(score[1]>max){
            max = score[1];
        }
        if(score[2]>max){
            max = score[2];
        }
        //
        //
        if(score[score.length-1]>max){
            max = score[score.length-1];
        }
         */
        for(int i=1;i<score.length;i++){
            if(score[i]>max){
                max = score[i];
            }
        }
        System.out.println("最大值："+max);

        int min = score[0];
        for(int i=1;i<score.length;i++){
            if(score[i]<min){
                min = score[i];
            }
        }
        System.out.println("最小值："+min);
    }
}
