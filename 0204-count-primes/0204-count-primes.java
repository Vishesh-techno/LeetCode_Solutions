class Solution {
    public int countPrimes(int n) {
        if(n<=1){
            return 0;
        }
        int count = 0;
        boolean[] used = new boolean[n];
        for(int i=2; i<=Math.sqrt(n); i++){
            if(used[i]){
                continue;
            }
            for(int j=i*i; j<n; j+=i){
                used[j] = true;
            }
        }
        for(int i=2; i<n; i++){
            if(!used[i]){
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna