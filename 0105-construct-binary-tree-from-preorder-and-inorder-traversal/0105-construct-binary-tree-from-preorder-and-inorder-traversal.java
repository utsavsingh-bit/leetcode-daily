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
    int preIndex =0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return construct(preorder,0,inorder.length-1,map);
    }
    private TreeNode construct(int[] preorder,int left,int right, HashMap<Integer,Integer> map){
        if(left>right){
            return null;
        }
        int rootValue = preorder[preIndex++];
        TreeNode root = new TreeNode(rootValue);
        int mid = map.get(rootValue);

        root.left = construct(preorder,left,mid-1,map);
        root.right = construct(preorder,mid+1,right,map);
        return root;
    }
}