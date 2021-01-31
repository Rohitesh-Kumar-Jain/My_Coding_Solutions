public boolean closeStrings(String word1, String word2) {
        int n1= word1.length();
        int n2= word2.length();
        if(n1!=n2) return false;
        
        int [] freqArr1 = new int[26];              // Arrays to store the frequency of a particular character in the Strings. 
        int [] freqArr2 = new int[26];
        
        Set<Character> set1 = new HashSet<>();       // To check wheather the two strings contains same character or not, without having same characters two strings can't be close. 
        
        for(char ch : word1.toCharArray()){
            set1.add(ch);
        }
        for(char ch : word2.toCharArray()){
            if(!set1.contains(ch)) return false;
        }
        
        Map<Integer,Integer> freqMap1 = new HashMap<>();        // This is to keep track of the count of the frequency of the characters. 
        Map<Integer,Integer> freqMap2 = new HashMap<>();
        
        for(int i=0;i<n1;i++){
            freqArr1[word1.charAt(i) - 'a']++;        // calculating frequency of each character in both the Strings.
            freqArr2[word2.charAt(i) - 'a']++;
        }
        
        for(int i=0;i<26;i++){
            freqMap1.put(freqArr1[i], freqMap1.getOrDefault(freqArr1[i],0)+1);     //counting the frequncy of the characters. 
            freqMap2.put(freqArr2[i], freqMap2.getOrDefault(freqArr2[i],0)+1);
        }
        
        if(freqMap2.equals(freqMap1)) return true;     
        return false;
    }