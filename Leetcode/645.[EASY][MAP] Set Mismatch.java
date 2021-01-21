class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int n=nums.length;
        int[] array = new int[n+1];
        for(int num :nums){
            array[num]++;   
        }  
        for(int i=1;i<=n;i++){
            if(array[i]==0) ans[1]=i;
            else if(array[i]==2) ans[0]=i;
        }
        return ans;
    }
}


// lee's solution

  public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> s = new HashSet<>();
        for (int i = 1; i < bound; i *= x) {
            for (int j = 1; i + j <= bound; j *= y) {
                s.add(i + j);
                if (y == 1) break;
            }
            if (x == 1) break;
        }
        return new ArrayList<>(s);
    }