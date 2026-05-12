class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
          while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            while(i < chars.length && chars[i] == currentChar){
                count++;
                i++;
            }
            chars[index++] = currentChar;

            if (count > 1) {
                String cnt = String.valueOf(count);
                for (char c : cnt.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna