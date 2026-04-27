class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> seen = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int k = 0;
        for(int i: nums){
            if(i != -1){
                seen.addFirst(i);
                k=0;
            }else{
                k++;
                if(k <= seen.size()){
                    ans.addLast(seen.get(k-1));
                }else{
                    ans.add(-1);
                }
            }
        }
        return ans;
    }
}