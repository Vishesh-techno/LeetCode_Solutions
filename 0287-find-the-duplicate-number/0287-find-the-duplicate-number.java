class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] isExist = new boolean[nums.length];
        for(int i: nums){
            if(isExist[i]){
                return i;
            }
            isExist[i] = true;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna