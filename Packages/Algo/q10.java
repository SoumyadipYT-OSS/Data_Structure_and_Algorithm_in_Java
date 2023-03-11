package Algo;
import java.util.*;
/*  How to check if a given String is a palindrome? */
public class q10
{
    // method to check the string palindrome or not
    static void check_palindrome(String str) {
        StringBuilder yourString = new StringBuilder(str);
        yourString.reverse();
        String convertStr = yourString.toString();
        if (str.equals(convertStr)) {
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It is not a palindrome");
        }
    }

    // another method to check palindrome
    static boolean another_method_to_check_palindrome(String word) {
        char[] characterArray = word.toCharArray();
        int startIndex=0;
        int lastIndex=word.length()-1;
        while (startIndex<lastIndex) {
            if (characterArray[startIndex]!=characterArray[lastIndex]) {
                return false;
            }
            startIndex++;
            lastIndex--;
        }
        return true;
    }

    // main method
    @SuppressWarnings({"static-access"})
    public static void main(String[] args)
    {
        String myWord = "MADAM";
        q10 q = new q10();
        System.out.println("__Original String__");
        System.out.println("Word: "+myWord);
        q.check_palindrome(myWord);

        String anotherword = "FIFA";
        System.out.println("\n__Original String__");
        System.out.println("Word: "+anotherword);
        if (q.another_method_to_check_palindrome(anotherword)) {
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It is not a palindrome");
        }
    }
}