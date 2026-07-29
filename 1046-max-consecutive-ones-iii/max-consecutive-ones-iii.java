class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;
        int n = nums.length;
        int maxi = 0;
        int count = 0;

        while(right < n){
            if (nums[right] == 0) count ++;

            while(count > k){
                if(nums[left] == 0) count--;
                left++;
            }

            maxi = Math.max(maxi, right - left + 1);
            right++;
        }
        return maxi;


    }
}