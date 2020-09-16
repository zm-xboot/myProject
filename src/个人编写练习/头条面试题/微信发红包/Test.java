package 个人编写练习.头条面试题.微信发红包;

public class Test {
    public static void main(String[] args){
        float num=10,N=1.9f;
        int people=10;
        for(int i=0;i<10;i++)
        {
            System.out.println("the number"+people+"can get "+num/people*N);
            num=num-num/people*N;
            people--;
        }
        System.out.println("there remain"+num);
    }
}
