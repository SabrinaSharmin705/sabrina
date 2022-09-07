package abstraction;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
//        String word = "My name is sabrina";
//        String reverse = "";
//
//        for (int i=word.length()-1;  i >= 0; i--){
//
//           reverse=reverse + word.charAt(i);
//
//        }
//        System.out.println(reverse);






        String word ="My name is shamim";
        String reverse ="";
        for(int i=word.length()-1;i>=0;i--) {
            reverse = reverse + word.charAt(i);
        }
        System.out.println(reverse);
    }
}
