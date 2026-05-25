class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        boolean[] isPresent = new boolean[101];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i: nums){
            // if(i > max){
            //     max = i;
            // }else if(i < min){
            //     min = i;
            // }
            isPresent[i] = true;
            max = Math.max(i, max);
            min = Math.min(i, min);
        }
        for(int i=min; i<=max; i++){
            if(!isPresent[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna