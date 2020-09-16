package 网易云课堂.j17抽奖习题;

import java.util.Scanner;

public class ProvinceCities {
    public static void main(String[] args) {
        //陕西  山西  四川。。。
        //西安  咸阳 渭南。。。成都 都江堰。。。

        //核心：一维数组的下标正好是二维数组的行号

        //一维数组：线
        System.out.println("\"");
        System.out.println("\\");
        System.out.println("\\\\");
        String[] provinces = {"陕西", "山西", "四川"};
        //二维数组：面
        String[][] cities = {
                {"西安", "咸阳", "渭南"},
                {"太原", "运城", "大同"},
                {"成都", "都江堰", "广元"}
        };

        // 一维元素值->下标->
        Scanner input = new Scanner(System.in);
        System.out.println("请输入省份名称：");
        String p = input.next();
        int position = -1;
        for(int i=0;i<provinces.length;i++){
            if(p.equals(provinces[i])){    //{"陕西", "山西", "四川"};
                position = i;
                break;
            }
        }

        if(position==-1){
            System.out.println("省份输入有误！！！");
        }else {
            System.out.println("对应的城市名称：");
            //  要打印二维数组的行号->将二维数组的该行全部打印
            for (int j = 0; j < cities[position].length; j++) {
                System.out.println(cities[position][j]);
            }
        }

    }
}
