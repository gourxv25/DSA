class Solution {
    private boolean isValid(int[] nums, int sub, int k){
        int sum = 0;
        int cnt = 1;

        for(int i : nums){
            if(i > sub) return false;

            if(sum + i <= sub) sum += i;
            else {
                cnt ++;
                sum = i;

                if(cnt > k) return false;
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int l = 0, r = 0;
        for(int i : nums){
            l = Math.max(l, i);
            r += i;
        }

        int ans = -1;
        while(l <= r){
            int m = l + (r - l)/2;
            if(isValid(nums, m, k)){
                ans = m;
                r = m - 1;
            }else l = m + 1;
        }
        return ans;

    }
}