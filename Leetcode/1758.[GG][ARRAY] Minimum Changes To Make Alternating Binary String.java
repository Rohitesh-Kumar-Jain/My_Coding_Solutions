class Solution {
    public int minOperations(String s) {
        char[] arr = s.toCharArray();
        int ans0=0; int ans1=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                if(arr[i]=='0') ans1++;
                else ans0++;
            }
            else{
                if(arr[i]=='1') ans1++;
                else ans0++;
            }
        }
        return Math.min(ans0,ans1);
    }
}

// lee215's solution:
public int minOperations(String s) {
        int res = 0, n = s.length();
        for (int i = 0; i < n; ++i)
            if (s.charAt(i) - '0' != i % 2)
                res++;
        return Math.min(res, n - res);
    }