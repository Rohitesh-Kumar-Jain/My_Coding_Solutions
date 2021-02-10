// iterative 
public List<Integer> preorderTraversal(TreeNode node) {
	List<Integer> list = new LinkedList<Integer>();
	Stack<TreeNode> rights = new Stack<TreeNode>();
	while(node != null) {
		list.add(node.val);
		if (node.right != null) {
			rights.push(node.right);
		}
		node = node.left;
		if (node == null && !rights.isEmpty()) {
			node = rights.pop();
		}
	}
    return list;
}


// Recursive:
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