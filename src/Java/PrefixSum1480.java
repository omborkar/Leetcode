package Java;

public class PrefixSum1480 {
//    class Solution uncomment for leetcode editor{
        public int[] runningSum(int[] nums) {
            for(int i = 1;i<nums.length;++i)
                nums[i] += nums[i-1];
            return nums;
        }
//    }
    }
