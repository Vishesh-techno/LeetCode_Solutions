class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int temp = n/2;
        Set<Integer> set = new HashSet<>();
        for(int i: candyType){
            set.add(i);
        }
        return Math.min(temp, set.size());
    }
}