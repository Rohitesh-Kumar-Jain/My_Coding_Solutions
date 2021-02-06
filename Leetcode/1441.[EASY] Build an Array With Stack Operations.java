class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<String>();
        int j=0;
        for(int i=1;i<=n;i++){
            if(j<target.length){
                if(i==target[j]){
                    list.add("Push");
                    j++;
                }
                else{
                    list.add("Push");
                    list.add("Pop");
                }
            }
            else break;
        }
        return list;
    }
}