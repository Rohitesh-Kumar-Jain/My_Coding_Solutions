class Solution {
    public static int n;
    public static boolean[] opened;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        n=rooms.size();
        opened = new boolean[n];
        
        dfs(0,rooms.get(0),rooms);
        
        for(int i=0;i<opened.length;i++){
            if(opened[i]==false) return false;
        }
        return true;
    }
    
    public void dfs(int room,List<Integer> keys, List<List<Integer>> rooms){
        if(opened[room]==true) return;
        opened[room]=true;
        for(int key : keys){
            dfs(key,rooms.get(key),rooms);
        }
    }
}
