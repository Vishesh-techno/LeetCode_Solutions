class Solution {
    public int distributeCandies(int[] candyType) {
        // int n = candyType.length;
        // int temp = n/2;
        // Set<Integer> set = new HashSet<>();
        // for(int i: candyType){
        //     set.add(i);
        // }
        // return Math.min(temp, set.size());

        int n = candyType.length; 
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(!map.containsKey(candyType[i]) && map.size()<(n/2)){
                map.put(candyType[i], 1);
            }
        }
        return map.size();
    }
}