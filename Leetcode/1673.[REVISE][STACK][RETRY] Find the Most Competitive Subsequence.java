// Best solution (author : poiuytrewq1as)
class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> st = new Stack();
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && nums[i] < st.peek() && st.size() + n - i > k)
                st.pop();
            if(st.size() < k)
                st.add(nums[i]);
        }
        
        return st.stream().mapToInt(x -> x).toArray();
    }
}








// indiaCoder's solution, same as above asaan shabdo mae
class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int noOfDElToBeRemoved = nums.length -k;
        Stack<Integer> st = new Stack<>();
        for(int el: nums){

            while(!st.empty() && noOfDElToBeRemoved>0 && st.peek()> el){
                st.pop();
                noOfDElToBeRemoved--;
            }

            st.push(el);
        }

        while(st.size()>k){
            st.pop();
        }

        int[] ans = new int[k];
        for(int i=k-1;i>=0;i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}