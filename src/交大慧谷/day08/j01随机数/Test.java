package 交大慧谷.day08.j01随机数;

import java.util.*;

public class Test {
    public static void main(String[] args){
//        // 随机范围是0～1之间
//        System.out.println(Math.random());
//        //通过随机数类
//        Random random = new Random();
//        //生成[0,10)的整数
//        System.out.println(random.nextInt(10));

//        生成4个随机整数[0,10)，要求不重复
//        for(int i=1; i<5; i++){
//            Map<Integer, Integer> map = new HashMap<>();
//            map.put(i, random.nextInt(10));
//            if(map.get(i-1) != map.get(i)){
//                System.out.println(map.get(i));
//                }
//            }

        int[] a = new int[4];
        Random r = new Random();
        for(int i = 0; i<a.length; i++){
            a[i] = r.nextInt(10);
            for(int j = 0; j<i; j++){
                if(a[i] == a[j]){
                    i--;
                    break;
                }
            }
        }

        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
