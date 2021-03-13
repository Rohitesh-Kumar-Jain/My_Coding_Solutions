class Solution {
    TreeNode ans;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ans = root;
        lca(root,p,q);
        return ans;
    }
    public void lca(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return;
        if(root.val > p.val && root.val > q.val){
            ans = root.left;
            lca(root.left,p,q);
        }
        else if(root.val < p.val && root.val < q.val){
            ans = root.right;
            lca(root.right,p,q);
        }
    }
}
