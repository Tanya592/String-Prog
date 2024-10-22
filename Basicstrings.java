import java.util.*;
class Basicstrings{
public static void main(String args[]){
//literal
String str="abc";
String str1="abc";
String str2="xyz";
//new se aaega heap memory m
//literal se string constant pool m aaega
String str3=new String("abc");
String str4=new String("abc");
String str5=new String("xyz");
System.out.println(str.equals(str1));
System.out.println(str.equals(str2));
System.out.println(str.equals(str3));
System.out.println(str.equals(str4));
System.out.println(str.equals(str5));
System.out.println(str==str1);
System.out.println(str==str2);
System.out.println(str==str3);
System.out.println(str3==str4);
System.out.println(str4==str5);
 }
}