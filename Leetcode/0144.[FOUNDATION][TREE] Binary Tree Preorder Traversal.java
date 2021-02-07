class Solution {
    List<Integer> ans = new ArrayList<>();
    
    public void pre(TreeNode root){
        if(root==null) return;
        ans.add(root.val);
        pre(root.left);
        pre(root.right);
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        pre(root);
        return ans;
    }
}


// Iterative version: 
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        s.push(root);
        while(s.size()>0){
            TreeNode temp = s.pop();
            ans.add(temp.val);
            if(temp.right!=null) s.push(temp.right);
            if(temp.left!=null) s.push(temp.left);
        }
        return ans;
    }
}



// Morris traversal
// https://leetcode.com/problems/binary-tree-preorder-traversal/discuss/45267/3-Iterative-Solutions%3A-Stack-And-Morris-Traversal-(Complexity-Explained)
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left == null) {
                res.add(cur.val);
                cur = cur.right;
            } else {
                TreeNode prev = cur.left;
                while (prev.right != null && prev.right != cur)
                    prev = prev.right;
                if (prev.right == null) {
                    res.add(cur.val);
                    prev.right = cur;
                    cur = cur.left;
                } else {
                    prev.right = null;
                    cur = cur.right;
                }
            }
        }
        return res;
    }
}