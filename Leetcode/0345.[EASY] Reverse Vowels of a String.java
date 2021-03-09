class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int n= s.length();
        char[] arr = new char[n];
        int i=0, j=n-1;
        while(i<=j){
            if(vowels.contains(s.charAt(i)) && vowels.contains(s.charAt(j))){
                arr[j] = s.charAt(i);
                arr[i] = s.charAt(j);
                i++;
                j--;
            }
            else if(vowels.contains(s.charAt(i))){
                while(!vowels.contains(s.charAt(j)) && i<=j){
                    arr[j] = s.charAt(j--);
                }
            }
            else if(vowels.contains(s.charAt(j))){
                while(!vowels.contains(s.charAt(i)) && i<=j){
                    arr[i] = s.charAt(i++);
                }
            }
            else{
                arr[i] = s.charAt(i++);
                arr[j] = s.charAt(j--);
            }
        }
        return new String(arr);
    }
}