class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            int[] arr = new int[26];
            for(int j=i; j<s.length(); j++){
                arr[s.charAt(j) - 'a']++;
                int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
                for(int n: arr){
                    if(n != 0){
                        max = Math.max(max, n);
                        min = Math.min(min, n);
                    }
                }
                ans = ans + max-min;
            }
        }
        return ans;
    }
}