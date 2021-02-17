class Solution {
    public int countHomogenous(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        long ans=0;
        long d = 1000000007;
        int n = arr.length;
        while(i<n){
            long len =1;
            while(i+1<n && arr[i]==arr[i+1]){
                len++;
                i++;
            }
            ans = ans + (len*(len+1))/2;
            i++;
        }
        ans = ans % d;
        return (int)ans;
    }
}


// lee's solution:
 public int countHomogenous(String s) {
        int res = 0, cur = 0, count = 0, mod = 1_000_000_007;
        for (int i = 0; i < s.length(); ++i) {
            count = s.charAt(i) == cur ? count + 1 : 1;
            cur = s.charAt(i);
            res = (res + count) % mod;
        }
        return res;
    }
