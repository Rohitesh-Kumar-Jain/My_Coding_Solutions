class Solution {
    public int maxLevelSum(TreeNode root) {
        int ans=Integer.MIN_VALUE;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level=0;
        int finalAns=1;
        while(!q.isEmpty()){
            int size = q.size();
            int sum=0;
            level++;
            for(int i=0;i<size;i++){
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                sum = sum + q.poll().val;
            }
            if(sum> ans) finalAns= level;
            ans = sum > ans ? sum : ans;
        }
        return finalAns;
    }
}
