package 网易云课堂.j15数组和冒泡排序;

import java.util.Arrays;

public class Test02 {
    /**
     * 练习
     * 有一个数列： 8 4 2 1 23 344 12
     * 1、求所有数字的和
     * 2、随机产生一个1-3之间的数，判断数列中是否有此数
     * 3、进行排序，并输出结果
     */
    public static void main(String[] args){
        // 有一个数列： 8 4 2 1 23 344 12，两种定义方式
        int[] nums = new int[]{8,4,2,1,23,344,12};
        int[] nums1 = {8,4,2,1,23,344,12};
        // 1、求所有数字的和
        int sum = 0;
        for(int i=0;i<nums.length;i++){ //从0-nums.length-1
            sum += nums[i];  //等价写法sum = sum + nums[i];
        }
        System.out.println("所有数字之和："+sum);

        //2、随机产生一个1-3之间的数，判断数列中是否有此数
        // 2个可能性用：boolean
        boolean flag = false;
        int rn = (int)(Math.random()*3)+1;   //Math.random()返回带正号的double值，该值大于等于0.0且小于1.0
        System.out.println("随机数："+rn);
        for(int n:nums){
            if(rn==n){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("数组中包含："+rn);
        }else{
            System.out.println("数组中不包含："+rn);
        }

        //3、进行排序，并输出结果
        System.out.println("排序前：");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }

        //排序
//        Arrays.sort(nums); // 自动排序，升序   api开发
        //自己写排序算法，冒泡排序

        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println("排序后：");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }

    }
}
