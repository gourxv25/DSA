class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int freq = 0;
        int maxFreq = 0;

        for(int num : nums){
            if(num != 1)
                freq = 0;
            else{
                freq++;
                maxFreq = Math.max(freq, maxFreq);
            }
        }

        return maxFreq;
    }
}