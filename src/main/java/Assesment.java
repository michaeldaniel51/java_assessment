import java.util.Arrays;

public class Assesment {


    public static void encrypt(String textToEncrypt){

        int[] newInt= new int[textToEncrypt.length()];
        char[] chars = textToEncrypt.toUpperCase().toCharArray();
        for (int i=0;i<chars.length;i++){

            newInt[i]= chars[i]-64;

        }
      //  System.out.println(Arrays.toString(newInt));

        StringBuilder hashValue= new StringBuilder();

        String E = "";
        for (int num : newInt) {

            if (isEven(num)){
                E += "e" + ( num / 2 );
            }else {
                E += "o" + ( num * 3 + 1 );
            }
//            if (isEven(num)){
//                hashValue.append("e").append(num / 2);
//            }else {
//                hashValue.append("o").append(num * 3 + 1);
//
//            }
        }
       // o10o46o64o58o4e7e10
        System.out.println(E);
        //System.out.println(hashValue.toString());
    }

    public static boolean isEven(int n){

        return n % 2 == 0;
    }

    public static void main(String[] args) {

        Assesment.encrypt("cousant");

    }




}
