class Solution {
    int prev = Integer.MAX_VALUE;
    int ans = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return ans;
    }
    public void inOrder(TreeNode root){
        if(root==null) return;
        inOrder(root.left);
        ans = Math.min(ans,Math.abs(root.val - prev));
        prev = root.val;
        inOrder(root.right);
    }
}