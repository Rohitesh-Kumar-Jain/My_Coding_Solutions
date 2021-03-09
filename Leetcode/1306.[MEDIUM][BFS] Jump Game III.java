class Solution {
    public boolean canReach(int[] arr, int start) {
        int n= arr.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(q.size()>0){
            int index = q.poll();
            if(visited[index]==false){
                visited[index]=true;
                if(arr[index]==0) return true;
                if(index - arr[index] >= 0) q.add(index - arr[index]);
                if(index + arr[index] < n)  q.add(index + arr[index]);
            }
        }
        return false;
    }
}