class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == -1 && dividend == Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }
        return (int) dividend/divisor;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna