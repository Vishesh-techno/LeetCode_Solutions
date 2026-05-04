/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // public void inOrder(TreeNode root, List<Integer> list){
    //     if(root == null){
    //         return;
    //     }
    //     inOrder(root.left, list);
    //     list.add(root.val);
    //     inOrder(root.right, list);
    // }
    // public boolean isSameTree(TreeNode p, TreeNode q) {
    //     List<Integer> list1 = new ArrayList<>();
    //     List<Integer> list2 = new ArrayList<>();
    //     inOrder(p, list1);
    //     inOrder(q, list2);
    //     if(list1.size() != list2.size()){
    //         return false;
    //     }

    //     for(int i=0; i<list1.size(); i++){
    //         if(list1.get(i) != list2.get(i)){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

     public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;

        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}