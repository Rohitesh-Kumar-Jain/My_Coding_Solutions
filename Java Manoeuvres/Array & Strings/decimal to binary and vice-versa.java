/**
* The best way to convert an integer to it's binary representation is 
*/

 String binaryRep= Integer.toBinaryString(num);

 /*


 // and now we want to convert that string back to integer decimal than 


 for(char ch : binaryRep.toCharArray()){
        int val= (ch=='0')?0:1;
   		newNo= ((newNo*2)+ val);
     }