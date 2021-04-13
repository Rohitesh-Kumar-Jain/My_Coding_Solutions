class Solution {
    Trie root;
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder sb = new StringBuilder();
        root = new Trie();
        for (String s : dictionary) {
            insert(s);
        }
        String[] words = sentence.split(" ");
        for (String word : words) {
            int d = search(word);
            sb.append(word.substring(0,d));
            sb.append(" ");
        }
        return sb.toString().substring(0,sb.length()-1);
    }
    
    public void insert(String s) {
        Trie cur = root;
        for (char ch : s.toCharArray()) {
            cur.children.putIfAbsent(ch , new Trie());
            cur = cur.children.get(ch);
        }
        cur.isWord = true;
    }
    
    public int search(String word) {
        Trie cur = root;
        int i = 0;
        for (char ch : word.toCharArray()) {
            if (cur.isWord) return i;
            if (cur.children.containsKey(ch)) {
                cur = cur.children.get(ch);
                i++;
            }
            else break;
        }
        if (cur.isWord) return i;
        else return word.length();
    }
}

class Trie {
    Map<Character, Trie> children = new HashMap<>();
    boolean isWord;
}