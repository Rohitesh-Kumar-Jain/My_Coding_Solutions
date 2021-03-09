class Solution {
    public int openLock(String[] deadends, String target) {
        int ans=-1;
        boolean[] visited = new boolean[10000];
        for(String s : deadends){
            int d = Integer.parseInt(s);
            visited[d] = true;
        }
        int t = Integer.parseInt(target);
        Queue<Integer> q = new LinkedList<>();
        q.add(0000);
        while(q.size()>0){
            int l= q.size();
            ans++;
            for(int i=0;i<l;i++){
                int d = q.poll();
                if(visited[d]==true) continue;
                if(d==t) return ans;
                visited[d] = true;
                int d4 = d%10; d=d/10;
                int d3 = d%10; d=d/10;
                int d2 = d%10; d=d/10;
                int d1 = d%10;
                
                int nd4 = d1*1000 + d2*100 + d3*10 + (d4+1)%10;
                int nd3 = d1*1000 + d2*100 + ((d3+1)%10)*10 +d4;
                int nd2 = d1*1000 + ((d2+1)%10)*100 + d3*10 + d4;
                int nd1 = ((d1+1)%10)*1000 + d2*100 + d3*10 + d4;
                if(visited[nd4]==false) q.add(nd4);
                if(visited[nd3]==false) q.add(nd3);
                if(visited[nd2]==false) q.add(nd2);
                if(visited[nd1]==false) q.add(nd1);
                
                int dd4 = (d4-1)%10;
                if(dd4 < 0) dd4 = 10 + dd4;
                int nnd4 = d1*1000 + d2*100 + d3*10 + dd4;
                
                int dd3 = ((d3-1)%10)*10;
                if(dd3 < 0) dd3 = 100 + dd3;
                int nnd3 = d1*1000 + d2*100 + dd3 +d4;
                
                int dd2 = ((d2-1)%10)*100;
                if(dd2 < 0) dd2 = 1000 + dd2;
                int nnd2 = d1*1000 + dd2 + d3*10 + d4;
                
                int dd1 = ((d1-1)%10)*1000;
                if(dd1 < 0) dd1 = 10000 + dd1;
                int nnd1 = dd1 + d2*100 + d3*10 + d4;
                
                if(visited[nnd4]==false) q.add(nnd4);
                if(visited[nnd3]==false) q.add(nnd3);
                if(visited[nnd2]==false) q.add(nnd2);
                if(visited[nnd1]==false) q.add(nnd1);
            }
        }
        return -1;
    }
}