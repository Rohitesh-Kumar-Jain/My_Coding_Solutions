class Solution {
    public int largestPerimeter(int[] A) {
        A = Arrays.stream(A).boxed()
            .sorted(Collections.reverseOrder())
            .mapToInt(Integer::intValue)
            .toArray();
        int i=0;
        int n = A.length;
        while(i < n-2){
            if(A[i] < A[i+1] + A[i+2]){
                return A[i] + A[i+1] + A[i+2];
            }
            else{
                i++;
            }
        }
        return 0;
    }
}