package practice1;

public class Solution {


    public static void main(String args[])
    {
String str= "The length of last word";
System.out.println("Original string:"+str);
System.out.println("Length of last word:"+length_of_word(str));

    }


   public static int length_of_word(String str1)
   {
       int length_words=0;
       String[]  words= str1.split(" ");
       if (words.length >0)
       {
           length_words= words[words.length-1].length();
       }

       return length_words;

   }
}
