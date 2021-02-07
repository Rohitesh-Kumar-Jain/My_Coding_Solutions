class Solution {
    public int minimumLength(String s) {
        char[] arr = s.toCharArray();
        int i=0, j=arr.length-1;
        while(i<j){
            if(arr[i]==arr[j]){
                char prev = arr[i];
                while(prev == arr[i] && i<j) i++;
                char suf = arr[j];
                if(i==j) return 0;
                while(suf == arr[j] && j>i) j--;
            }
            else{
                break;
            }
        }
        if(j-i+1 <= 0) return 0;
        return j-i+1;
    }
}