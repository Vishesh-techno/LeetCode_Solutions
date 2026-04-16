class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (c != '*') {
                stk.push(c);
            } else {
                if (!stk.isEmpty()) {
                    stk.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c: stk){
            sb.append(c);
        }
        return sb.toString();
    }
}