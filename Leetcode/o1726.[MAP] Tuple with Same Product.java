// boo-m's solutions
public int tupleSameProduct(int[] nums) {
    int res = 0;
    Map<Integer, Integer> mulFreq = new HashMap<>();
    for (int i=0;i<nums.length;i++) {
        for (int j=i+1;j<nums.length;j++) {
            int prod = nums[i] * nums[j];
            int c = mulFreq.getOrDefault(prod, 0);
            res+=c; //Number of valid pair of pairs.
            mulFreq.put(prod,  c+ 1);
        }
    }
    return res*8; //Each tuple [a,b,c,d] can be arranged in 8 different ways matching the criteria.
}