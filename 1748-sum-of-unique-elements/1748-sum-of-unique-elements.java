class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int sum = 0;
        for(int i: nums){
            if(map.get(i) == 1){
                sum += i;
            }
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna