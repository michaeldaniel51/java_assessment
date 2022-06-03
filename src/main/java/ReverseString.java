import java.util.ArrayList;
import java.util.Arrays;

public class ReverseString {

    public static void something(String word){


        char[] sam = word.toCharArray();
        for (int i = word.length()-1; i >= 0;i--){
            System.out.println(sam[i]);
        }

        System.out.println(sam);


//        StringBuilder s = new StringBuilder(word);
//       StringBuilder t = s.reverse();
//        String chars = String.valueOf(t);
//        char [] r = chars.toCharArray();
//
//        for (char d:r) {
//
//            System.out.println(d);
//
//        }
//
//        System.out.println(r);
    }

    public static void main(String[] args) {
        ReverseString.something("abeg i don day go house");

//        String a = "babu";
//        System.out.println(a - 1);

    }










}
