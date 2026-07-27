class Solution {
    public int trap(int[] height) {
        int[] prefixMax = prefixMax(height);
        int[] suffixMax = suffixMax(height);

        int total = 0;

        for(int i = 0; i < height.length; i++){
            int leftMax = prefixMax[i];
            int rightMax = suffixMax[i];

            if(height[i] < leftMax && height[i] < rightMax)
                total += Math.min(leftMax, rightMax) - height[i];
        }

        return total;
    }

    private int[] prefixMax(int[] nums){
        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            prefix[i] = Math.max(prefix[i-1], nums[i]);

        }

        return prefix;
    }

    private int[] suffixMax(int[] nums){
        int n = nums.length;
        int[] suffix = new int[n];

        suffix[n - 1] = nums[n - 1];

        for(int i = n - 2; i >= 0; i--){
            suffix[i] = Math.max(suffix[i+1], nums[i]);
        }

        return suffix;
    }
}