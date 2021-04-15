


eg: 914. X of a Kind in a Deck of Cards

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