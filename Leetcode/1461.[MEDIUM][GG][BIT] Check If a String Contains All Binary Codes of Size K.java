class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> bcode = new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
            bcode.add(s.substring(i,i+k));
        }
        if(bcode.size() >= (int)Math.pow(2,k)) return true;
        return false;
    }
}



// Here's the GG solution of the Article: 
// https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/solution/
class Solution {
    public static boolean hasAllCodes(String s, int k) {
        int need = 1 << k;
        boolean[] got = new boolean[need];
        int allOne = need - 1;
        int hashVal = 0;

        for (int i = 0; i < s.length(); i++) {
            // calculate hash for s.substr(i-k+1,i+1)
            hashVal = ((hashVal << 1) & allOne) | (s.charAt(i) - '0');
            // hash only available when i-k+1 > 0
            if (i >= k - 1 && !got[hashVal]) {
                got[hashVal] = true;
                need--;
                if (need == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}