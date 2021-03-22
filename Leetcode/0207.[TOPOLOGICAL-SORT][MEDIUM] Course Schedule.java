class Solution {
    public boolean canFinish(int n, int[][] pre) {
        int[] indegree = new int[n];
        for(int[] dep : pre){
            indegree[dep[0]]++;   
        }
        Queue<Integer> q = new LinkedList<>();
        for(int it=0;it<n;it++){
            if(indegree[it]==0){
                q.offer(it);
            }
        }
        int index=0;
        while(!q.isEmpty()){
            int last = q.poll();
            index++;
            for(int[] dep: pre){
                if(indegree[dep[0]] >0 && last==dep[1]){
                    indegree[dep[0]]--;
                    if(indegree[dep[0]]==0){
                        q.offer(dep[0]);
                    }
                }
            }
        }
        return index==n;
    }
}