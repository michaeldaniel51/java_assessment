import java.util.Scanner;

public class AverageNumber {


    public static void main(String[] args) {


        System.out.println(average(200,100,500));

        average1();
    }



    public static int average(int a,int b,int c){

        int d = a + b + c;
        int e = d/3;
        return e;


    }

        public static void average1(){

            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number");
            int a = sc.nextInt();
            System.out.println("enter a second number");
            int b = sc.nextInt();
            System.out.println("enter a third number");
            int c = sc.nextInt();
            int d = (a + b + c) / 3;
            System.out.println("average no is = " + d);
            //return d;
        }
}
