// Solution 

class Solution {
    public int[] shortestToChar(String S, char C) {
        int N = S.length();
        int[] ans = new int[N];
        int prev = Integer.MIN_VALUE / 2;

        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == C) prev = i;
            ans[i] = i - prev;
        }

        prev = Integer.MAX_VALUE / 2;
        for (int i = N-1; i >= 0; --i) {
            if (S.charAt(i) == C) prev = i;
            ans[i] = Math.min(ans[i], prev - i);
        }

        return ans;
    }
}



// My cringy solution:
class Solution {
    public int[] shortestToChar(String S, char C) {
        int n = S.length();
        int[] ans = new int[n];
        int right=0,left=0;
        boolean flag1,flag2;
        for(int i=0;i<n;i++){
            left=0;
            right=0;
            flag1 =false;
            flag2 = false;
            for(int j=i;j<n;j++){
                if(S.charAt(j)==C){
                    flag1 = true;
                    break;
                }
                else right++;
            }
            for(int j=i;j>=0;j--){
                if(S.charAt(j)==C){
                    flag2= true;
                    break;
                }
                else left++;
            }
            if(flag1 && flag2){
                ans[i]= Math.min(right,left);
            }
            else if(flag1){
                ans[i]= right;
            }
            else ans[i]= left;
            
        }
        return ans;
    }
}
