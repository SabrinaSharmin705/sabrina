package Examclass;

import java.util.Scanner;

public class Palindrone {
//If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM, DAD, and MADAM are palindromes.
// So write java code to check if a given String is Palindrome or not.
    public static void main(String[] args) {
        String str, rev = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        str = sc.nextLine();

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");





        String word = "MOM, DAD,MADAM";
        String reverse = "";
        for (int j = word.length() - 1; j >= 0; j--) {

            reverse = reverse + word.charAt(j);

        }
        System.out.println(reverse);

    }
}
