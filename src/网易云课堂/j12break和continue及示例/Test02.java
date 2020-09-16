package 网易云课堂.j12break和continue及示例;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args){
        //用户登录验证（zs,abc）,验证次数最多3次
        boolean flag = false;
        Scanner input = new Scanner(System.in);
        int i=0;
        for(;i<3;i++){
            System.out.println("第"+i+"请输入帐号：");
            String name = input.next();
            System.out.println("第"+i+"请输入密码：");
            String password = input.next();

            if(name.equals("zs")&&password.equals("abc")){
//                flag = true;
                break;
            }else{
                System.out.println("登录失败！用户名、密码错误！");
            }
        }

        // 方法一：使用boolean flag来标记两种情况的判断
//        if(flag){ // flag==true
//            System.out.println("登录成功！");
//        }else{
//            System.out.println("登录次数超过3次，请明天再试");
//        }

        // 方法二：
//        if(!flag==true){  //循环退出的可能性：要么成功；要么3次全部失败
//            System.out.println("登录次数超过3次，请明天再试");
//        }

        // 方法三：
        // 每一轮循环需要经历的步骤：判断-》循环体-》i++
        if(i==3){ //循环退出的可能性：要么成功(0,1,2)；要么3次全部失败(3)
            System.out.println("登录次数超过3次，请明天再试");
        }else{
            System.out.println("登录成功！");
        }
    }
}
