package Week1.Day2;
// time: O(n)
// space: O(n)

import java.util.*;
class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele:nums){
            if(set.contains(ele)) return true;
            set.add(ele);
        }
        return false;
    }
}