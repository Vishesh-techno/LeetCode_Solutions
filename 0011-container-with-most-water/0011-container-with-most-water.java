class Solution {
    public int maxArea(int[] height) {
        int maxAr = 0, h = 0, b = 0;
        int left = 0, right = height.length-1;
        while(left <= right){
            h = Math.min(height[left], height[right]);
            b = right - left;
            int currAr = h * b;
            maxAr = Math.max(maxAr, currAr);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxAr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna