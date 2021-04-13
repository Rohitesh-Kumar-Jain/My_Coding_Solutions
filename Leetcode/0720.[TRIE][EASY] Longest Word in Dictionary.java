class Solution {
    int longestLen;
    StringBuilder longestWord = new StringBuilder();
    Trie root;
    public String longestWord(String[] words) {
        root = new Trie(' ');
        root.isWord = true;
        for (String word : words) {
            addWord(word);
        }
        StringBuilder sb = new StringBuilder();
        findLongest(root,sb);
        return longestWord.toString().substring(1);
    }
    
    public void addWord(String word) {
        Trie cur = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (cur.children[ch - 'a'] == null) {
                cur.children[ch - 'a'] = new Trie(ch);
            }
            cur = cur.children[ch - 'a'];
        }
        cur.isWord = true;
    }
    
    public void findLongest(Trie cur, StringBuilder sb) {
        if (cur == null) return;
        if(cur.isWord) sb.append(cur.value);
        if (sb.length() > longestWord.length()) {
            longestWord = sb;
        }
        for (int i = 0; i < 26; i++) {
            if (cur.children[i]!=null) {
                if(cur.isWord) findLongest(cur.children[i], new StringBuilder (sb));
            }
        }
    }
}

class Trie {
    Trie[] children = new Trie[26];
    char value;
    boolean isWord;
    
    Trie (char value) {
        this.value = value;
    }
}