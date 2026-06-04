package Week1.Day2;
// time: O(n)
// space: O(1)


class Maximum_Average_Subarray_I {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i=0; i<k; i++) sum+=nums[i];
        double maxAvg = sum/k;
        int l = 0;
        int r = k;
        while(r<nums.length){
            sum-=nums[l];
            l++;

            sum+=nums[r];
            r++;
            maxAvg = Math.max(maxAvg, sum/k);
        }
    return maxAvg;
    }
}
