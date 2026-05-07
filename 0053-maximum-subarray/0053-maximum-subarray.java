class Solution {
    public int maxSubArray(int[] nums) {
        int current = 0;
        int max = Integer.MIN_VALUE;
        for(int i: nums){
            current = current + i;
            max = Math.max(current, max);
            if(current <= 0){
                current = 0;
            }
        }
        return max;
    }
}