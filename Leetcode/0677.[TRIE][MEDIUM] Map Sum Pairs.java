class MapSum {
    Trie root;
    Map<String, Integer> map = new HashMap<>();
    /** Initialize your data structure here. */
    public MapSum() {
        root = new Trie(' ');
    }
    
    public void insert(String key, int val) {
        int overRide = 0;
        if (map.containsKey(key)) {
            overRide = map.get(key);
            map.put(key, val);
        } else {
            map.put(key, val);
        }
        Trie cur = root;
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            cur.value += val - overRide;
            if (cur.children[ch - 'a'] == null) {
                cur.children[ch - 'a'] = new Trie(ch);
            }
            cur = cur.children[ch - 'a'];
        }
        cur.value += val - overRide;
    }
    
    public int sum(String prefix) {
        Trie cur = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (cur.children[ch - 'a'] == null) {
                return 0;
            }
            cur = cur.children[ch - 'a'];
        }
        return cur.value;
    }
}

class Trie {
    Trie[] children = new Trie[26];
    char letter;
    int value;
    
    Trie (char letter) {
        this.letter = letter;
    }
}




// More concise solution in Solution section:
class MapSum {
    HashMap<String, Integer> map;
    TrieNode root;
    public MapSum() {
        map = new HashMap();
        root = new TrieNode();
    }
    public void insert(String key, int val) {
        int delta = val - map.getOrDefault(key, 0);
        map.put(key, val);
        TrieNode cur = root;
        cur.score += delta;
        for (char c: key.toCharArray()) {
            cur.children.putIfAbsent(c, new TrieNode());
            cur = cur.children.get(c);
            cur.score += delta;
        }
    }
    public int sum(String prefix) {
        TrieNode cur = root;
        for (char c: prefix.toCharArray()) {
            cur = cur.children.get(c);
            if (cur == null) return 0;
        }
        return cur.score;
    }
}
class TrieNode {
    Map<Character, TrieNode> children = new HashMap();
    int score;
}