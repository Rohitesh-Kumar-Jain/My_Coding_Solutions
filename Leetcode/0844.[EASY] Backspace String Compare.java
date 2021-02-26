class Solution { 
    public Stack<Character> stackCreate(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '#' && stack.size() >0) stack.pop(); 
            else if(ch!='#') stack.push(ch);
        }
        return stack;
    }

    public boolean backspaceCompare(String S, String T) {
            return stackCreate(S).equals(stackCreate(T));
    }
}
