class Solution {
    public int reverse(int x) {
        try{
            StringBuilder sb = new StringBuilder();
            int t = Math.abs(x);
            if(x == 0) return 0;
            while(t > 0){
                sb.append(t%10);
                t=t/10;
            }
            int ans=0;
            ans = Integer.parseInt(sb.toString());
            return x > 0 ? ans : -ans;
        }
        catch(NumberFormatException ex){
            return 0;
        }
    }
}