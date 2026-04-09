class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); // ✅ sort first
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

        for (int i = index; i < nums.length; i++) {

            // 🚫 Skip duplicates (IMPORTANT LINE)
            if (i > index && nums[i] == nums[i - 1]) continue;

            // 🚫 Prune
            if (nums[i] > target) break;

            // ✅ Pick
            list.add(nums[i]);

            // move forward (no reuse)
            backtrack(nums, target - nums[i], i + 1, result, list);

            // 🔙 Backtrack
            list.remove(list.size() - 1);
        }
    }
}