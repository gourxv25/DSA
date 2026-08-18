class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];

        for(int i = n - 1; i >= 0; i--){

            while(!s.isEmpty() && s.peek() <= nums[i])
                s.pop();
            
            ans[i] = s.isEmpty() ? - 1: s.peek();
            s.push(nums[i]);
        }

        for(int i = n - 1; i >= 0; i--){

            while(!s.isEmpty() && s.peek() <= nums[i])
                s.pop();
            
            ans[i] = s.isEmpty() ? - 1: s.peek();
            s.push(nums[i]);
        }

        return ans;
    }
}