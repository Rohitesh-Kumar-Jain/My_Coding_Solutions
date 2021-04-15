class Trie {

    /** Initialize your data structure here. */
    Trie[] children = new Trie[26];
    boolean isWord;
    char val;
    Trie root;
    public Trie(){
        root = new Trie(' ');
    }
    
    public Trie(char ch) {
        this.val = ch;
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie cur = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(cur.children[c-'a']==null){
                cur.children[c-'a'] = new Trie(c);
            }
            cur = cur.children[c-'a'];
        }
        cur.isWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie cur = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(cur.children[c-'a']==null) return false;
            cur = cur.children[c-'a'];
        }
        return cur.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String word) {
        Trie cur = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(cur.children[c-'a']==null) return false;
            cur = cur.children[c-'a'];
        }
        return true;
    }
}







// Implementation with HashMap

class Trie {
    TrieNode head;
    /** Initialize your data structure here. */   
    public Trie() {
        head = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(word == null)
            return;
        TrieNode node = head;
        for(char ch : word.toCharArray()) {
            if(!node.charToNode.containsKey(ch)){
                node.charToNode.put(ch, new TrieNode());
            }
            node = node.charToNode.get(ch);
        }
        node.isEnd = true;
       
        
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(word == null)
            return false;
        TrieNode node = head;
        for(char ch : word.toCharArray()) {
            if(!node.charToNode.containsKey(ch)){
                return false;
            } 
            node = node.charToNode.get(ch);
            
        }
        return node.isEnd;
        
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(prefix == null)
            return false;
        TrieNode node = head;
        for(char ch : prefix.toCharArray()) {
            if(!node.charToNode.containsKey(ch)){
                return false;
            } 
            node = node.charToNode.get(ch);
            
        }
        return true; 
        
    }
    
    class TrieNode{
        Map<Character, TrieNode> charToNode;
        boolean isEnd = false;
        public TrieNode(){
            charToNode = new HashMap();      
        }
        
        
    }
}


