class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int r = Arrays.stream(bloomDay).max().getAsInt();
        int l = 1;
        if((long) m * k > bloomDay.length) return -1;
        while(l < r){
            int mid = l + (r - l)/2;
            if(isValid(bloomDay, m, k, mid)) r = mid;
            else l = mid + 1;
        }
        return l;

    }

    private boolean isValid(int[] nums, int m, int k, int days){
       int consecutive = 0;
        int flowers = 0;

        for (int day : nums) {

            if (day <= days) {
                consecutive++;

                if (consecutive == k) {
                    flowers++;
                    consecutive = 0;
                }
            } else {
                consecutive = 0;
            }

            if (flowers >= m) {
                return true;
            }
        }

        return false;
    }
}