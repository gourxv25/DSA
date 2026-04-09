class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, result, new ArrayList<>());
        return result;
    }

    public void backtrack(int[] nums, int target, int index,
                          List<List<Integer>> result, List<Integer> list) {

        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        if (target < 0 || index >= nums.length) {
            return;
        }

        list.add(nums[index]);
        backtrack(nums, target - nums[index], index, result, list);

        // 🔙 Backtrack
        list.remove(list.size() - 1);

        // ❌ Skip current element
        backtrack(nums, target, index + 1, result, list);
    }
}