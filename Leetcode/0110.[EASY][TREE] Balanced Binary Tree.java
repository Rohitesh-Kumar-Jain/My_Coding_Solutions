class Solution {
    boolean passed;
    public boolean isBalanced(TreeNode root) {
        passed = true;
        check(root);
        return passed;
    }
    
    public int check(TreeNode root){
        if(passed==false) return 0;
        if(root==null) return 0;
        int l = check(root.left) +1;
        int r = check(root.right) +1;
        if(Math.abs(l-r) > 1) passed=false;
        return Math.max(l,r);
    }
}