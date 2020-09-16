package 网易云课堂.j09多重及嵌套选择与switch;

public class Test01 {
    public static void main(String[] args){
        /**
         * if(){}else{}
         * if(xxx) A ...else B...是对立事件，非此即彼
         * 多重if:多重选择
         * if(){
         *
         * }else if(){
         *
         * }else if(){
         *
         * }else{
         *
         * }
         */
        // >=90 优秀  >=80 良好  >=60及格，否则不及格
        int score = 88;
        if(score>=90){
            System.out.println("优秀");
        }else if(score>=80){
            System.out.println("良好");
        }else if(score>=60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
        // 分析时，可借助与数轴
        // 多重if, 编写顺序：先写严格的条件判断（>/>=，数字越大，越优先判断，</<=数字越小，越优先判断）
        int bug = 5 ;
        if(bug<3){
            System.out.println("A");
        }else if(bug<5){
            System.out.println("B");
        }else if(bug<10){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }
}
