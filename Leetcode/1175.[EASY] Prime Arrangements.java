class Solution {
    long d = 1_000_000_007;
    
    public long fact(long num){
        long fac=1;
        for(int i=1;i<=num;i++){
            fac = i*fac;
            fac = fac%d;
        }
        return fac%d;
    }
    
    public int numPrimeArrangements(int n) {
        long pcount=0;
        boolean prime;
        for(long i=2;i<=n;i++){
            prime = true;
            for(long j=2;j*j<=i;j++){
                if(i%j==0){
                    prime = false;
                    break;
                }
            }
            if(prime==true) pcount++;
        }
        long ans = fact(pcount)*fact(n-pcount);
        ans = ans%d;
        return (int)ans;
    }
}