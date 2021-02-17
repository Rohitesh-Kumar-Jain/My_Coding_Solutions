class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            mini = Math.min(mini,arr[i+1]-arr[i]);
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==mini){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i+1]);
                ans.add(list);
            }
        }
        return ans;
    }
}