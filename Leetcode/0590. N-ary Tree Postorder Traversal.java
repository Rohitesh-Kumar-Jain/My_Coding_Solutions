class Solution {
    List<Integer> ans = new LinkedList<>();
    public List<Integer> postorder(Node root) {
        pre(root);
        return ans;
    }
    public void pre(Node root){
        if(root==null) return;
        for(Node ch : root.children){
            pre(ch);
        }
        ans.add(root.val);
    }
}