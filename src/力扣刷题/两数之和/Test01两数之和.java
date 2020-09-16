package 力扣刷题.两数之和;

// 题目的路径链接：https://leetcode-cn.com/problems/two-sum/

/**
 *给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 链接：https://leetcode-cn.com/problems/two-sum
 *
 */
public class Test01两数之和 {
    public static int[] twoSum(int[] nums, int target) {
        int[] re = new int[2];
        for(int i = 0; i<nums.length; i++){
            for(int j= i+1; j<nums.length-1; j++){
                if(nums[i]+nums[j]==target&j!=i){  //数组中同一个元素不能使用两遍
//                    re[0] = i;
//                    re[1] = j;
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args){
        // int数组的初始化
        int[] a = {2,3,5,7,4,9,0,8,10};
        int[] re = twoSum(a,9);
        for(int i = 0; i<re.length; i++){
            System.out.println(re[i]);
        }
    }
}
