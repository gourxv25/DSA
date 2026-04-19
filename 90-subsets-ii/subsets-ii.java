class Solution {
    private void backtrack(int[] nums, int start, List<List<Integer>> result, List<Integer> list){
        result.add(new ArrayList<>(list));
       for (int i = start; i < nums.length; i++) {
            // Skip duplicates
            if (i > start && nums[i] == nums[i - 1]) continue;

            list.add(nums[i]);
            backtrack(nums, i + 1, result, list);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, 0, result, new ArrayList<>());
        return result;
    }
}