class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i: nums){
            pq.add(i);
        }
        int n = nums.length - k + 1;
        while(n != 1){
            n--;
            pq.poll();
        }
        return pq.peek();
    }
}