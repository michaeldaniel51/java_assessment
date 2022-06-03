import java.util.Scanner;

public class CalculateBinaryNumbers {


    public static void main(String[] args) {

        binary();
     //   binary(50,71);

    }

    static void binary(){
        long binary1;
        long binary2;
        int i = 0;
       int remainder = 0;
       int[] sum = new int[20];
        Scanner in = new Scanner(System.in);

        System.out.println("input first binary: ");
       binary1 = in.nextLong();
        System.out.println("input second binary number: ");
        binary2 = in.nextLong();
       while(binary1 != 0 || binary2 != 0){

           sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
           remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
           binary1 = binary1 / 10;
           binary2 = binary2 /10;
       }
            if (remainder != 0){
                sum[i++] = remainder;
            }
            --i;
        System.out.println("sum of two binary numbers: ");
         while (i >= 0){
           System.out.println(sum[i--]);
       }
       // System.out.print("\n");
    }//100010     110010
}
