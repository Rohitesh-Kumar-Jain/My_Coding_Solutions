class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
        int r=1;
        int next=0;
        while(q.size()>0){
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<r;i++){
                TreeNode temp = q.poll();
                list.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                    next++;
                }
                if(temp.right!=null){
                    q.add(temp.right);
                    next++;
                }
            }
            ans.add(list);
            r= next;
            next=0;
        }
        return ans;
    }
}