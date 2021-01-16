// To right rotate an array/string by "b" you can:

String rightRotatedStringBy_b;
rightRotatedStringBy_b = s.substring(b) + s.substring(0, b);



// Another way could have been :


String s1 = reverse(s.substring(0, b));
String s2 = reverse(s.substring(b));
StringBuilder sb = new StringBuilder(s1+s2);
return sb.reverse().toString();
