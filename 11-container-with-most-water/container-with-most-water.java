class Solution {
    public int maxArea(int[] nums) {
        int maxArea = Integer.MIN_VALUE;

        int i = 0, j = nums.length - 1;
        while(i < j){
            int area = Math.min(nums[i], nums[j]) * (j-i);
            maxArea = Math.max(maxArea, area);

            if(nums[i] < nums[j])i++;
            else j--;
        }

        return maxArea;
    }
}