// My java solution: 
class Solution {
    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        for(char ch: S.toCharArray()){
            if(sb.length()>0 && sb.charAt(sb.length()-1)==ch) sb.deleteCharAt(sb.length()-1);
            else sb.append(ch);
        }
        return sb.toString();
    }
}



// lee215's 2 pointer approach. 



