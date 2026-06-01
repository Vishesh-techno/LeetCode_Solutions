class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '{' || c == '[' || c == '('){
                stk.push(c);
            }else{
                if(stk.isEmpty()){
                    return false;
                }
                char top = stk.pop();
                if((c == ']' && top != '[') || 
                (c == '}' && top != '{') ||
                (c == ')' && top != '(')){
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna