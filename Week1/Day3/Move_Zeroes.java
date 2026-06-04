package Week1.Day3;
// time: O(n)
// space: O(1)


class Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int curr = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[curr];
                nums[curr] = temp;
                curr++;
            }
        }
    }
}
