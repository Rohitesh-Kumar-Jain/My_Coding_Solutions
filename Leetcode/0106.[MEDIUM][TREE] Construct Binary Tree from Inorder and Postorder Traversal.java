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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n= inorder.length;
        return build(inorder,postorder,0,n-1,0,n-1);
    }
    public TreeNode build(int[] inorder, int[] postorder, int m, int n, int ps, int pe){
        if(n<m || pe<ps ) return null;
        int val = postorder[pe];
        TreeNode head = new TreeNode(val);
        int index=-1;
        for(int i=m;i<=n;i++){
            if(inorder[i]==val){
                index=i;
                break;
            }
        }
        head.left = build(inorder,postorder,      m,      index-1,    ps,          ps+index-m-1);
        head.right = build(inorder,postorder,     index+1,      n,    ps+index-m,         pe-1);
        return head;
    }
}
