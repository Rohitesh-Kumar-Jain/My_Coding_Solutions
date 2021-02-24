class Solution {
    public int[] minOperations(String boxes) {
        char[] arr = boxes.toCharArray();
        int n= arr.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                if(arr[j]=='1'){
                    sum+= Math.abs(i-j);
                }
            }
            ans[i]=sum;
        }
        return ans;
    }
}