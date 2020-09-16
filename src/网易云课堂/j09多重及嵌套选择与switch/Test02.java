package 网易云课堂.j09多重及嵌套选择与switch;

public class Test02 {
    public static void main(String[] args){
        /**
         * if(){
         *     if(){
         *
         *     }
         * }else{
         *
         * }
         *
         * 区分：
         * 多重if和嵌套if:判断是否是同一件事情，如果是同一件用多重；否则（不是同一件事情），用嵌套
         */
        //10秒以内进入角色；男，男子组决赛；女，女子组决赛
//        double sec = 9.8;
//        char sex = '女';
//        if(sec<=10){
//            if(sex=='男'){
//                System.out.println("进入男子组决赛");
//            }else{
//                System.out.println("进入女子组决赛");
//            }
//        }else{
//            System.out.println("淘汰。。。");
//        }

        // 1 夏令营   2 笔记本  3 U盘
//        int rank = 1;
//        if(rank==1){
//            System.out.println("夏令营");
//        }else if(rank==2){
//            System.out.println("笔记本");
//        }else if(rank==3){
//            System.out.println("U盘");
//        }

        /**
         * switch会用rank和所有的case匹配，如果匹配成功，则执行相应case后的语句，直到遇到break结束；
         * 在switch中，如果rank和所有的case都不匹配，则执行default..
         * switch后支持的表达式类型：int short byte char String 枚举
         * case后面的值必须为常量，case值不可重复
         * default可省略
         * switch只有遇到break和最后}才结束；否则不会结束
         * 多重if。。和switch区别？
         * 如果判断的是区间值，则用多重if..（switch无法实现）,如果是离散值/单点值，则用switch。。
         *
         */
        int rank = 2;
        switch(rank){
            case 1:
                System.out.println("笔记本电脑");
                break;
            case 2:
                System.out.println("夏令营");
                break;  //break:表示整个switch全部结束
            case 3:
                System.out.println("U盘");
                break;
            default:  //else...
                System.out.println("不奖励。。。");
                break;
        }

    }
}

