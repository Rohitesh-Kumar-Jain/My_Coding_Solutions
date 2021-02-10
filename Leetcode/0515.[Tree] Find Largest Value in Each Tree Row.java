class Solution {
    List<Integer> ans = new ArrayList<>();
    public void level(TreeNode root, int h){
        if(root == null) return;
        if(ans.size() == h){
            ans.add(root.val);
        }
        if(root.val > ans.get(h)){
            ans.set(h,root.val);
        }
        level(root.left,h+1);
        level(root.right,h+1);
    }
    public List<Integer> largestValues(TreeNode root) {
        level(root,0);
        return ans;
    }
}