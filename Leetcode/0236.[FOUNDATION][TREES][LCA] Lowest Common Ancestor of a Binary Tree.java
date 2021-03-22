// Article solution:
class Solution {

    private TreeNode ans;

    public Solution() {
        // Variable to store LCA node.
        this.ans = null;
    }

    private boolean recurseTree(TreeNode currentNode, TreeNode p, TreeNode q) {

        // If reached the end of a branch, return false.
        if (currentNode == null) {
            return false;
        }

        // Left Recursion. If left recursion returns true, set left = 1 else 0
        int left = this.recurseTree(currentNode.left, p, q) ? 1 : 0;

        // Right Recursion
        int right = this.recurseTree(currentNode.right, p, q) ? 1 : 0;

        // If the current node is one of p or q
        int mid = (currentNode == p || currentNode == q) ? 1 : 0;


        // If any two of the flags left, right or mid become True
        if (mid + left + right >= 2) {
            this.ans = currentNode;
        }

        // Return true if any one of the three bool values is True.
        return (mid + left + right > 0);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Traverse the tree
        this.recurseTree(root, p, q);
        return this.ans;
    }
}


// My solution, afther watching William fiset's intution.
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    ArrayList<Integer> depth = new ArrayList<>();
    ArrayList<Integer> nodes = new ArrayList<>();
    TreeNode ans;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        ans = root;
        eulerianPath(root,0);
        int i=0,j=0;
        for(int it=0;it<nodes.size();it++){
            if(nodes.get(it)==p.val) i=it;
            else if(nodes.get(it)==q.val) j=it;
        }
        int minLevel=Integer.MAX_VALUE;
        int minItr=0;
        if(i>j){
            int temp = i;
            i = j;
            j = temp;
        }
        System.out.println(i + " " + j);
        for(int s= i;s<=j;s++){
            if(minLevel > depth.get(s)){
                minLevel = depth.get(s);
                minItr=s;
            }
        }
        if(minLevel == Integer.MAX_VALUE) return root;
        int reqEle = nodes.get(minItr);
        lca(root, reqEle);
        return ans;
    }
    public void eulerianPath(TreeNode root, int d){
        if(root==null) return;
        if(root.left==null && root.right==null){
            nodes.add(root.val);
            depth.add(d);
            return;
        }
        nodes.add(root.val);
        depth.add(d);
        eulerianPath(root.left,d+1);
        nodes.add(root.val);
        depth.add(d);
        eulerianPath(root.right,d+1);
        nodes.add(root.val);
        depth.add(d);
    }
    
    public void lca(TreeNode root, int reqEle){
        if(root==null) return;
        if(root.val==reqEle) ans = root;
        lca(root.left, reqEle);
        lca(root.right, reqEle);
    }
}