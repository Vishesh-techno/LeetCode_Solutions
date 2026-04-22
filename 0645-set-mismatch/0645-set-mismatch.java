class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int dup = -1, miss = -1;
        for(int i: nums){
            if(set.contains(i)){
                dup = i;
            }
            set.add(i);
        }
        for(int i=0; i<=nums.length; i++){
            if(!set.contains(i)){
                miss = i;
            }
            set.add(i);
        }
        return new int[]{dup, miss};
    }
}