///////////////////// Brute Force ///////////////////
// time: O(n^2)
// space: O(1)

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int result[]=new int[2];
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(target==nums[i]+nums[j]){
//                     result[0]=i;
//                     result[1]=j;
//                     break;
//                 }
//             }
//         }
//         return result;  
//     }
// }



///////////////////// Optimized ///////////////////
// time: O(n)
// space: O(n)

import java.util.*;
class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for(int i=0; i<nums.length; i++){
            int n = target-nums[i];
            if(map.containsKey(n)) {
                ans[0] = map.get(n);
                ans[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}