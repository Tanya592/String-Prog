//to shift each character by one
//abcd ip
// bcde op
//axy
//byz
class Shift{
public static void main(String args[]){
String str="axz";
String ans="";
for(int i=0;i<str.length();i++){
ans+= (char)(((int)str.charAt(i) + 1) % 26);
}
System.out.print(ans);
 }
}