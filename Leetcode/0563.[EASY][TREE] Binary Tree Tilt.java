class Solution {
    int sum=0;
    public int findTilt(TreeNode root) {
        sumTilt(root);
        return sum;
    }
    
    public int sumTilt(TreeNode root){
        if(root == null) return 0;
        int l = sumTilt(root.left);
        int r = sumTilt(root.right);
        sum += Math.abs(l-r);
        return root.val + l + r;
    }
}