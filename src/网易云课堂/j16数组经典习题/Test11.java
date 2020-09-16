package 网易云课堂.j16数组经典习题;

public class Test11 {
    public static void main(String[] args){
        /**
         * 数组长度一旦定义，则不能再改变
         * int[] nums = {23,23,1};
         * int[] nums = new int[]{23,23,1};
         * int[] nums = new int[3];
         */
        //给67,87,88,98,99数组中插入一个元素90，要求保持从小到大的顺序（不能用排序算法）
        int[] nums = new int[]{67,87,88,98,99};
        //创建新数组，能够容纳新插入后的全部元素
        int[] newNums = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            newNums[i] = nums[i];
        }

        /**
         * 1、插入元素的位置
         * 90：数组中第一个比90大的位置，就是要插入的位置
         */
        int insert = 95;
        int position = newNums.length-1;  //默认插入的位置就是最大值的位置
        for(int i=0;i<newNums.length;i++){
            if(newNums[i]>insert){
                position = i;
                break;
            }
        }
        System.out.println("位置："+position);

        /**
         * 2、平移
         */
        for(int i=newNums.length-2; i>=position; i--){
            newNums[i+1] = newNums[i];
        }

        //插入
        newNums[position] = insert;

        System.out.println("查看新数组：");
        for(int i=0;i<newNums.length;i++){
            System.out.println(newNums[i]);
        }
    }
}
