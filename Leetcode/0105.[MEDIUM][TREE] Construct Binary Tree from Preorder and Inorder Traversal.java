class Solution {
    int pindex =0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        return build(inorder,0,n-1,preorder);
    }
    public TreeNode build(int[] inorder, int is, int ie, int[] preorder){
        if(is>ie){
            pindex--;
            return null;
        }
        TreeNode head = new TreeNode(preorder[pindex]);
        int index=-1;
        for(int i=is;i<=ie;i++){
            if(inorder[i]==head.val){
                index = i;
            }
        }
        pindex++;
        head.left = build(inorder,is,index-1,preorder);
        pindex++;
        head.right = build(inorder,index+1,ie,preorder);
        return head;
    }
}