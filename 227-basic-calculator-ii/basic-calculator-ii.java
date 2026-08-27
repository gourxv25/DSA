class Solution {
    public int calculate(String s) {
        // Remove spaces
        s = s.replace(" ", "");

        // Store numbers and operators
        java.util.ArrayList<Integer> nums = new java.util.ArrayList<>();
        java.util.ArrayList<Character> ops = new java.util.ArrayList<>();

        int num = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
                num = num * 10 + (ch - '0');
            else{
                nums.add(num);
                ops.add(ch);
                num = 0;
            }
        }
         // Add last number
        nums.add(num);

        for(int i = 0; i < ops.size();){
            char ch = ops.get(i);

            if(ch == '*' || ch == '/'){
                int left = nums.get(i);
                int right = nums.get(i+1);
                int value;
                if(ch == '*'){
                    value = left * right;
                }else value = left/right;

                ops.remove(i);
                nums.set(i, value);
                nums.remove(i+1);
            }else i++;
        }
        int result = nums.get(0);
        for(int i = 0; i < ops.size(); i++){
            if(ops.get(i) == '+')
                result += nums.get(i+1);
            else result -= nums.get(i+1);
        }
        return result;
    }
}