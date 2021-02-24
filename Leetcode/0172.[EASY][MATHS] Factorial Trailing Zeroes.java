class Solution {
    public int trailingZeroes(int n) {
        int ans=0;
        for(int i=5;i<=n;i=i+5){
            int num =i;
            while(num%5 ==0){
                ans++;
                num=num/5;
            }
        }
        return ans;
    }
}

// Better Solution: 
public class Solution {
    public int trailingZeroes(int n) {
        int cnt = 0;
        while(n>0){
            cnt += n/5;
            n/=5;
        }
        return cnt;
    }
}


// one liner, same idea as of above
 return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);