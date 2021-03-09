class Solution {
    int sum=0;
    public int diameterOfBinaryTree(TreeNode root) {
        dbt(root);
        return sum;
    }
    
    public int dbt(TreeNode root){
        if(root == null) return 0;
        int l = dbt(root.left);
        int r = dbt(root.right);
        sum = Math.max(sum, l + r);
        return Math.max(l,r) +1;
    }
}