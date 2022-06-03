import java.util.Scanner;

public class PrintMultiplicationTable {


    public static void main(String[] args) {

        print();
        System.out.println("_____________________________________________");
       // print();

    }

    public static void print(){

        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String d = String.valueOf(a);
        String x = "x";
        int c = 1;

        for (int i = 1; i <= 12; i++ ){

            System.out.println(d + x + i + "=" + a * c );
            c++;
        }
    }


}
