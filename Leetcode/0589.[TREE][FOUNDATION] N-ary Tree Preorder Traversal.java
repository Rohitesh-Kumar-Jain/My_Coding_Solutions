class Solution {
    List<Integer> ans = new LinkedList<>();
    public List<Integer> preorder(Node root) {
        pre(root);
        return ans;
    }
    public void pre(Node root){
        if(root==null) return;
        ans.add(root.val);
        for(Node ch : root.children){
            pre(ch);
        }
    }
}