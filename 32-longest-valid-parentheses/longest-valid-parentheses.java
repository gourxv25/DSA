class Solution {
    public int longestValidParentheses(String s) {
        int left = 0;
        int right = 0;
        int max = 0;

        for(char ch : s.toCharArray()){
            if(ch == '(') left++;
            else right ++;

            if(left == right) max = Math.max(max, left * 2);
            if(right > left) left = right = 0;
        }

        left = right = 0;

        for(int i = s.length() - 1; i >= 0; i --){
            char ch = s.charAt(i);
            if(ch == '(') left++;
            else right ++;

            if(left == right) max = Math.max(max, left * 2);
            if(right < left) left = right = 0;
        }
        return max;
    }
}