package 网易云课堂.j10while循环;

public class Test03 {
    public static void main(String[] args){
        /**
         * 计算100以内的偶数之和   2+4+6+8+。。。+100
         * 计算100以内的所有数之和
         *
         */
        int sum = 0;
//        for(int i=0;i<=100;i++){
//            sum=sum+i;
//        }
//        System.out.println(sum);

        int i =1;
        while(i<=100){  //1-100每个数字
//            if(i%2==0){  // 1-100之间的偶数
            if(i%3!=0){  //1-100之间不能被3整除的数之和
                sum = sum+i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
