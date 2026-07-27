class Solution {
    public int trap(int[] height) {
        int LMax = 0, RMax = 0, total = 0, l = 0, r = height.length - 1;

        while(l < r){
            if(height[l] <= height[r]){
                if(LMax > height[l])
                    total += LMax - height[l];
                else  LMax = height[l];

                l++;
            }
            else{
                if(RMax > height[r])
                    total += RMax - height[r];
                else RMax = height[r];

                r--;
            }
        }

        return total;
    }
}