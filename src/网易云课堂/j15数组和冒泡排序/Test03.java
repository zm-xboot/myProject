package 网易云课堂.j15数组和冒泡排序;

public class Test03 {
    /**
     * 外层i(第n趟):   0   1   2   3
     * 内层j(比较次数): 4   3   2   1
     * i+j=n-1=元素个数-1
     *
     * 经典算法冒泡排序
     * nums = {2 12 4 20 1}
     * 冒泡流程：
     * 第0趟： 当前>下一个 ，如果是：则交换
     * 2 4 12 1 【20】 ->一轮比较完毕，可以得到一个最大值
     * 第1趟：
     * 2 4 1 【12】
     * 第2趟：
     * 2 1 【4】
     * 第3趟：
     * 1 【2】
     * 总结：
     * 几轮？
     * 元素个数->轮数
     * ============n个元素比较->n-1轮
     * n->n-1
     * 5->4
     * 3->2
     * 2->1
     * 1->0
     * 每轮内部规则是什么？
     * if(nums[i]>nums[i+1]){
     *     交换
     * }
     * 外层循环：第一趟、第二趟、第三趟、第四趟
     * 内层循环：每一趟内部的两两比较
     * 每一趟内部的两两比较是一个循环
     * 假设有n个元素
     * 双重循环：外层和内层的数学关系
     * for(int i=0;i<n-1;i++){  // 第一趟、第二趟、第三趟
     *     for(int j=0;j<n-1-i;j++){  // 每一趟内部的两两比较,几次？
     *          if(nums[j]>nums[j+1]){  //判断  当前>下一个 ，如果是：则交换
     *              int temp = nums[j];
     *              nums[j] = nums[j+1];
     *              nums[j+1] = temp;
     *          }
     *     }
     * }
     * i+j=n-1=元素个数-1
     *
     *
     *
     */
    public static void main(String[] args){
        int[] nums = {2,12,4,20,1};
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }
    }
}
