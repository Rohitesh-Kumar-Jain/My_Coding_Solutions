class Solution {
    public boolean checkPowersOfThree(int n) {
        Set<Integer> set = new HashSet<>();
        while(true){
            int a = (int)(Math.log(n)/Math.log(3));
            if(set.contains(a)) return false;
            set.add(a);
            n = n - (int)Math.pow(3,a);
            if(n==0) return true;
        }
    }
}