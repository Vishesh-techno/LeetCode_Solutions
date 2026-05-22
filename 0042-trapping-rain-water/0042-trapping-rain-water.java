class Solution {
    public int trap(int[] height) {
       int[] left = new int[height.length];
       left[0] = height[0];
       for(int i=1; i<=height.length-1; i++){
        left[i] = Math.max(height[i], left[i-1]);
       }

       int[] right = new int[height.length];
       right[height.length-1] = height[height.length-1];
       for(int i=height.length-2; i>=0; i--){
        right[i] = Math.max(height[i], right[i+1]);
       }

       int trapped = 0;
       for(int i=0; i<height.length; i++){
        int water = Math.min(left[i], right[i]);
            trapped += water - height[i];
        }
        return trapped;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna