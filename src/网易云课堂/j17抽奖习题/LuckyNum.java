package 网易云课堂.j17抽奖习题;

import java.util.Scanner;

public class LuckyNum {
    public static void main(String[] args){
        /**
         * 抽奖游戏
         * 1、注册 2、登录 3、抽奖
         * 注册时，系统会自动生成一个4位随机数作为卡号
         * 登录成功后，才能抽奖
         * 抽奖时，系统生成6个4位随机数作为幸运数字
         * 如果会员卡号是其中之一，则成为本日幸运会员：
         * 否则不是幸运会员
         */

        //开始注册
        System.out.println("开始注册");
        String registName = "";
        String registPwd = "";
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名");
        registName = input.next();   // 键盘输入字符串
        System.out.println("请输入密码");
        registPwd = input.next();
        System.out.println("注册完毕。。。");
        int vipNum = (int)(Math.random()*9000)+1000;    //Math.random()：产生一个[0，1)之间的随机数。

        //开始登录
        System.out.println("开始登录");
        String loginName = "";
        String loginPwd = "";
        System.out.println("登录用户名");
        loginName = input.next();   // 键盘输入字符串
        System.out.println("登录密码");
        loginPwd = input.next();

        if(loginName.equals(registName) && loginPwd.equals(registPwd)){
            System.out.println("登录成功。。。");
            System.out.println("开始抽奖啦。。。");

            //产生6个幸运号码
            int[] luckyNums = new int[6];
            for(int i=0;i<6;i++){
                luckyNums[i] = (int)(Math.random()*9000)+1000;
                System.out.println("幸运号码是："+luckyNums[i]+"\t");
            }
            System.out.println("你的vipNum："+vipNum);

            boolean flag = false;
            //判断vipNum，是否存在于luckyNums之中
            for(int i=0;i<6;i++){
                if(vipNum==luckyNums[i]){
                    flag = true;  //中奖
                }
            }
            if(flag){
                System.out.println("中奖");
            }else{
                System.out.println("没中奖");
            }
        }else{
            System.out.println("用户名或密码输入有误！");
        }
    }
}
