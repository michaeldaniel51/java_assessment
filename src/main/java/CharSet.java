import java.nio.charset.Charset;
import java.util.Arrays;

public class CharSet {

    //program that prints out different charset

    public static void main(String[] args) {

        System.out.println("list of charset ");

        String [] str = Charset.availableCharsets().keySet().toArray(new String[0]);
        for (int i =0; i < str.length ;i++){
            System.out.println(str[i]);
        }

//        for (String str: Charset.availableCharsets().keySet()) {
//            System.out.println(str);
//        }
    }


}
