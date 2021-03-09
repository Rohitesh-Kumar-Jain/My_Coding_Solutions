class Solution {
    int second=-1;
    int top;
    public int findSecondMinimumValue(TreeNode root){
        top = root.val;
        secMin(root);
        return second;
    }
    
    public void secMin(TreeNode root){
        if(root == null) return;
        if(root.left!=null && (top!=root.left.val || top!=root.right.val)){
            if(root.right.val==top){
                if(second!=-1) second= Math.min(root.left.val,second);
                else second= root.left.val;
            }
            else if(root.left.val==top){
                 if(second!=-1) second= Math.min(root.right.val,second);
                 else second= root.right.val;
            }
            else{
                second = Math.min(root.left.val,Math.min(root.right.val,second));
            }
        }
        secMin(root.left);
        secMin(root.right);
    }
}



// Better solution: From leetcode solution:
class Solution {
    int min1;
    long ans = Long.MAX_VALUE;

    public void dfs(TreeNode root) {
        if (root != null) {
            if (min1 < root.val && root.val < ans) {
                ans = root.val;
            } else if (min1 == root.val) {
                dfs(root.left);
                dfs(root.right);
            }
        }
    }
    public int findSecondMinimumValue(TreeNode root) {
        min1 = root.val;
        dfs(root);
        return ans < Long.MAX_VALUE ? (int) ans : -1;
    }
}