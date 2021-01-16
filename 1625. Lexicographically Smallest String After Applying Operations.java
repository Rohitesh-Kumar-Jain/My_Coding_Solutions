   // This solution is't mine solution, I have copied it from [rock](https://leetcode.com/problems/lexicographically-smallest-string-after-applying-operations/discuss/899511/JavaPython-3-BFS-and-DFS-w-brief-explanation-and-analysis.)
   
   // DFS 
   private String smallest;
    public String findLexSmallestString(String s, int a, int b) {
        smallest = s;
        dfs(s, a, b, new HashSet<>());
        return smallest;
    }
    private void dfs(String s, int a, int b, Set<String> seen) {
        if (seen.add(s)) {
            if (smallest.compareTo(s) > 0) {
                smallest = s;
            }
            char[] ca = s.toCharArray();
            for (int i = 1; i < ca.length; i += 2) {
                ca[i] = (char)((ca[i] - '0' + a) % 10 + '0');
            }
            dfs(String.valueOf(ca), a, b, seen);
            dfs(s.substring(b) + s.substring(0, b), a, b, seen);
        }
    }

   
   //BFS 
    public String findLexSmallestString(String s, int a, int b) {
        int n = s.length();
        String smallest = s;
        Queue<String> q = new LinkedList<>();
        q.offer(s);
        Set<String> seen = new HashSet<>(q);
        while (!q.isEmpty()) {
            String cur = q.poll();
            if (smallest.compareTo(cur) > 0)
                smallest = cur;
            char[] ca = cur.toCharArray();
            for (int i = 1; i < ca.length; i += 2) // add operation.
                ca[i] = (char)((ca[i] - '0' + a) % 10 + '0');
            String addA = String.valueOf(ca);
            if (seen.add(addA))
                q.offer(addA);
            String rotate = cur.substring(n - b) + cur.substring(0, n - b); // rotation.
            if (seen.add(rotate))
                q.offer(rotate);
        }
        return smallest;
    }
