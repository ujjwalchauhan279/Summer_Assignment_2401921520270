package Week1.Day2;
// time: O(n)
// space: O(1)


class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int r = 0;
        while(r<nums.length){
            sum+= nums[r];
            maxSum = Math.max(maxSum, sum);
            if(sum<0) sum = 0;
            r++;
        }
        return maxSum;
    }
}