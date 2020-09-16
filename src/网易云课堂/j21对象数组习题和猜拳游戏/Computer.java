package 网易云课堂.j21对象数组习题和猜拳游戏;

public class Computer {
    String name;
    int score;   //全局变量默认为0

    public int showFist(){
        // 计算机得随机出拳，随机数
        int choice = (int)(Math.random()*3)+1;  //(int)(Math.random()*4)
        /**
         * Math.random()取[0,1)之间的随机数
         * Math.random()*100表示[0,100)之间的随机数
         * (Math.random()*40)*10表示[0,400)之间的随机数，
         * 如需取整则int((Math.random()*40)*10)这样
         */
        if(choice == 1){
            System.out.println(name+"出了剪刀");
        }else if(choice == 2){
            System.out.println(name+"出了石头");
        }else if(choice == 3){
            System.out.println(name+"出了布");
        }else{
            System.out.println("输入有误！");
        }
        return choice;
    }
}
