class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();

        backtrack(s, 0, result, new ArrayList<>()); 
        return result;
    }

    public void backtrack(String s, int index,List<List<String>> result, List<String> path ){
        if(index == s.length()){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i = index; i < s.length(); i++){
            if(isPalindrome(s, index, i)){
                path.add(s.substring(index, i + 1));
                backtrack(s, i+1, result, path);
                path.remove(path.size() - 1);
            }
        }
    }

     boolean isPalindrome(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--))
            return false;
        }
        return true;
    }
}