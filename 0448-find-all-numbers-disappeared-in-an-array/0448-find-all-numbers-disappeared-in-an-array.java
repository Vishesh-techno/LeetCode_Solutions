class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // List<Integer> list = new ArrayList<>();
        // Set<Integer> set = new HashSet<>();
        // for(int i: nums){
        //     set.add(i);
        // }
        // for(int i=1; i<=nums.length; i++){
        //     if(!set.contains(i)){
        //         list.add(i);
        //     }
        // }
        // return list;

        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx] > 0){
                nums[idx] = -nums[idx];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                list.add(i+1);
            }
        }
        return list;
    }
}