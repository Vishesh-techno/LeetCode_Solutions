class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for(char c: ch){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int length = 0;
        boolean odd = false;
        for(int count: map.values()){
            if(count % 2 == 0){
                length += count;
            }else{
                length += count - 1;
                odd = true;
            }
        }
        if(odd){
            length++;
        }
        return length;
    }
}