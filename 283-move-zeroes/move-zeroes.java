class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                swap(nums, count++, i);
            }
        }
    }

    public void swap(int[] num, int i , int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
