class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, count = Integer.MAX_VALUE, sum = 0;

        for(int r = 0; r < nums.length; r++){
            sum += nums[r];
            if(sum >= target) count = Math.min(count, r - l + 1);

            while(sum >= target){
                count = Math.min(count, r - l + 1);
                sum -= nums[l++];
            }
        }

        return count == Integer.MAX_VALUE ? 0 : count;
    }
}