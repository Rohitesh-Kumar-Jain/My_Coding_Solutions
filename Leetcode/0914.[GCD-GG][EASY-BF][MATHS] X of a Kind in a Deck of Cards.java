// lee215's solution. 
class Solution {
     public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> count = new HashMap<>();
        int res = 0;
        for (int i : deck) count.put(i, count.getOrDefault(i, 0) + 1);
        for (int i : count.values()) res = gcd(i, res);
        return res > 1;
    }

    public int gcd(int i, int res) {
        return res > 0 ? gcd(res, i % res) : i;
    }
}

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int n = deck.length;
        int flag=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: deck){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        if(map.values().size() == 1 && n>1) return true;
        for(int i=n/2;i>1;i--){
            if(flag==1) return true;
            for(int val : map.values()){
                if(val%i!=0){
                    flag=0;
                    break;
                }
                else flag = 1;
            }
        }
        if(flag==1) return true;
        return false;
    }
}