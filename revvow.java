import java.io.*;
import java.util.*;
class revvow
{
public static void main(String args[])
{
String s="ReverseMe";
String rev=new StringBbuffer(s).reverse().toString();
System.out.println(rev);
String vowel=rev.replaceAll("[aeiouAEIOU]","");
System.out.println(vowel);
}
}
