package 网易云课堂.j21对象数组习题和猜拳游戏;

import java.util.Scanner;

public class Game {
    User user;     //对象里面套对象，嵌套属性
    // User user = new User();
    // NullPointerException : 对象.属性   对象.方法()   对象=null
    /**
     * 人：身高 体重 姓名 -> 基本类型
     * 人：地址   类里面嵌套类属性
     *  public class Address{
     *      String homeAddress;
     *      String schoolAddress;
     *  }
     *
     * public class Person{
     *      Address address;
     * }
     */

    Computer computer;
    int count;   //对战次数

    //初始化：设置自己的名字，对手的名字，积分0
    public void init(){
        System.out.println("请输入您的姓名");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        user = new User();
        user.name = name;
        user.score = 0;

        System.out.println("请选择你的对手：\n1.张三\t2.李四\t3.王五");
        int choice = input.nextInt();
        computer = new Computer();
        computer.score = 0;
        switch(choice){   //或者使用if...else...
            case 1:
                computer.name = "张三";
                    break;
            case 2:
                computer.name = "李四";
                    break;
            case 3:
                computer.name = "王五";
                    break;
            default:
                System.out.println("输入有误！");
        }
        System.out.println("您选择了与"+computer.name+"对战");
    }

    public void start(){
        Scanner input = new Scanner(System.in);
        init();   //初始化只需要一次
        String isContinue = null;
        do {
            int userFist = user.showFist();
            int computerFist = computer.showFist();
            calcResult(userFist, computerFist);
            count ++;
            System.out.println("是否继续？y(继续)/其他(结束)");
            isContinue = input.next();   //从键盘敲入字符串或者字符   // n
        }while("y".equals(isContinue));
        //最终的结果
        showResult(user, computer);
    }

    //计算每一轮的结果
    public void calcResult(int userFist, int computerFist){
        //1.剪刀	2.石头 3.布
        if((userFist == 1&& computerFist==3)||(userFist==2&&computerFist==1)||(userFist==3&&computerFist==2)){  //人赢
            System.out.println("您赢了");
            user.score ++;
        }else if((userFist == 3&& computerFist==1)||(userFist==1&&computerFist==2)||(userFist==2&&computerFist==3)){  //计算机赢
            System.out.println("您输了");
            computer.score ++;
        }else{
            System.out.println("平局");
        }
    }

    //显示最终结果
    public void showResult(User user, Computer computer){
        /**
         * 自己的名字\t 赢的次数  ->User
         * 计算机的名字\t 赢的次数  ->Computer
         * 最终结果：胜/负
         */
        System.out.println("人机对战次数："+ count);
        System.out.println(user.name+"\t"+user.score);
        System.out.println(computer.name+"\t"+computer.score);

        if(user.score > computer.score){
            System.out.println("恭喜，您获得了最终胜利");
        }else if(user.score < computer.score){
            System.out.println("很遗憾，您输了！！");
        }else{
            System.out.println("最终平局");
        }
    }

    public static void main(String[] args){
        Game game = new Game();
        game.start();
    }

}
