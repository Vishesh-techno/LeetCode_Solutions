class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        char[] ch1 = jewels.toCharArray();
        char[] ch2 = stones.toCharArray();

        for(char i: ch1){
            set.add(i);
        }
        int count = 0;
        for(char i: ch2){
            if(set.contains(i)){
                count++;
            }
        }
        return count;
    }
}