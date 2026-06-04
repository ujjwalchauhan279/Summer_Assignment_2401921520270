package Week1.Day3;

// time: O(n)
// space: O(1)


class Container_With_Most_Water {
    public int maxArea(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        int maxArea = 0;
        while(l<=r){
            int area = 0;
            if(arr[l]<arr[r]){
                area = arr[l]*(r-l);
                l++;
            }
            else{
                area = arr[r]*(r-l);
                r--;
            }
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}