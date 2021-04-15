// iterative method using queue
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        
        if(root == null) return wrapList;
        
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<levelNum; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }
}

// Recusrsive solution:
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void level(TreeNode root, int h){
        if(root == null) return;
        if(h == ans.size()) ans.add(new ArrayList<>());
        ans.get(h).add(root.val);
        level(root.left,h+1);
        level(root.right,h+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        level(root,0);
        return ans;
    }
}