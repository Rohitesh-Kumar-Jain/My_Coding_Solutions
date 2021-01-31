class Solution {
    public String maximumTime(String time) {
        char[] arr = time.toCharArray();
        if(arr[0]=='?'){
            if(arr[1] - '0' >= 4 && arr[1]!='?') arr[0]='1';
            else arr[0]='2';
            if(arr[1]=='?') arr[1]='3';
        }
        if(arr[0]=='2'){
            if(arr[1]=='?') arr[1]='3';
        }
        else{
            if(arr[1]=='?') arr[1]='9';
        }
        if(arr[3]=='?') arr[3]='5';
        if(arr[4]=='?') arr[4]='9';
        
        String s = new String(arr);
        return s;
    }
}