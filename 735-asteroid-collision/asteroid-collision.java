class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();

        for(int num : asteroids){
            boolean destroyed = false;
            while(!s.isEmpty() && s.peek() > 0 && num < 0){
                if(s.peek() == -num) {
                    s.pop();
                    destroyed = true;
                    break;
                }
                else if(s.peek() < -num)
                    s.pop();
                else {
                    destroyed = true;
                    break;
                }
            }

            if(!destroyed){
                s.push(num);
            }
        }

        int[] ans= new int[s.size()];
        for(int i = s.size() - 1; i >= 0; i--)
            ans[i] = s.pop();
        
        return ans;
    }
}