class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int small = n/20;
        int sum=0;
        for(int i= small; i< n - small;i++){
            sum += arr[i];
        }
        return (double)sum/(n-2*small);
    }
}