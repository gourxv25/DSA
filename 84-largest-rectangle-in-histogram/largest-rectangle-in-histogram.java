class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int n = heights.length;
        int maxArea = 0;

        for(int i = 0; i <= n; i++){
            int currHeight = (i == n) ? 0 : heights[i];

            while(!s.isEmpty() && currHeight < heights[s.peek()]) {
                int height = heights[s.peek()];
                s.pop();

                int width;
                if(s.isEmpty())
                    width = i;
                else
                    width = i - s.peek() - 1;

                maxArea = Math.max(maxArea, height * width);
            }

            s.push(i);
        }

        return maxArea;
    }
}