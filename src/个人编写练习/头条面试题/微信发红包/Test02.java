package 个人编写练习.头条面试题.微信发红包;

public class Test02 {
    public static void main(String[] args){
        int sum = 10;
        int num = 10;
        for(int i=0;i<num; i++) {
            int money = (int)(Math.random()*sum);
            sum = sum-money;
            if(i==9){
                money = sum-money;
                System.out.println("第"+i+"个人的红包金额："+ money);
            }
            System.out.println("第"+i+"个人的红包金额："+ money);
        }
//        System.out.println((float)(Math.random()*10));
    }
}
