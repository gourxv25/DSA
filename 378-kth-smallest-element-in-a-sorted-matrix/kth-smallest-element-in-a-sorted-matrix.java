class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n-1][n-1];
       int ans = -1;

        while(left <= right){
            int mid = (left + right) >> 1;

            if(countLessOrEqual(matrix, mid) >= k){
                ans = mid;
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return ans;
    }

    private int countLessOrEqual(int[][] matrix, int target){
        int count = 0,  c = matrix.length - 1;

        for(int r = 0; r < matrix.length; r++){
            while(c >= 0 && matrix[r][c] > target) c--;
            count += (c+1);
        }
        return count;
    }
}