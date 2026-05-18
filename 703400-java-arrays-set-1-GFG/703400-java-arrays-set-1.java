
class Solution {
    public String average(int arr[]) {
        int sum = 0;
        for(int i: arr){
            sum += i;
        }
        double avg = (double) sum / arr.length;

        return String.format("%.2f", avg);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna