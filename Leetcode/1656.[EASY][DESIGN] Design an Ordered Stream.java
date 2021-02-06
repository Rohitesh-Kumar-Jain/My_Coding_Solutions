class OrderedStream {
    int i=0;
    String[] arr;
    Set<Integer> set = new HashSet<>();
    public OrderedStream(int n) {
        arr = new String[n];
    }
    
    public List<String> insert(int id, String value) {
        arr[id-1]=value;
        set.add(id-1);
        List<String> ans = new ArrayList<>();
        while(set.contains(i)){
            ans.add(arr[i]);
            i++;
        }
        return ans;
    }
}